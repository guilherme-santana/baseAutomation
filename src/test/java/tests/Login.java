package tests;

import core.Core;
import org.testng.annotations.Test;

public class Login extends Core {

    @Test
    public void Ct01_loginComSucesso(){
        login.preencherUsername("teste");
        login.preencherPassword("123456");
        login.clicarSingIn();
        softAssert.assertAll();

    }
}
