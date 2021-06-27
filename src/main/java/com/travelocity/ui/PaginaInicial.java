package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    public static final Target INICIAR_SESION = Target.the("Iniciar sesion")
            .located(By.id("gc-custom-header-nav-bar-acct-menu"));

    public static final Target CREAR_CUENTA = Target.the("Crear cuenta")
            .locatedBy("//*[@id='gc-custom-header-nav-bar-acct-menu']//*[contains(text(),'Create a free account')]");


}
