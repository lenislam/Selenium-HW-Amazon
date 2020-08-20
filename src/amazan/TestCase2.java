package amazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase2 {

 //  #Search box functionality test: Pass
//    Open Chrome browser: Pass
//    Enter amazon url in address bar and hit enter: Pass
//    Click on search box: Pass
//    Enter Hand sanitizer: Pass
//    Click on search button: pass
//    Verify Hand sanitizer is displayed properly: Pass
//    ExpectedResult: Hand sanitizer should display properly
//    ActualResult: Hand sanitizer display properly
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib\\browser\\chromedriver.exe";
        String url="https://www.amazon.com/";
        String bestSellers="//*[@id=\"nav-xshop\"]/a[1]";
        String productSearch="smart Speaker";
//        String logoButton="//*[@id=\"global-search-submit\"]/span/img";
        String smartSpeakerActualText="//*[@id=\"zg_left_col1\"]/div[2]/div[3]/div/div[2]/a/div[1]/img";
        String ecpectedText= "\"Echo Dot (3rd Gen) - Smart speaker with Alexa - Charcoal\"";



        System.setProperty(chromeDriver, chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//        driver.findElement(By.xpath(bestSellers));
        driver.findElement(By.xpath(bestSellers)).click();
        driver.findElement(By.xpath(bestSellers)).sendKeys(productSearch);
        Thread.sleep(3000);
        driver.findElement(By.xpath(smartSpeakerActualText)).getText();
        Assert.assertEquals(smartSpeakerActualText,ecpectedText);
        Thread.sleep(3000);
        driver.close();
    }
//    @AfterMethod
//    public void driverClose(){
//        driver.close();
    }

