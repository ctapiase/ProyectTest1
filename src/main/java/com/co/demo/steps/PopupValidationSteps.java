package com.co.demo.steps;

import com.co.demo.pageobjects.ColorLibLoginPage;
import com.co.demo.pageobjects.ColorlibFormValidationPage;
import com.co.demo.pageobjects.ColorlibMenuPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class PopupValidationSteps {

    ColorLibLoginPage ColorLibLoginPage;
    ColorlibMenuPage ColorlibMenuPage;
    ColorlibFormValidationPage colorlibFormValidationPage;


    @Step
    public void login_colorlib(String User, String Password) {
        //a. Abrir navegador con la url de prueba
        ColorLibLoginPage.open();
        //b. Ingresar usuario demo
        //c. Ingresar password demo
        //d. Click en botón Sign in
        ColorLibLoginPage.IngresarDatos(User, Password);
        //e. Verificar la Autenticación (label en home)
        ColorLibLoginPage.VerificarHome();
    }
    @Step
    public void ingresar_form_validation(){
        ColorlibMenuPage.menuFormValidation();
    }




}
