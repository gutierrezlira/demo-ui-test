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
}
