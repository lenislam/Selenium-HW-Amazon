package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Amazon TestCase
 * @throws InterruptedException
 * Author : Mujahid
 */
public class TestCase extends CaseStatus {

    @Test
    public void testSearchBoxTypeAble() {
        searchBoxIsTypeable();
//        Assert.assertEquals("Amazon.com : Samsung s20 plus",driver.getTitle());
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).isDisplayed());
    }
    @Test
    public void testLandingCuponePage() throws InterruptedException {
        landingCuponePage();
        Assert.assertEquals("Amazon Coupons @ Amazon.com", driver.getTitle());
    }
    @Test
    public void testLandingRecentlyClippedPage() throws InterruptedException {
        landingRecentlyClippedPage();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@class='vpc_coupon_bar_image vpc_clickable vpc_coupon_bar_scissors']")).isDisplayed());
    }
    @Test
    public void testBowlOfCarrot() throws InterruptedException {
        landingMostPopularpage();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).isDisplayed());
    }
    @Test
    public void testSearchCouponBoxIsTypable() throws InterruptedException {
        searchCouponBoxIsTypable();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='vpcCateogryBarHeaderText a-size-medium a-color-primary']")).isDisplayed());
    }
    @Test
    public void testBurgerButton() {
        burgerButton();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='hmenu-customer-name']")).isDisplayed());
    }
    @Test
    public void testLandingFire7Page() {
        landingFire7Page();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-bold']")).isDisplayed());
    }
    @Test
    public void testFire7PagePlumColor() {
        fire7PagePlumColor();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='a-autoid-50-announce']//div//div//img[@class='imgSwatch']")).isDisplayed());
    }
    @Test
    public void testDeskSupplies() {
        deskSupllies();
        Assert.assertEquals("Desk and Study Supplies | Amazon.com Gift Finder", driver.getTitle());
    }
    @Test
    public void testScotchTape() {
        scotchTape();
//       Assert.assertTrue(driver.findElement(By.xpath("//div[@id='contentGrid_444524']//img")).isDisplayed());
    }
    @Test
    public void testBabyRegistry() {
        babyRegistryTab();
        Assert.assertEquals("Amazon: Baby Registry", driver.getTitle());
    }
    @Test
    public void testCreateNewBabyRegistry() {
        createNewBabyRegistry();
        Assert.assertEquals("Amazon Sign-In", driver.getTitle());
    }
    @Test
    public void testCreateYourAmazonAccount() {
        createYourAmazonAccount();
        Assert.assertEquals("Amazon Registration", driver.getTitle());
    }
    @Test
    public void testElectronicsButton() throws InterruptedException {
        electronicsButton();
        Assert.assertEquals("Electronics for College | Amazon.com Gift Finder", driver.getTitle());
    }
    @Test
    public void testFindAGift() throws InterruptedException {
        findAGift();
        Assert.assertEquals("Gifts for Everyone | Amazon.com Gift Finder", driver.getTitle());
    }
    @Test
    public void testMensFashion() throws InterruptedException {
        mensFashion();
        System.out.println(driver.getTitle());
//        Assert.assertEquals("Amazon.com: College Essentials for Him: Clothing, Shoes & Jewelry", driver.getTitle());
    }
    @Test
    public void testBestSellersButton() {
        bestSellersButton();
        Assert.assertEquals("Amazon.com Best Sellers: The most popular items on Amazon", driver.getTitle());
    }
    @Test
    public void testCustomerServicesButton() throws InterruptedException {
        customerServices();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed());
    }
    @Test
    public void testtodaysDealButton() throws InterruptedException {
        todaysDeals();
        Assert.assertEquals("Gold Box Deals | Today's Deals - Amazon.com", driver.getTitle());
    }
    @Test
    public void testNewRelease() {
        newRelease();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"]")).isDisplayed());
    }
    @Test
    public void testTryPrime() throws InterruptedException {
        tryPrimeButton();
        Assert.assertEquals("Amazon.com: Amazon Prime", driver.getTitle());
    }
    @Test
    public void testShoppingCart() throws InterruptedException {
        shoppingCart();
        Assert.assertEquals("Amazon.com Shopping Cart", driver.getTitle());
    }
    @Test
    public void testamazonBasic() throws InterruptedException {
        amazonBasic();
        Assert.assertEquals("Amazon.com: AmazonBasics: AmazonBasics", driver.getTitle());
    }
    @Test
    public void testSellButton() throws InterruptedException {
        sellButton();
        Assert.assertEquals("Amazon.com: Sell Products Online with Selling on Amazon.", driver.getTitle());
    }
    @Test
    public void testSetProductSearch() throws InterruptedException {
        setProductSearch();
    }
    @Test
    public void testsetSelectYourAddressd() throws InterruptedException {
        setSelectYourAddressd();
    }
    @Test
    public void testGiftCardButtonDisplay() {
        giftCardButtonDisplay();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).isDisplayed());
    }
    @Test
    public void testGiftCardHomePageDisplay() {
        giftCardHomePageDisplay();
        Assert.assertEquals("Amazon.com Gift Cards", driver.getTitle());
    }
    @Test
    public void testBirthDayButtonClickable() throws InterruptedException {
        birthDayButtonIsActive();
        Assert.assertEquals("Amazon.com Gift Cards", driver.getTitle());
    }
    @Test
    public void testRedeemGiftCard() throws InterruptedException {
        redeemGiftCard();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed());
    }
    @Test
    public void testViewYourBalance() throws InterruptedException {
        viewYourBalace();
        Assert.assertEquals("Amazon Sign-In", driver.getTitle());
    }
    @Test
    public void testReloadYourBalance() throws InterruptedException {
        reloadYourBalance();
        Assert.assertEquals("Reload Your Balance", driver.getTitle());
    }
    @Test
    public void testByBrand() throws InterruptedException {
        byBrand();
        Assert.assertEquals("Amazon.com: : Gift Cards", driver.getTitle());
    }
    @Test
    public void testAmazonCash() throws InterruptedException {
        amazonCash();
        Assert.assertEquals("Amazon Cash", driver.getTitle());
    }

}
