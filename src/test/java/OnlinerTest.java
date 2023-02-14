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
        driver.get(OnlinerPage.URL_ONLINER);

        WebElement copyrightElement = driver.findElement(By.xpath(OnlinerPage.COPYRIGHT_XPATH));

        Assert.assertEquals(OnlinerPage.copyrightText, copyrightElement.getText());
        driver.quit();
    }

    @Test

    public void testOpenOnlinerLoginForm(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_ONLINER);

        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.ONLINER_ENTER_BTN));

        Assert.assertEquals("Вход", enterBtnOnliner.getText());
        driver.quit();
    }

    @Test

    public void testOnlinerLoginFormWithEmptyCredentials() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_ONLINER);

        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.ONLINER_ENTER_BTN));
        enterBtnOnliner.click();

        WebElement enterBtnOnlForm = driver.findElement(By.xpath(OnlinerPage.ONLINER_FORM_ENTER_BTN));
        enterBtnOnlForm.click();

        Thread.sleep(3000);

        WebElement onlinerLogin = driver.findElement(By.xpath(OnlinerPage.ONLINER_LOGIN));
        WebElement onlinerPassword = driver.findElement(By.xpath(OnlinerPage.ONLINER_PASSWORD));

        Assert.assertEquals(OnlinerPage.loginErrText, onlinerLogin.getText());
        Assert.assertEquals(OnlinerPage.PasswordTextErr, onlinerPassword.getText());
        driver.quit();
    }

    @Test

    public void testOnlinerLoginFormWithEmptyPassword() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OnlinerPage.URL_ONLINER);

        WebElement enterBtnOnliner = driver.findElement(By.xpath(OnlinerPage.ONLINER_ENTER_BTN));
        enterBtnOnliner.click();
        //Thread.sleep(3000);

        WebElement sendKeyLogin = driver.findElement(By.xpath(OnlinerPage.EMAIL_ENTRANCE_WINDOW));
        sendKeyLogin.sendKeys("test@gmail.com");

        WebElement enterBtnOnlForm = driver.findElement(By.xpath(OnlinerPage.ONLINER_FORM_ENTER_BTN));
        enterBtnOnlForm.click();
        Thread.sleep(3000);

        WebElement onlinerPassword = driver.findElement(By.xpath(OnlinerPage.ONLINER_PASSWORD));
        Assert.assertEquals(OnlinerPage.PasswordTextErr, onlinerPassword.getText());

        driver.quit();
    }




}
