package co.com.demo.stepdefinitions;

import com.co.demo.steps.ColorlibFormValidationSteps;
import com.co.demo.steps.PopupValidationSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PopupValidationStepDefinitions {
    @Steps
    PopupValidationSteps popupValidationSteps;
    @Steps
    ColorlibFormValidationSteps colorlibFormValidationSteps;

    @Given("Me autentico en colorlib con usuario {string} y clave {string}")
    public void meAutenticoEnColorlibConUsuarioYClave(String usuario, String clave) {
        popupValidationSteps.login_colorlib(usuario, clave);
    }

    @Given("Ingreso a la funcionalidad Forms Validation")
    public void ingresoALaFuncionalidadFormsValidation() {
        popupValidationSteps.ingresar_form_validation();
    }

    @When("Diligencio el formulario Popup Validation")
    public void diligencioElFormularioPopupValidation(DataTable dtDatosForm) {

        List<List<String>> data = dtDatosForm.cells();


        System.out.println(data.get(1).get(2));
        System.out.println(data.get(1).get(0).trim());

        for (int i = 1; i < data.size(); i++) {
            colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
        }


    }

    @Then("Verifico el ingreso eXitoso")
    public void verificoElIngresoEcitoso() {
        colorlibFormValidationSteps.diligenciarFormSinErrores();
    }
}
