package com.co.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorLibLoginPage extends PageObject {
    //CampoUsuario
    @FindBy(xpath = "//*[@id='login']/form/input[1]")
    public WebElementFacade txtUsername;

    //CampoPassword
    @FindBy(xpath = "//*[@id='login']/form/input[2]")
    public WebElementFacade txtPassword;

    //BotonIngresar
    @FindBy(xpath = "//*[@id='login']/form/button")
    public WebElementFacade btnSignIn;

    //Label del home
    @FindBy(xpath = "//*[@id='bootstrap-admin-template']")
    public WebElementFacade LblHome;

    public void IngresarDatos(String Usuario, String Password){
        txtUsername.sendKeys(Usuario);
        txtPassword.sendKeys(Password);
        btnSignIn.click();
    }

    public void VerificarHome(){
        String labelv = "Bootstrap-Admin-Template";
        String strMensaje = LblHome.getText();
        assertThat(strMensaje, containsString(labelv));
    }

}
