package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioVuelos {

    public static final Target ORIGEN = Target.the("Campo origen")
            .locatedBy("//button[@aria-label='Leaving from']");

    public static final Target INPUT_ORIGEN = Target.the("Input Origen")
            .located(By.id("location-field-leg1-origin"));

    public static final Target VUELO_ORIGEN = Target.the("Aeropuerto Origen")
            .locatedBy("(//*[contains(@data-stid,'field-leg1-origin')])[6]");

    public static final Target DESTINO = Target.the("Campo destino")
            .locatedBy("//button[@aria-label='Going to']");

    public static final Target INPUT_DESTINO = Target.the("Input destino")
            .located(By.id("location-field-leg1-destination"));

    public static final Target VUELO_DESTINO = Target.the("Aeropuerto Destino")
            .locatedBy("(//*[contains(@data-stid,'field-leg1-destination')])[6]");

    public static final Target CHECK_IN = Target.the("Check In")
            .located(By.id("d1-btn"));

    public static final Target FECHA_UNO = Target.the("Dia {0}")
            .locatedBy("(//table//button[contains(@data-day,'{0}')])[1]");

    public static final Target FECHA_DOS = Target.the("Dia {0}")
            .locatedBy("(//table//button[contains(@data-day,'{0}')])[2]");

    public static final Target BTN_LISTO = Target.the("Boton Listo")
            .locatedBy("//span[contains(text(),'Done')]");

    public static final Target BTN_BUSCAR = Target.the("Boton Buscar")
            .locatedBy("//button[contains(text(),'Search')]");

}
