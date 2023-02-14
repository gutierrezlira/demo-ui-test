import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

    @Test
    public void testOpenAmazon(){

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL_AMAZON);

        WebElement navFooterElement = driver.findElement(By.xpath(AmazonPage.NAV_FOOTER_LINE));

        Assert.assertEquals(AmazonPage.footer_Text, navFooterElement.getText());
        driver.quit();
    }

    @Test
    public void testOpenAmazonCart(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL_AMAZON);

        WebElement cart = driver.findElement(By.xpath(AmazonPage.AMAZON_CART));
        cart.click();

        WebElement emptyCart = driver.findElement(By.xpath(AmazonPage.CART_IS_EMPTY));
        Assert.assertEquals(AmazonPage.CartEmptyText, emptyCart.getText());

        driver.quit();
    }

    @Test
    public void testOpenAmazonLoginForm(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL_AMAZON);

        WebElement cart = driver.findElement(By.xpath(AmazonPage.AMAZON_CART));
        cart.click();

        WebElement sighInBtn = driver.findElement(By.xpath(AmazonPage.SIGN_IN_BTN));
        sighInBtn.click();

        WebElement sighInTxt = driver.findElement(By.xpath(AmazonPage.SIGH_IN_TXT));

        Assert.assertEquals("Sign in", sighInTxt.getText());
        driver.quit();
    }


    @Test
    public void testAmazonLoginFormWithEmptyCredentials(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AmazonPage.URL_AMAZON);

        WebElement cart = driver.findElement(By.xpath(AmazonPage.AMAZON_CART));
        cart.click();

        WebElement sighInBtn = driver.findElement(By.xpath(AmazonPage.SIGN_IN_BTN));
        sighInBtn.click();

        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();

        WebElement errTxt = driver.findElement(By.xpath(AmazonPage.SIGH_IN_ERR_TXT));

        Assert.assertEquals("Enter your email or mobile phone number", errTxt.getText());
        driver.quit();
}

}
