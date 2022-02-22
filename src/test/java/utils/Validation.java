package utils;

import org.testng.asserts.SoftAssert;

public class Validation {

    SoftAssert softAssert;

    public Validation(SoftAssert softAssert) {
        this.softAssert = softAssert;
    }

    public void validaTexto(String textoAtual, String textoEsperado, String validacao) {
        System.out.println("Atual: " + textoAtual + " : Esperado: " + textoEsperado + " Valição: " + validacao);
        softAssert.assertEquals(textoAtual, textoEsperado, validacao);
    }
}
