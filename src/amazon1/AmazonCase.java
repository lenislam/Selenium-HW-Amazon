package amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AmazonCase {

    WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib\\browser\\chromedriver.exe";
    public String url = "https://www.amazon.com/";
    public String url1 = "https://www.amazon.com/gp/browse.html?node=16115931011&ref_=nav_cs_registry";
    public String url2 = "https://www.amazon.com/wedding";
    public String actualHomePageText = "//*[@id=\"nav-logo\"]/a/span[1]";
    public String expectedText = "\"Amazan Logo\"";

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to Amazon Automation World");
    }

    public void lounchBrowser(String driverUrl, String driverPath, String url1) {
        //for chromeBrowser
        System.setProperty(driverUrl, driverPath);
        driver = new ChromeDriver();
        driver.get(url1);
        driver.manage().window().fullscreen();
    }

    public void lounchBrowser1(String driverUrl, String driverPath, String url2) {
        System.setProperty(driverUrl, driverPath);
        driver = new ChromeDriver();
        driver.get(url2);
        driver.manage().window().fullscreen();
    }

    public void setup(String driverUrl, String driverPath, String url) {
        System.setProperty(driverUrl, driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

/* Test case-1
#Home page Functionality test
• Open Chrome browser: Pass
• Enter amazon home page url in address bar hit enter : Pass
• Verify home page displayed properly */

        public void homePage() throws InterruptedException {
        setup(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
    }
/* Test case-2
#Test Sell Tab Functionality test
• Open Chrome browser: Pass
• Enter amazon home page url in address bar hit enter : Pass
• Click on Try sell button : Pass
• Verify sell page displayed properly */

        public void sellButton() throws InterruptedException {
        System.setProperty(chromeDriver, chromeDriverPath);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
        Thread.sleep(3000);
    }
/* Test case-3
#Test Free Shipping Tab Functionality test
• Open Chrome browser: Pass
• Enter amazon home page url in address bar hit enter : Pass
• Click on Free Shipping Button : Pass
• Verify Free Shipping Button displayed properly */

        public void freeShippingButton() throws InterruptedException {
        setup(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
        Thread.sleep(3000);
    }
/* Test case-4
#Test Free Shipping Tab Functionality test
• Open Chrome browser: Pass
• Enter amazon home page url in address bar hit enter : Pass
• Click on Try sell button : Failed
• Verify Try sell button not displayed properly */

        String freeShipping1 = "//*[@id=\"nav-xshop\"]/a[8]";
        String elimentName = "Start Shopping";
        String startShopping = "//*[@id=\"contentGrid_960994\"]/div/div[3]/div/div/div/a/img";

        public void starShoppingtButton() throws InterruptedException {
        setup(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(freeShipping1)).sendKeys(elimentName);
        driver.findElement(By.xpath(startShopping)).click();
        Thread.sleep(3000);
    }
/* Test case-5
#Test Wedding Registry Test Tab Functionality test
• Open Chrome browser: Pass
• Enter amazon home page url in address bar hit enter : Pass
. Search Box displayed properly : Pass
. Display element in search box properly : Pass
• Click on Search button : Fail
• Verify Wedding Page not displayed properly */

        String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
        String searchElement = "Wedding Registry";
        String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";

        public void weddingRegistry() throws InterruptedException {
        lounchBrowser(chromeDriver, chromeDriverPath, url1);
        driver.findElement(By.xpath(searchBox)).sendKeys(searchElement);
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);
    }
/* Test case-6
#Test Create Your Registry button Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Create Your Registry button : Pass
• Verify Registry Page displayed properly */

        String createButton = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[1]/div/a";

        public void shipping() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        driver.findElement(By.xpath(createButton)).click();
        Thread.sleep(5000);
    }
/* Test case-7
#Test Round Logo button Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Round Logo button : Pass
• Verify Round Logo displayed properly */

        String roundLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[1]/a/img";

        public void roundLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        driver.findElement(By.xpath(roundLogo)).click();
        Thread.sleep(5000);
    }
/* Test case-8
#Test Gift Box Logo button Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Gift Box Logo button : Pass
• Verify Gift Box Logo displayed properly */

        String giftBoxLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[2]/a/img";

        public void giftBoxLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        driver.findElement(By.xpath(giftBoxLogo)).click();
        Thread.sleep(5000);
    }
/* Test case-9
#Test Percentage Logo button Functionality test
. Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Percentage Logo button : Pass
• Verify Percentage Logo displayed properly */

        String percentageLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[3]/a/img";

        public void percentageLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(percentageLogo)).click();
        Thread.sleep(5000);
    }
/* Test case-10
#Test Box And Hand Logo button Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Box And Hand Logo button : Pass
• Verify Box And Hand Logo displayed properly */

        String boxAndHandLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[4]/a/img";

        public void boxAndHandLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(boxAndHandLogo)).click();
        Thread.sleep(5000);
    }
/* Test case-11
#Test The World"s Largest Selection Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on World"s Largest Selection : Pass
• Verify World"s Largest Selection page displayed properly */

        String tHLSelectionLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[1]/a/div[1]";

        public void tHLSelectionLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(tHLSelectionLine)).click();
        Thread.sleep(5000);
    }
/* Test case-12
#Test Up To 20% Off Line Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Up To 20% Off Line : Pass
• Verify Up To 20% Off Line page displayed properly */

        String upTo20OffLine = "/html/body/div[1]/div[2]/div/div/div/div[3]/div/div[2]/a/div[1]";

        public void upTo20OffLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(upTo20OffLine)).click();
        Thread.sleep(5000);
    }
/* Test case-13
#Test Fast Free Line Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Fast Free Line : Pass
• Verify Fast Free Line page displayed properly */

        String fastFreeLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[3]/a/div[1]";

        public void fastFreeLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(fastFreeLine)).click();
        Thread.sleep(5000);
    }
/* Test case-14
#Test Fast Free Line Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Fast Free Line : Pass
• Verify Fast Free Line page displayed properly */

        String easyReturnsLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[4]/a/div[1]";

        public void easyReturnsLine() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(easyReturnsLine)).click();
        Thread.sleep(5000);
    }
/* Test case-15
#Test Find Registry Button Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Find registry box is typeable : Pass
. Click on Arrow sign : Pass
• Verify Find registry page displayed properly */

        String findRegistryBox = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/input[1]";
        String findName = "Mujahid";
        String arrowButton = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/button/div/div[2]";
        String ActualText = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[1]/div/div/div/div/a/img";
        String expecteedText = "\"Wedding Registry page displayed\"";

        public void findRegistryBox() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        driver.findElement(By.xpath(findRegistryBox)).sendKeys(findName);
        Thread.sleep(3000);
        driver.findElement(By.xpath(arrowButton)).click();
        Thread.sleep(3000);
    }
/* Test case-16
#Test Wedding Logo Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Wedding Logo : Pass
• Verify Wedding Logo displayed properly */

        String weddingLogo = "//*[@id=\"a-page\"]/nav/a/img";

        public void weddingLogo() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(weddingLogo)).click();
        Thread.sleep(5000);
    }
/* Test case-17
# Rooms Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Rooms Tab Bar : Pass
• Verify Rooms Tab Bar page displayed properly */

        String roomsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[1]";

        public void roomsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(roomsTabBar)).click();
        Thread.sleep(5000);
    }
 /* Test case-18
# Categories Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Categories Tab Bar : Pass
• Verify Categories Tab Bar page displayed properly */

        String categoriesTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[2]";

        public void categoriesTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(categoriesTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-19
# Hobbies Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Hobbies Tab Bar : Pass
• Verify Hobbies Tab Bar page displayed properly */

        String hobbiesTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[3]";

        public void hobbiesTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(hobbiesTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-20
# Brands Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Brands Tab Bar : Pass
• Verify Brands Tab Bar page displayed properly */

        String brandsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[4]";

        public void brandsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(brandsTabBar)).click();
//      driver18.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }
/* Test case-21
# Popular Gifts Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Popular Gifts Tab Bar : Pass
• Verify Popular Gifts Tab Bar page displayed properly */

        String popularGiftsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[5]";

        public void popularGiftsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(popularGiftsTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-22
# Gift Advisor Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Gift Advisor Tab Bar : Pass
• Verify Gift Advisor Tab Bar page displayed properly */

        String giftAdvisorTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[6]";

        public void giftAdvisorTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftAdvisorTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-23
# Your Registry Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Your Registry Tab Bar : Pass
• Verify Your Registry Tab Bar page displayed properly */

        String yourRegistryTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[1]";

        public void yourRegistryTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftAdvisorTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-24
# Find Registry Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Find Registry Tab Bar : Pass
• Verify Find Registry Tab Bar page displayed properly */

        String findARegistryTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[2]";

        public void findARegistryTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftAdvisorTabBar)).click();
//      driver19.findElement(By.xpath(headLineSearch)).getText();
        Thread.sleep(5000);
    }
/* Test case-25
# Share Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Share Tab Bar : Pass
• Verify Share Tab Bar page displayed properly */

        String shareTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[3]";

        public void shareTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftAdvisorTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-26
# Thank You List Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Thank You List Tab Bar : Pass
• Verify Thank You List Tab Bar page displayed properly */

        String thankYouListTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[4]";

        public void thankYouListTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftAdvisorTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-27
# Settings Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Settings Tab Bar : Pass
• Verify Settings Tab Bar page displayed properly */

        String settingsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[5]";

        public void settingsTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        Thread.sleep(3000);
        driver.findElement(By.xpath(giftAdvisorTabBar)).click();
        Thread.sleep(5000);
    }
/* Test case-28
# Help Tab Bar Functionality test
• Open Chrome browser: Pass
• Enter amazon Wedding Registry page url in address bar hit enter : Pass
• Click on Help Tab Bar : Pass
• Verify Help Tab Bar page displayed properly */

        public void helpTabBar() throws InterruptedException {
        lounchBrowser1(chromeDriver, chromeDriverPath, url2);
        String helpTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[6]";
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/nav/div[2]/div[3]/a[6]")).click();
        Thread.sleep(5000);
    }

}
