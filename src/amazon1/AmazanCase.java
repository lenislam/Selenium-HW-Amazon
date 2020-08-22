package amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AmazanCase {

    WebDriver amzDriver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib\\browser\\chromedriver.exe";
    public String url = "https://www.amazon.com/";
    public String url1 = "https://www.amazon.com/gp/browse.html?node=16115931011&ref_=nav_cs_registry";
    public String url2 = "https://www.amazon.com/wedding";
    public String actualHomePageText = "//*[@id=\"nav-logo\"]/a/span[1]";
    public String expectedText = "\"Amazan Logo\"";

    //    @BeforeMethod
//    public void driverStartUp(){
//        System.setProperty("webdriver.chrome.driver","lib\\browser\\chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.navigate().to("https://www.amazon.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//    }
    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to Amazon Automation World");
    }

    public void lounchBrowser(String driverUrl, String driverPath, String url1) {
        //for chromeBrowser
        System.setProperty(driverUrl, driverPath);
        amzDriver = new ChromeDriver();
        amzDriver.get(url1);
    }

    public void lounchBrowser1(String driverUrl, String driverPath, String url2) {
        System.setProperty(driverUrl, driverPath);
        amzDriver = new ChromeDriver();
        amzDriver.get(url2);
    }

    public void setup(String driverUrl, String driverPath, String url) {
        System.setProperty(driverUrl, driverPath);
        amzDriver = new ChromeDriver();
        amzDriver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        amzDriver.close();
    }

    //Test case # 01
    public void homePage() throws InterruptedException {
        setup(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
    }

    //Test Case # 02
    public void sellButton() throws InterruptedException {
        System.setProperty(chromeDriver, chromeDriverPath);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
        Thread.sleep(3000);
    }

    //Test Case # 3
    public void freeShippingButton() throws InterruptedException {
        setup(chromeDriver, chromeDriverPath, url);
        amzDriver.manage().window().fullscreen();
        amzDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        Thread.sleep(3000);
    }
/* Test case-4 FAILED
#Test Free Shipping Tab Functionality test
• Open Chrome browser: Pass
• Enter amazon home page url in address bar hit enter : Pass
• Click on Try sell button : Pass
• Verify Try sell button displayed properly */

    String freeShipping1 = "//*[@id=\"nav-xshop\"]/a[8]";
    String productName = "Start Shopping";
    String startShopping = "//*[@id=\"contentGrid_346528\"]/div/div[3]/div/div/div/a/img";

    ////        String ActualText="//*[@id=\"nav-swmslot\"]/a";
////        String ecpectedText= "\"Free Shipping landed page\"";
    public void starShoppingtButton() throws InterruptedException {
        setup(chromeDriver, chromeDriverPath, url);
        amzDriver.manage().window().fullscreen();
        amzDriver.findElement(By.xpath(freeShipping1)).sendKeys(productName);
        amzDriver.findElement(By.xpath(startShopping)).click();
        Thread.sleep(3000);
    }

    //Test Case # 05
    String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
    String searchElement = "Wedding Registry";
    String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";
//        String ActualText="//*[@id=\"nav-swmslot\"]/a";
//        String ecpectedText= "\" Shipping landed page\"";

    public void weddingRegistry() throws InterruptedException {
        lounchBrowser(chromeDriver, chromeDriverPath, url1);
        amzDriver.findElement(By.xpath(searchBox)).sendKeys(searchElement);
        amzDriver.findElement(By.xpath(searchButton)).click();
//        driver2.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    String createButton = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[1]/div/a";

    //     String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void shipping() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.findElement(By.xpath(createButton)).click();
        Thread.sleep(5000);
    }

    //Test Case # 07
    String roundLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[1]/a/img";

    //      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void roundLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.findElement(By.xpath(roundLogo)).click();
        Thread.sleep(5000);
    }

    //Test Case # 08
    String giftBoxLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[2]/a/img";

    //      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void giftBoxLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.findElement(By.xpath(giftBoxLogo)).click();
        Thread.sleep(5000);
    }

    //Test Case # 09
    String percentageLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[3]/a/img";

    //      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void percentageLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(percentageLogo)).click();
        Thread.sleep(5000);
    }

    //Test Case # 10
    String boxAndHandLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[4]/a/img";

    //      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void boxAndHandLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(boxAndHandLogo)).click();
        Thread.sleep(5000);
    }

    // Test case # 11
    String tHLSelectionLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[1]/a/div[1]";

    //      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void tHLSelectionLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(tHLSelectionLine)).click();
        Thread.sleep(5000);
    }

    //Test case # 12
    String upTo20OffLine = "/html/body/div[1]/div[2]/div/div/div/div[3]/div/div[2]/a/div[1]";

    //      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";
    public void upTo20OffLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(upTo20OffLine)).click();
        Thread.sleep(5000);
    }

    // Test case # 13
    String fastFreeLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[3]/a/div[1]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void fastFreeLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(fastFreeLine)).click();
        Thread.sleep(5000);
    }

    // Test case # 14
    String easyReturnsLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[4]/a/div[1]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void easyReturnsLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(easyReturnsLine)).click();
        Thread.sleep(5000);
    }

    // Test case # 15
    String findRegistryBox = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/input[1]";
    String findName = "Mujahid";
    String arrowButton = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/button/div/div[2]";
    String ActualText = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[1]/div/div/div/div/a/img";
    String expecteedText = "\"Wedding Registry page displayed\"";

    public void findRegistryBox() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.findElement(By.xpath(findRegistryBox)).sendKeys(findName);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(arrowButton)).click();
        Thread.sleep(3000);
    }

    // Test case # 16
    String weddingLogo = "//*[@id=\"a-page\"]/nav/a/img";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void weddingLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(weddingLogo)).click();
        Thread.sleep(5000);
    }

    // Test case # 17
    String roomsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[1]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void roomsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(roomsTabBar)).click();
        Thread.sleep(5000);
    }

    // Test case # 18
    String categoriesTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[2]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void categoriesTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(categoriesTabBar)).click();
//      driver16.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 19
    String hobbiesTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[3]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void hobbiesTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(hobbiesTabBar)).click();
        Thread.sleep(5000);
    }

    // Test case # 20
    String brandsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[4]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void brandsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(brandsTabBar)).click();
//      driver18.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 21
    String popularGiftsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[5]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void popularGiftsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(popularGiftsTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 22
    String giftAdvisorTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[6]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void giftAdvisorTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 23
    String yourRegistryTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[1]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void yourRegistryTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 24
    String findARegistryTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[2]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void findARegistryTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 25
    String shareTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[3]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void shareTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 26
    String thankYouListTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[4]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void thankYouListTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 27
    String settingsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[5]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void settingsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

    // Test case # 28
    String helpTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[6]";
//      String ActualText="//*[@id=\"nav-swmslot\"]/a";
//      String ecpectedText= "\" Shipping landed page\"";

    public void helpTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        amzDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        amzDriver.findElement(By.xpath("//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[6]")).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }

}
