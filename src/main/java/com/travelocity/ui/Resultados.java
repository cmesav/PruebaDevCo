package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Resultados {

    private Resultados() {
    }

    public static final Target HOTELES = Target.the("Resultados de busqueda Hoteles")
            .locatedBy("//*[@data-stid='open-hotel-information']");

    public static final Target VUELOS = Target.the("Resultados de busqueda Vuelos")
            .locatedBy("//*[@data-test-id='select-link']");


}
