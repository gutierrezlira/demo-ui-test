import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OnlinerTest {
    ChromeDriver driver = new ChromeDriver();
    @Before
    public void settingOpen() {
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_ONLINER);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void testOpenOnliner(){
        WebElement copyrightElement = driver.findElement(By.xpath(OnlinerPage.COPYRIGHT_XPATH));
        Assert.assertEquals(OnlinerPage.copyrightText, copyrightElement.getText());
    }

    @Test
    public void testOpenOnlinerLoginForm(){
        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.ONLINER_ENTER_BTN));
        Assert.assertEquals("Вход", enterBtnOnliner.getText());
    }

    @Test
    public void testOnlinerLoginFormWithEmptyCredentials() throws InterruptedException {
        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.ONLINER_ENTER_BTN));
        enterBtnOnliner.click();

        WebElement enterBtnOnlForm = driver.findElement(By.xpath(OnlinerPage.ONLINER_FORM_ENTER_BTN));
        enterBtnOnlForm.click();

        Thread.sleep(3000);

        WebElement onlinerLogin = driver.findElement(By.xpath(OnlinerPage.ONLINER_LOGIN_ERR));
        WebElement onlinerPassword = driver.findElement(By.xpath(OnlinerPage.ONLINER_PASSWORD_ERR));

        Assert.assertEquals(OnlinerPage.loginErrText, onlinerLogin.getText());
        Assert.assertEquals(OnlinerPage.PasswordTextErr, onlinerPassword.getText());
    }

    @Test
    public void testOnlinerLoginFormWithEmptyPassword() throws InterruptedException {
        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.ONLINER_ENTER_BTN));
        enterBtnOnliner.click();

        WebElement sendKeyLogin = driver.findElement(By.xpath(OnlinerPage.EMAIL_ENTRANCE_WINDOW));
        sendKeyLogin.sendKeys("test@gmail.com");

        WebElement enterBtnOnlForm = driver.findElement(By.xpath(OnlinerPage.ONLINER_FORM_ENTER_BTN));
        enterBtnOnlForm.click();
        Thread.sleep(3000);

        WebElement onlinerPassword = driver.findElement(By.xpath(OnlinerPage.ONLINER_PASSWORD_ERR));
        Assert.assertEquals(OnlinerPage.PasswordTextErr, onlinerPassword.getText());
    }
@After
    public void setExit(){
    driver.quit();
}
}
