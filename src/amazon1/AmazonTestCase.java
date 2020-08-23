package amazon1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Amazon TestCase
 * @throws InterruptedException
 * Author : Mujahid
 */
public class AmazonTestCase extends AmazonCase {

    @Test
    public void testAmazonHome() throws InterruptedException {
        homePage();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a/span[1]")).isDisplayed());
    }

    @Test
    public void testSellButton() throws InterruptedException {
        sellButton();
    }

    @Test
    public void testFreeShippingButton() throws InterruptedException {
        freeShippingButton();
        Assert.assertEquals("Amazon.com: : FREE Shipping by Amazon",driver.getTitle());
    }

    @Test
    public void testStartShopping() throws InterruptedException {
        starShoppingtButton();
    }

    @Test
    public void testWeddingRegistry() throws InterruptedException {
        weddingRegistry();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Gift Advisor')]")).isDisplayed());
    }
    @Test
    public void testShipping() throws InterruptedException {
        shipping();
        Assert.assertEquals("Amazon Sign-In",driver.getTitle());
    }

    @Test
    public void testRoundLogo() throws InterruptedException {
        roundLogo();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/div[1]/h2")).isDisplayed());
    }

    @Test
    public void testGiftBoxLogo() throws InterruptedException {
        giftBoxLogo();
        Assert.assertEquals("Amazon.com Help: About the Wedding Registry Completion Discount",driver.getTitle());
    }

    @Test
    public void testPercentageLogo() throws InterruptedException {
        percentageLogo();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/p/span")).isDisplayed());
    }

    @Test
    public void testBoxAndHandLogo() throws InterruptedException {
        boxAndHandLogo();
       Assert.assertEquals("Amazon.com Help: Return Gifts from Your Wedding Registry",driver.getTitle());
    }

    @Test
    public void testTHLSelectonLine() throws InterruptedException {
        tHLSelectionLine();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/h2")).isDisplayed());
    }

    @Test
    public void testUpTo20Off() throws InterruptedException {
        upTo20OffLine();
        Assert.assertEquals("Amazon.com Help: About the Wedding Registry Completion Discount",driver.getTitle());
    }

    @Test
    public void testFastFreeLine() throws InterruptedException {
        fastFreeLine();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[1]/p/span")).isDisplayed());
    }

    @Test
    public void testEasyReturnsLine() throws InterruptedException {
        easyReturnsLine();
        Assert.assertEquals("Amazon.com Help: Return Gifts from Your Wedding Registry",driver.getTitle());
    }

    @Test
    public void testFindRegistryBox() throws InterruptedException {
        findRegistryBox();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"numOfResultsText\"]")).isDisplayed());
    }

    @Test
    public void testWeddingLogo() throws InterruptedException {
        weddingLogo();
        Assert.assertEquals("//*[@id=\"a-page\"]/div[2]/div/div/div[1]",driver.getTitle());
    }

    @Test
    public void testRoomsTaBar() throws InterruptedException {
        roomsTabBar();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div[1]")).isDisplayed());
    }

    @Test
    public void testCategoriesTabBar() throws InterruptedException {
        categoriesTabBar();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div/div[1]")).isDisplayed());
    }

    @Test
    public void testHobbiesTabBar() throws InterruptedException {
        hobbiesTabBar();
        Assert.assertEquals("Shop by hobby | Amazon Wedding",driver.getTitle());
    }

    @Test
    public void restBrandsTabBar() throws InterruptedException {
        brandsTabBar();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/div[1]/div/div/img")).isDisplayed());
    }

    @Test
    public void testPopularGiftsTabBar() throws InterruptedException {
        popularGiftsTabBar();
        Assert.assertEquals("Popular Wedding Gifts - Amazon Wedding & Bridal Registry",driver.getTitle());
    }

    @Test
    public void testGiftAdvisorTabBar() throws InterruptedException {
        giftAdvisorTabBar();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[4]/div[2]/a[3]")).isDisplayed());
    }

    @Test
    public void testYourRegistryTabBar() throws InterruptedException {
        yourRegistryTabBar();
        Assert.assertEquals("Amazon Sign-In",driver.getTitle());

    }

    @Test
    public void testFindARegistryTabBar() throws InterruptedException {
        findARegistryTabBar();
        Assert.assertEquals("Amazon Sign-In",driver.getTitle());
    }

    @Test
    public void testShareTabBar() throws InterruptedException {
        shareTabBar();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[4]/div[2]/a[1]")).isDisplayed());
    }

    @Test
    public void testThankYouLisTabBar() throws InterruptedException {
        thankYouListTabBar();
        Assert.assertEquals("Amazon Sign-In",driver.getTitle());
    }

    @Test
    public void testSettingsTabBar() throws InterruptedException {
        settingsTabBar();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")).isDisplayed());
    }

    @Test
    public void testhelpTabBar() throws InterruptedException {
        helpTabBar();
        Assert.assertEquals("Amazon.com Help: Wedding Registries",driver.getTitle());
    }

}
