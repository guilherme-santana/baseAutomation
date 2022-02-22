package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import utils.Validation;

public class Login extends PageFactory{
    Validation valida;

    @FindBy(id = "username")
    private WebElement USERNAME;

    @FindBy(id = "password")
    private WebElement PASSWORD;

    @FindBy(id = "kc-login")
    private WebElement SINGIN;


    public Login(WebDriver driver, SoftAssert softAssert) {
        super(driver);
        this.valida = new Validation(softAssert);
    }

    public void preencherUsername(String username){
        USERNAME.sendKeys(username);
    }

    public void preencherPassword(String password) {
        PASSWORD.sendKeys(password);
    }

    public void clicarSingIn(){
        SINGIN.click();
    }
}
