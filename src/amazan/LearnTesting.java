package amazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnTesting {
    public static void main(String[] args) throws InterruptedException {

        String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib\\browser\\chromedriver.exe";
        String url = "https://www.amazon.com/";
        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
        String productName="samsungs10";
        String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
        String samsungs10ActualText="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span";
        String expecteedText = "\"Samsung Galaxy S10+ Factory Unlocked Android Cell Phone | US Version | 128GB of Storage | Fingerprint ID and Facial Recognition | Long-Lasting Battery | U.S. Warranty | Prism Blue\"";


        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//        driver.manage().window().fullscreen();
        driver.findElement(By.xpath(searchBox)).sendKeys(productName);
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);
//        driver.findElement(By.xpath(samsungs10ActualText)).getText();
        Assert.assertEquals(samsungs10ActualText,expecteedText);
        Thread.sleep(3000);
        driver.close();
    }
}
