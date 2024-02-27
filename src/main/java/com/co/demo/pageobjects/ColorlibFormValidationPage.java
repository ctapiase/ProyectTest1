package com.co.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.hamcrest.Matchers.containsString;

public class ColorlibFormValidationPage extends PageObject {
    @FindBy(xpath = "//*[@id='req']")
    public WebElementFacade txtrequired;

    @FindBy(xpath = "//*[@id='sport']")
    public WebElementFacade cmbSport1;

    @FindBy(xpath = "//*[@id='url1']")
    public WebElementFacade txtUrl;

    @FindBy(xpath = "//*[@id='email1']")
    public WebElementFacade txtEmail;

    @FindBy(xpath = "//*[@id='pass1']")
    public WebElementFacade txtPassword;

    @FindBy(xpath = "//*[@id='pass2']")
    public WebElementFacade txtConfPassword;

    @FindBy(xpath = "//*[@id='minsize1']")
    public WebElementFacade txtMinSize;

    @FindBy(xpath = "//*[@id='maxsize1']")
    public WebElementFacade txtMaxSize;

    @FindBy(xpath = "//*[@id='number2']")
    public WebElementFacade txtNumber;

    @FindBy(xpath = "//*[@id='ip']")
    public WebElementFacade txtIp;

    @FindBy(xpath = "//*[@id='date3']")
    public WebElementFacade txtDate;

    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade txtDateEarlier;
    @FindBy(xpath = "//*[@id='sport2']")
    public WebElementFacade txtMultiSport;

    @FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
    public WebElementFacade btnValidation;

    @FindBy(xpath = "//DIV[@class='formErrorContent']")
    public WebElementFacade globoInformativo;



    public void globoInformativoSinError(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(false));
    }

    public void globoInformativoConError(){
        assertThat(globoInformativo.isCurrentlyVisible(), is(true));
    }

    public void btnValidation(){
        btnValidation.click();
    }

    public void MultiSport(String datoPrueba){
        txtMultiSport.selectByVisibleText(datoPrueba);
    }

    public void Required(String datoPrueba) {
        txtrequired.click();
        txtrequired.clear();
        txtrequired.sendKeys(datoPrueba);
    }

    public void SelectSport(String datoPrueba) {
        cmbSport1.click();
        cmbSport1.selectByVisibleText(datoPrueba);
    }

    public void Url(String datoPrueba) {
        txtUrl.click();
        txtUrl.clear();
        txtUrl.sendKeys(datoPrueba);
    }

    public void Email(String datoPrueba) {
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(datoPrueba);
        txtEmail.sendKeys("jjj");
    }

    public void Password(String datoPrueba){
        txtPassword.click();
        txtPassword.clear();
        txtPassword.sendKeys(datoPrueba);
    }

    public void ConfPassword(String datoPrueba){
        txtConfPassword.click();
        txtConfPassword.clear();
        txtConfPassword.sendKeys(datoPrueba);
    }

    public void MinSize(String datoPrueba){
        txtMinSize.click();
        txtMinSize.clear();
        txtMinSize.sendKeys(datoPrueba);
    }

    public void MaxSize(String datoPrueba){
        txtMaxSize.click();
        txtMaxSize.clear();
        txtMaxSize.sendKeys(datoPrueba);
    }

    public void Number(String datoPrueba){
        txtNumber.click();
        txtNumber.clear();
        txtNumber.sendKeys(datoPrueba);
    }

    public void Ip(String datoPrueba){
        txtIp.click();
        txtIp.clear();
        txtIp.sendKeys(datoPrueba);
    }

    public void Date(String datoPrueba){
        txtDate.click();
        txtDate.clear();
        txtDate.sendKeys(datoPrueba);
    }

    public void EarliDate(String datoPrueba){
        txtDateEarlier.click();
        txtDateEarlier.clear();
        txtDateEarlier.sendKeys(datoPrueba);
    }
}
