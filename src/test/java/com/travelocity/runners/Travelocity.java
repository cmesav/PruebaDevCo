package com.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/verificar_recaptcha.feature",
        "src/test/resources/features/buscar.feature"},
        glue = {"com.travelocity.setup", "com.travelocity.stepdefinitions"},
        snippets = SnippetType.CAMELCASE, tags = "")
public class Travelocity {
}
