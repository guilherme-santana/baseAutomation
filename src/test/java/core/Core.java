package core;

import constants.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.Login;

import java.util.concurrent.TimeUnit;

public class Core {
    protected String url;
    protected WebDriver driver;
    protected SoftAssert softAssert;
    protected WebDriverWait wait;

    protected Login login;


    @BeforeMethod
    public void init() throws InterruptedException {
        url = Constants.URL;
        System.setProperty(Constants.WEB_DRIVER_CHROME, Constants.PATH_CHROME_DRIVER);
        softAssert = new SoftAssert();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 30);
        login = new Login(driver, softAssert,wait);
        driver.get(url);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

}
