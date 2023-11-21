package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {

        openBrowser(baseUrl);
    }
    @Test
    public void UserShouldNavigateToComputerPageSuccessfully() {
        // Find the computer page Click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='computers']")).click();
        //Verify the text
        String expectedComputerTabTest = "Computer";
        String actualComputerTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='Computer']")).getText();
        Assert.assertEquals(actualComputerTabText, actualComputerTabText);
    }
    @Test
    public void UserShouldNavigateToElectronicsPageSuccessfully() {
        // Find the Electronics page Click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).click();
        //Verify the text
        String expectedElectronicsTabTest = "Electronics";
        String actualElectronicsTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='Electronics']")).getText();
        Assert.assertEquals(expectedElectronicsTabTest, actualElectronicsTabText);
    }

        @Test
                public void UserShouldNavigateToApparelPageSuccessfully(){
            // Find the Apparel page Click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).click();
            //Verify the text
            String expectedApparelTabTest = "Apparel";
            String actualApparelTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='Apparel']")).getText();
            Assert.assertEquals(expectedApparelTabTest, actualApparelTabText);

        }
    @Test
    public void UserShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Find the DigitalDownloads page Click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='DigitalDownloads']")).click();
        //Verify the text
        String expectedDigitalDownloadsTabTest = "DigitalDownloads";
        String actualDigitalDownloadsTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='DigitalDownloads']")).getText();
        Assert.assertEquals(expectedDigitalDownloadsTabTest, actualDigitalDownloadsTabText);
    }
    @Test
    public void UserShouldNavigateToBooksPageSuccessfully() {
        // Find the BooksPage Downloads page Click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='BooksPage']")).click();
        //Verify the text
        String expectedBooksPageTabTest = "BooksPage";
        String actualBooksPageTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='BooksPage']")).getText();
        Assert.assertEquals(expectedBooksPageTabTest, actualBooksPageTabText);
    }
        @Test
    public void UserShouldNavigateToJewelryPageSuccessfully(){
        // Find the Jewelry page Click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).click();
        //Verify the text
        String expectedJewelryTabTest = "Jewelry";
        String actualJewelryTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='Jewelry']")).getText();
        Assert.assertEquals(expectedJewelryTabTest, actualJewelryTabText);


    }
    @Test
    public void UserShouldNavigateToGiftCardsPageSuccessfully() {
        // Find the GiftCards page Click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='GiftCards']")).click();
        //Verify the text
        String expectedGiftCardsTabTest = "GiftCards";
        String actualGiftCardsTabText = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[normalize-space()='GiftCards']")).getText();
        Assert.assertEquals(expectedGiftCardsTabTest, actualGiftCardsTabText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
