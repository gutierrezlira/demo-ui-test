import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {

    @Test

    public void testOpenPage(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(OnlinerPage.URL_Online);

        By copyrightBy = By.xpath(OnlinerPage.copyrightXpath);
        WebElement copyrightElement = driver.findElement(copyrightBy);

        Assert.assertEquals(OnlinerPage.copyrightText, copyrightElement.getText());
        driver.quit();
    }


}
