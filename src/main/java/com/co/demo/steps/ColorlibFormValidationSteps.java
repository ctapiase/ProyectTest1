package com.co.demo.steps;


import com.co.demo.pageobjects.ColorlibFormValidationPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ColorlibFormValidationSteps {
    ColorlibFormValidationPage colorlibFormValidationPage;
    @Step
    public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {

        colorlibFormValidationPage.Required(data.get(id).get(0).trim());
        colorlibFormValidationPage.SelectSport(data.get(id).get(1).trim());
        colorlibFormValidationPage.MultiSport(data.get(id).get(2).trim());
        colorlibFormValidationPage.MultiSport(data.get(id).get(3).trim());
        colorlibFormValidationPage.Url(data.get(id).get(4).trim());
        colorlibFormValidationPage.Email(data.get(id).get(5).trim());
        colorlibFormValidationPage.Password(data.get(id).get(6).trim());
        colorlibFormValidationPage.ConfPassword(data.get(id).get(7).trim());
        colorlibFormValidationPage.MaxSize(data.get(id).get(9).trim());
        colorlibFormValidationPage.MinSize(data.get(id).get(8).trim());
        colorlibFormValidationPage.Number(data.get(id).get(10).trim());
        colorlibFormValidationPage.Ip(data.get(id).get(11).trim());
        colorlibFormValidationPage.Date(data.get(id).get(12).trim());
        colorlibFormValidationPage.EarliDate(data.get(id).get(13).trim());
        colorlibFormValidationPage.btnValidation();
    }

    @Step
    public void diligenciarFormSinErrores(){
        colorlibFormValidationPage.globoInformativoSinError();
    }

    @Step
    public void diligenciarFormConError(){
        colorlibFormValidationPage.globoInformativoConError();
    }
}
