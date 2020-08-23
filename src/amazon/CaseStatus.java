package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CaseStatus {

    WebDriver driver;

    @BeforeMethod
    public void driverStartUp() {
        System.setProperty("webdriver.chrome.driver", "lib\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    public void searchBoxIsTypeable() {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung s20 plus");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    public void landingCuponePage() throws InterruptedException {
        searchBoxIsTypeable();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();
    }

    public void landingRecentlyClippedPage() throws InterruptedException {
//        searchBoxIsTypable();
        landingCuponePage();
        driver.findElement(By.xpath("//a[contains(text(),'Recently Clipped')]")).click();
    }

    public void landingMostPopularpage() throws InterruptedException {
        landingCuponePage();
        driver.findElement(By.xpath("//a[contains(text(),'Most Popular')]")).click();
    }

    public void searchCouponBoxIsTypable() throws InterruptedException {
        landingCuponePage();
        driver.findElement(By.xpath("//input[@id='csTextInput']")).sendKeys("SAMSUNG");
        driver.findElement(By.xpath("//span[@id='csSearchButton']//input[@class='a-button-input']")).click();
    }

    public void burgerButton() {
        driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
    }

    public void landingFire7Page() {
        driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Fire Tablets')]")).click();
        driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']//li[3]//a[1]")).click();
    }

    public void fire7PagePlumColor() {
        landingFire7Page();
        driver.findElement(By.xpath("//button[@id='a-autoid-48-announce']//div//div//img[@class='imgSwatch']"));
    }

    public void deskSupllies() {
        driver.findElement(By.xpath("//span[contains(text(),'Desk Supplies')]")).click();
    }

    public void scotchTape() {
        deskSupllies();
        driver.findElement(By.xpath("//div[contains(@class,'bxc-grid__container bxc-grid__container--width-1500')]//a//img"));
    }

    public void babyRegistryTab() {
        deskSupllies();
        driver.findElement(By.xpath("//span[contains(@class,'nav-a-content')][contains(text(),'Baby Registry')]")).click();
    }

    public void createNewBabyRegistry() {
        babyRegistryTab();
        driver.findElement(By.xpath("//a[@id='a-autoid-2-announce']//span[@class='a-size-medium br-homepage-sign-in-button-text-rebrand a-text-bold'][contains(text(),'Create a new Baby Registry')]")).click();
    }

    public void createYourAmazonAccount() {
        babyRegistryTab();
        driver.findElement(By.xpath("//a[@id='a-autoid-2-announce']//span[@class='a-size-medium br-homepage-sign-in-button-text-rebrand a-text-bold'][contains(text(),'Create a new Baby Registry')]")).click();
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
    }

    public void electronicsButton() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='desktop-top']//li[2]//span[1]//a[1]//img[1]")).click();

    }

    public void findAGift() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Find a Gift')]")).click();
        Thread.sleep(3000);
    }

    public void mensFashion() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='desktop-top']//li[5]//span[1]//a[1]//img[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"contentGrid_834529\"]/div/div[1]/div/div/div/img"));
    }

    public void bestSellersButton() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_tabs\"]/ul/li[1]/div/a")).click();
    }

    public void customerServices() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).click();
        Thread.sleep(2000);
    }

    public void todaysDeals() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[1]/span")).click();
        Thread.sleep(200);

    }

    public void newRelease() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"]")).click();
    }

    public void shoppingCart() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
//        Thread.sleep(3000);
    }

    public void tryPrimeButton() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='nav-link-prime']//div[@class='nav-line-1-container']")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
    }

    public String amazonBasicButton = "//*[@id=\"nav-xshop\"]/a[12]";
    public String getAmazonBasicActualText = "//*[@id=\"Header-DQNwtPU\"]/div/div[1]/img";
    public String getAmazonBasicExpectedsText = "\"amazonbasic";

    public void amazonBasic() throws InterruptedException {
        driver.findElement(By.xpath(amazonBasicButton)).click();
    }

    public void sellButton() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='nav-main']//a[10]")).click();
    }

    public void setProductSearch() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("watch for men");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Mens Watches Ultra-Thin Minimalist Waterproof - Fa')]")).click();
        System.out.println(driver.findElement(By.xpath("//span[@id='productTitle']")).isDisplayed());
    }

    public void setSelectYourAddressd() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"glow-ingress-block\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"GLUXSignInButton\"]/span/input")).click();
    }

    public void giftCardButtonDisplay() {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).isDisplayed();
    }

    public void giftCardButtonClickable1() {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
    }

    public void giftCardHomePageDisplay() {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
    }

    public void birthDayButtonIsActive() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Birthdays')]")).isDisplayed();
        Thread.sleep(3000);
    }

    public void redeemGiftCard() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Redeem Gift Cards')]")).click();
        Thread.sleep(3000);
    }

    public void viewYourBalace() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'View Your Balance')]")).click();
        Thread.sleep(3000);
    }

    public void reloadYourBalance() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(" //span[contains(text(),'Reload Your Balance')]")).click();
    }

    public void byBrand() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'By Brand')]")).click();
    }

    public void amazonCash() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Amazon Cash')]")).click();
    }

}
