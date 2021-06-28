package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOut {

    private CheckOut() {
    }

    public static final Target TITULO = Target.the("Titulo")
            .locatedBy("//*[@class='flights']");

    public static final Target BTN_COMPLETAR = Target.the("Boton completar")
            .located(By.id("complete-booking"));

}
