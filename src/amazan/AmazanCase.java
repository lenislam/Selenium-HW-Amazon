package amazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazanCase {

    public WebDriver amzDriver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib\\browser\\chromedriver.exe";
    public String url = "https://www.amazon.com/";
    public String signInurl = "";
    public String actualHomePageText = "//*[@id=\"nav-logo\"]/a/span[1]";
    public String expectedText = "\"Amazan Logo\"";

    @BeforeMethod
    public void welcome(){System.out.println("Welcome to Amazon Automation World");}

    public void lounchBrowser(String driverUrl,String driverPath,String signInurl){
        //for chromeBrowser
        System.setProperty(driverUrl,driverPath);
        amzDriver = new ChromeDriver();
        amzDriver.get(signInurl);
    }
    public void setup(String driverUrl, String driverPath,String url){
        System.setProperty(driverUrl, driverPath);
        amzDriver = new ChromeDriver();
        amzDriver.get(url);
    }
    @AfterMethod
    public void closeBrowser(){
        amzDriver.close();
    }
public void homePage() throws InterruptedException {
    setup(chromeDriver,chromeDriverPath,url);
//  amzDriver.manage().window().fullscreen();
    Thread.sleep(3000);
    amzDriver.findElement(By.xpath(actualHomePageText)).getText();
    String actualText=amzDriver.findElement(By.xpath(actualHomePageText)).getText();
//  Assert.assertEquals(actualText,expectedText);
    Thread.sleep(3000);
}


}
