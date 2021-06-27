package com.travelocity.setup.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TravelocityHokks {

    @Managed
    private static WebDriver suNavegador;

    @Before
    public void setUpOneStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(suNavegador)));
        OnStage.theActorCalled("Cristian");
    }

    @After
    public void cerrarElEscenario() {
        OnStage.drawTheCurtain();
    }
}
