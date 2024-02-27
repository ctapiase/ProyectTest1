package co.com.demo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/popup_validation.feature",
        glue = "co.com.demo.stepdefinitions",
        tags = "@Autenticacion",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PopupValidationRunner {
}
