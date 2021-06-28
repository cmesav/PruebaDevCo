package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Detalles {

    private Detalles() {
    }

    public static final Target TITULO = Target.the("Titulo pagina detalles")
            .locatedBy("(//*[contains(@class,'uitk-heading')])[1]");

    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar")
            .locatedBy("//*[@class='uitk-layout-grid-item']//button[contains(text(),'Next')]");


}
