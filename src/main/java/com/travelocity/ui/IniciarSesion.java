package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesion {

    public static final Target USUARIO = Target.the("Iniciar sesion")
            .located(By.id("signin-loginid"));

    public static final Target PASSWORD = Target.the("Iniciar sesion")
            .located(By.id("signin-password"));

    public static final Target BTN_INICIAR = Target.the("Iniciar sesion")
            .located(By.id("submitButton"));


}
