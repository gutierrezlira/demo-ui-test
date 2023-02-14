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



}
