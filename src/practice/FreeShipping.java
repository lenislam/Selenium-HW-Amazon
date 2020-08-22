package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FreeShipping {

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
//TestCase#1;
        String chromeDriver="webdriver.chrome.driver";
        String chromeDriverPath="lib\\browser\\chromedriver.exe";
        String url="https://www.amazon.com/";
        String ActualText="//*[@id=\"nav-logo\"]/a/span[1]";
        String ecpectedText= "\"Amazon Home Page display\"";

        System.setProperty(chromeDriver, chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.findElement(By.xpath(ActualText)).getText();
//        Assert.assertEquals(ActualText,ecpectedText);
        Thread.sleep(3000);
        driver.close();

//TestCase#2
        String chromeDriver1="webdriver.chrome.driver";
        String chromeDriverPath1="lib\\browser\\chromedriver.exe";
        String url1="https://www.amazon.com/";
        String freeShipping="//*[@id=\"nav-xshop\"]/a[8]";
//        String ActualText="//*[@id=\"nav-swmslot\"]/a";
//        String ecpectedText= "\"Free Shipping landed page\"";

        System.setProperty(chromeDriver1, chromeDriverPath1);
        WebDriver driver1 = new ChromeDriver();
        driver1.get(url1);
        driver1.manage().window().fullscreen();
        driver1.findElement(By.xpath(freeShipping)).click();
        Thread.sleep(3000);
//        driver2.findElement(By.xpath(smartSpeakerActualText)).getText();
//        Assert.assertEquals(ActualText,ecpectedText);
//        Thread.sleep(3000);
        driver1.close();

//TestCase3
//        String chromeDriver2="webdriver.chrome.driver";
//        String chromeDriverPath2="lib\\browser\\chromedriver.exe";
//        String url2="https://www.amazon.com/";
//        String freeShipping="//*[@id=\"nav-xshop\"]/a[8]";
//        String productName="Start Shopping";
////        String startShopping="//*[@id=\"contentGrid_346528\"]/div/div[3]/div/div/div/a/img";
////        String ActualText="//*[@id=\"nav-swmslot\"]/a";
////        String ecpectedText= "\"Free Shipping landed page\"";

//        System.setProperty(chromeDriver2, chromeDriverPath2);
//        WebDriver driver2 = new ChromeDriver();
//        driver2.get(url2);
//        driver2.manage().window().fullscreen();
//        driver2.findElement(By.xpath(freeShipping)).sendKeys(productName);
////        driver2.findElement(By.xpath(startShopping)).click();
//        Thread.sleep(3000);
//////        Assert.assertEquals(ActualText,ecpectedText);
//////        Thread.sleep(3000);
//        driver2.close();

//testCase#04;
//        String chromeDriver3="webdriver.chrome.driver";
//        String chromeDriverPath3="lib\\browser\\chromedriver.exe";
//        String url3="https://www.amazon.com/gp/browse.html?node=16115931011&ref_=nav_cs_registry";
//        String searchBox="//*[@id=\"twotabsearchtextbox\"]";
//        String productName="Wedding Registry";
//        String searchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
////        String ActualText="//*[@id=\"nav-swmslot\"]/a";
//////        String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver3, chromeDriverPath3);
//        WebDriver driver3 = new ChromeDriver();
//        driver3.get(url3);
////        driver2.manage().window().fullscreen();
//        driver3.findElement(By.xpath(searchBox)).sendKeys(productName);
//        driver3.findElement(By.xpath(searchButton)).click();
////        driver2.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
//////        driver2.findElement(By.xpath(smartSpeakerActualText)).getText();
//////        Assert.assertEquals(ActualText,ecpectedText);
//////        Thread.sleep(3000);
//        driver3.close();

// testCase#05;
//        String chromeDriver4="webdriver.chrome.driver";
//        String chromeDriverPath4="lib\\browser\\chromedriver.exe";
//        String url4="https://www.amazon.com/wedding";
//        String createButton = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[1]/div/a";
// //     String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver4, chromeDriverPath4);
//        WebDriver driver4 = new ChromeDriver();
//        driver4.get(url4);
//        driver4.findElement(By.xpath(createButton)).click();
////      driver4.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver4.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver4.close();

// testCase#06;
//        String chromeDriver5="webdriver.chrome.driver";
//        String chromeDriverPath5="lib\\browser\\chromedriver.exe";
//        String url5="https://www.amazon.com/wedding";
//        String roundLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[1]/a/img";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver5, chromeDriverPath5);
//        WebDriver driver5 = new ChromeDriver();
//        driver5.get(url5);
//        driver5.findElement(By.xpath(roundLogo)).click();
////      driver5.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver5.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver5.close();

// testCase#07;
//        String chromeDriver6="webdriver.chrome.driver";
//        String chromeDriverPath6="lib\\browser\\chromedriver.exe";
//        String url6="https://www.amazon.com/wedding";
//        String giftBoxLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[2]/a/img";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver6, chromeDriverPath6);
//        WebDriver driver6 = new ChromeDriver();
//        driver6.get(url6);
//        driver6.findElement(By.xpath(giftBoxLogo)).click();
////      driver5.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver5.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver6.close();

// testCase#08;
//        String chromeDriver7="webdriver.chrome.driver";
//        String chromeDriverPath7="lib\\browser\\chromedriver.exe";
//        String url7="https://www.amazon.com/wedding";
//        String percentageLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[3]/a/img";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver7, chromeDriverPath7);
//        WebDriver driver7 = new ChromeDriver();
//        driver7.get(url7);
//        driver7.findElement(By.xpath(percentageLogo)).click();
////      driver7.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver7.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver7.close();

// testCase#09;
//        String chromeDriver8="webdriver.chrome.driver";
//        String chromeDriverPath8="lib\\browser\\chromedriver.exe";
//        String url8="https://www.amazon.com/wedding";
//        String boxAndHandLogo = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[4]/a/img";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver8, chromeDriverPath8);
//        WebDriver driver8 = new ChromeDriver();
//        driver8.get(url8);
//        driver8.findElement(By.xpath(boxAndHandLogo)).click();
////      driver8.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver8.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver8.close();

// testCase#10;
//        String chromeDriver9="webdriver.chrome.driver";
//        String chromeDriverPath9="lib\\browser\\chromedriver.exe";
//        String url9="https://www.amazon.com/wedding";
//        String tHLSelectionLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[1]/a/div[1]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver9, chromeDriverPath9);
//        WebDriver driver9 = new ChromeDriver();
//        driver9.get(url9);
//        driver9.findElement(By.xpath(tHLSelectionLine)).click();
////      driver9.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver9.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver9.close();

// testCase#11;
//        String chromeDriver10="webdriver.chrome.driver";
//        String chromeDriverPath10="lib\\browser\\chromedriver.exe";
//        String url10="https://www.amazon.com/wedding";
//        String upTo20OffLine = "/html/body/div[1]/div[2]/div/div/div/div[3]/div/div[2]/a/div[1]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver10, chromeDriverPath10);
//        WebDriver driver10 = new ChromeDriver();
//        driver10.get(url10);
//        driver10.findElement(By.xpath(upTo20OffLine)).click();
////      driver10.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver10.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver10.close();

// testCase#12;
//        String chromeDriver11="webdriver.chrome.driver";
//        String chromeDriverPath11="lib\\browser\\chromedriver.exe";
//        String url11="https://www.amazon.com/wedding";
//        String fastFreeLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[3]/a/div[1]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver11, chromeDriverPath11);
//        WebDriver driver11 = new ChromeDriver();
//        driver11.get(url11);
//        driver11.findElement(By.xpath(fastFreeLine)).click();
////      driver11.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver11.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver11.close();

// testCase#13;
//        String chromeDriver12="webdriver.chrome.driver";
//        String chromeDriverPath12="lib\\browser\\chromedriver.exe";
//        String url12="https://www.amazon.com/wedding";
//        String easyReturnsLine = "//*[@id=\"a-page\"]/div[2]/div/div/div/div[3]/div/div[4]/a/div[1]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";

//        System.setProperty(chromeDriver12, chromeDriverPath12);
//        WebDriver driver12 = new ChromeDriver();
//        driver12.get(url12);
//        driver12.findElement(By.xpath(easyReturnsLine)).click();
////      driver12.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver12.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver12.close();


//Test#14
//        String chromeDriver13="webdriver.chrome.driver";
//        String chromeDriverPath13="lib\\browser\\chromedriver.exe";
//        String url13 = "https://www.amazon.com/wedding";
//        String findRegistryBox="//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/input[1]";
//        String findName="Mujahid";
//        String arrowButton="//*[@id=\"a-page\"]/div[2]/div/div/div/div[2]/form/button/div/div[2]";
//        String ActualText="//*[@id=\"a-page\"]/div[2]/div/div/div/div[1]/div/div/div/div/a/img";
//        String expecteedText = "\"Wedding Registry page displayed\"";
//
//        System.setProperty(chromeDriver13,chromeDriverPath13);
//        WebDriver driver13 = new ChromeDriver();
//        driver13.get(url13);
////        driver.manage().window().fullscreen();
//        driver13.findElement(By.xpath(findRegistryBox)).sendKeys(findName);
//        driver13.findElement(By.xpath(arrowButton)).click();
//        Thread.sleep(3000);
//        driver13.findElement(By.xpath(ActualText)).getText();
//        Assert.assertEquals(ActualText,expecteedText);
//        Thread.sleep(3000);
//        driver13.close();

// testCase#15;
//        String chromeDriver14="webdriver.chrome.driver";
//        String chromeDriverPath14="lib\\browser\\chromedriver.exe";
//        String url14="https://www.amazon.com/wedding";
//        String weddingLogo = "//*[@id=\"a-page\"]/nav/a/img";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver14, chromeDriverPath14);
//        WebDriver driver14 = new ChromeDriver();
//        driver14.get(url14);
//        driver14.findElement(By.xpath(weddingLogo)).click();
////      driver14.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver14.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver14.close();

// testCase#16;
//        String chromeDriver15="webdriver.chrome.driver";
//        String chromeDriverPath15="lib\\browser\\chromedriver.exe";
//        String url15="https://www.amazon.com/wedding";
//        String roomsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[1]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver15, chromeDriverPath15);
//        WebDriver driver15 = new ChromeDriver();
//        driver15.get(url15);
//        driver15.findElement(By.xpath(roomsTabBar)).click();
////      driver15.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver15.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver15.close();

// testCase#17;
//        String chromeDriver16="webdriver.chrome.driver";
//        String chromeDriverPath16="lib\\browser\\chromedriver.exe";
//        String url16="https://www.amazon.com/wedding";
//        String categiriesTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[2]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver16, chromeDriverPath16);
//        WebDriver driver16 = new ChromeDriver();
//        driver16.get(url16);
//        driver16.findElement(By.xpath(categiriesTabBar)).click();
////      driver16.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver16.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver16.close();

// testCase#18;
//        String chromeDriver17="webdriver.chrome.driver";
//        String chromeDriverPath17="lib\\browser\\chromedriver.exe";
//        String url17="https://www.amazon.com/wedding";
//        String hobbiesTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[3]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver17, chromeDriverPath17);
//        WebDriver driver17 = new ChromeDriver();
//        driver17.get(url17);
//        driver17.findElement(By.xpath(hobbiesTabBar)).click();
////      driver17.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver17.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver17.close();

// testCase#19;
//        String chromeDriver18="webdriver.chrome.driver";
//        String chromeDriverPath18="lib\\browser\\chromedriver.exe";
//        String url18="https://www.amazon.com/wedding";
//        String brandsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[4]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver18, chromeDriverPath18);
//        WebDriver driver18 = new ChromeDriver();
//        driver18.get(url18);
//        driver18.findElement(By.xpath(brandsTabBar)).click();
////      driver18.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver18.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver18.close();

// testCase#20;
//        String chromeDriver19="webdriver.chrome.driver";
//        String chromeDriverPath19="lib\\browser\\chromedriver.exe";
//        String url19="https://www.amazon.com/wedding";
//        String popularGiftsTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[5]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver19, chromeDriverPath19);
//        WebDriver driver19 = new ChromeDriver();
//        driver19.get(url19);
//        driver19.findElement(By.xpath(popularGiftsTabBar)).click();
////      driver19.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver19.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver19.close();

// testCase#21;
//        String chromeDriver20="webdriver.chrome.driver";
//        String chromeDriverPath20="lib\\browser\\chromedriver.exe";
//        String url20="https://www.amazon.com/wedding";
//        String giftAdvisorTabBar = "//*[@id=\"a-page\"]/nav/div[2]/div[1]/a[6]";
////      String ActualText="//*[@id=\"nav-swmslot\"]/a";
////      String ecpectedText= "\" Shipping landed page\"";
//
//        System.setProperty(chromeDriver20, chromeDriverPath20);
//        WebDriver driver20 = new ChromeDriver();
//        driver20.get(url20);
//        driver20.findElement(By.xpath(giftAdvisorTabBar)).click();
////      driver19.findElement(By.xpath(headLineSearch)).getText();
//        Thread.sleep(5000);
////      driver19.findElement(By.xpath(smartSpeakerActualText)).getText();
////      Assert.assertEquals(ActualText,ecpectedText);
////      Thread.sleep(3000);
//        driver20.close();

    }
    }

