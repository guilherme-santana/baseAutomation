package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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


    public Login(WebDriver driver, SoftAssert softAssert, WebDriverWait wait) {
        super(driver, wait);
        this.valida = new Validation(softAssert);
    }

    public void preencherUsername(String username){
        preencherCampo(USERNAME,username);
    }

    public void preencherPassword(String password) {
        preencherCampo(PASSWORD,password);
    }

    public void clicarSingIn(){
        clicar(SINGIN);
    }
}
