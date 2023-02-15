import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    ChromeDriver driver = new ChromeDriver();
    @Before
    public void settingOpen() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL_AMAZON);
        Thread.sleep(3000);
    }
    @Test
    public void testOpenAmazon(){
        WebElement navFooterElement = driver.findElement(By.xpath(AmazonPage.NAV_FOOTER_LINE));
        Assert.assertEquals(AmazonPage.footer_Text, navFooterElement.getText());
    }

    @Test
    public void testOpenAmazonCart(){
        WebElement cart = driver.findElement(By.xpath(AmazonPage.AMAZON_CART));
        cart.click();

        WebElement emptyCart = driver.findElement(By.xpath(AmazonPage.CART_IS_EMPTY));
        Assert.assertEquals(AmazonPage.CartEmptyText, emptyCart.getText());
    }

    @Test
    public void testOpenAmazonLoginForm(){
        WebElement cart = driver.findElement(By.xpath(AmazonPage.AMAZON_CART));
        cart.click();

        WebElement sighInBtn = driver.findElement(By.xpath(AmazonPage.SIGN_IN_BTN));
        sighInBtn.click();

        WebElement sighInTxt = driver.findElement(By.xpath(AmazonPage.SIGH_IN_TXT));

        Assert.assertEquals("Sign in", sighInTxt.getText());
    }


    @Test
    public void testAmazonLoginFormWithEmptyCredentials(){
        WebElement cart = driver.findElement(By.xpath(AmazonPage.AMAZON_CART));
        cart.click();

        WebElement sighInBtn = driver.findElement(By.xpath(AmazonPage.SIGN_IN_BTN));
        sighInBtn.click();

        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();

        WebElement errTxt = driver.findElement(By.xpath(AmazonPage.SIGH_IN_ERR_TXT));

        Assert.assertEquals("Enter your email or mobile phone number", errTxt.getText());
}
    @After
    public void setExit(){
        driver.quit();
    }

}
