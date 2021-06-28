package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cuenta {

    public static final Target NOMBRE_CTA = Target.the("Nombre de la cuenta")
            .located(By.id("gc-custom-header-nav-bar-acct-menu"));


}
