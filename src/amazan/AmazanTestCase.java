package amazan;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazanTestCase extends AmazanCase {
    @Test
    public void testAmazonHome() throws InterruptedException {
       homePage();
//       String actualText = amzDriver.findElement(By.xpath(actualHomePageText)).getText();
//        Assert.assertEquals(actualText,expectedText);
    }
}
