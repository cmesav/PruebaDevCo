package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Hotel {

    public static final Target NOMBRE_HOTEL = Target.the("Nombre Hotel")
            .locatedBy("(//*[contains(@class,'uitk-heading')])[1]");

    public static final Target BTN_RESERVAR_CUARTO = Target.the("Boton reservar cuarto")
            .locatedBy("//button[@data-stid='sticky-button']");

    public static final Target LISTA_CUARTOS = Target.the("Lista de cuartos disponibles")
            .locatedBy("//button[@data-stid='submit-hotel-reserve']");

    public static final Target BTN_RESERVAR = Target.the("Boton reservar opcion {0}")
            .locatedBy("(//button[@data-stid='submit-hotel-reserve'])[{0}]");

    public static final Target PRECIO_ADICIONAL = Target.the("Valor adicional")
            .locatedBy("(//span[@data-stid='price-lockup-text'])[{0}]");


}
