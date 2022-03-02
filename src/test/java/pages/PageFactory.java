package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public PageFactory(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }


    public void preencherCampo(WebElement element, String texto){
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(texto);
    }

    public void clicar(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

}
