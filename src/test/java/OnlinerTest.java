import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {

    @Test

    public void testOpenOnliner(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_Online);

        WebElement copyrightElement = driver.findElement(By.xpath(OnlinerPage.copyrightXpath));

        Assert.assertEquals(OnlinerPage.copyrightText, copyrightElement.getText());
        driver.quit();
    }

    @Test

    public void testOpenOnlinerLoginForm(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_Online);

        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.onlinerEnterBtn));

        Assert.assertEquals("Вход", enterBtnOnliner.getText());
        driver.quit();
    }

}
