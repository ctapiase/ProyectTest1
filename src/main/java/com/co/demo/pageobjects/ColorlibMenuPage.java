package com.co.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {
    //Forms
    @FindBy(xpath = "//*[@id='menu']/li[6]/a")
    public WebElementFacade menuForm;

    //SubFormValidation
                                                                                    @FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[2]/a")
                                                                                    public WebElementFacade menuFormValidation;

    //PopupValidation
    @FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
    public WebElementFacade popupValidation;

    //SubFormGeneral
    @FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
    public WebElementFacade formGeneral;

    public void menuFormValidation(){
        menuForm.click();
        menuFormValidation.click();
        String strMensaje = popupValidation.getText();
        assertThat(strMensaje, containsString("Popup Validation"));
    }
}
