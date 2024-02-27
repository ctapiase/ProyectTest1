
Feature: Formulario Popup Validation
  Yo como usuario
  Quiero ingresar al formulario
  Para realizar validaciones de obligatoriedad

  @Autenticacion
  Scenario: Diligenciamiento exitoso del formulario Popup Validation, no se presenta ningun mensage de validacion
    Given Me autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio el formulario Popup Validation
      | Required | Select | MultipleSelect | MultipleSelect2 | Url            | E-mail          | Password | Confirm Password | Minimum field size | Maximum field size | Number   | IP           | Date       | Date Earlier |
      | valor    | Tennis | Golf           | Football        | http://url.com | email@email.com | password | password         | 234564             | 1234               | -343.878 | 192.168.3.99 | 2024-02-21 | 2011-11-11   |
    Then Verifico el ingreso eXitoso

  Scenario Outline: Titulo del esenario
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step
    Examples:
      | name  | value | status  |
      | name1 | 5     | success |
      | name2 | 7     | fail    |