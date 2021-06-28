package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    private PaginaInicial() {
    }

    public static final Target MENU_INICIAR_SESION = Target.the("Iniciar sesion")
            .located(By.id("gc-custom-header-nav-bar-acct-menu"));

    public static final Target BTN_INICIAR_SESION = Target.the("Iniciar sesion")
            .locatedBy("//*[@id='gc-custom-header-nav-bar-acct-menu']//*[contains(@class,'button-primary')]");

    public static final Target CREAR_CUENTA = Target.the("Crear cuenta")
            .locatedBy("//*[@id='gc-custom-header-nav-bar-acct-menu']//*[contains(text(),'Create a free account')]");

    public static final Target HOSPEDAJE = Target.the("Estadia")
            .locatedBy("//*[contains(@aria-controls,'hotel')]");

    public static final Target DESTINO = Target.the("Campo destino")
            .locatedBy("//*[@class='uitk-faux-input']");

    public static final Target INPUT = Target.the("Input destino")
            .located(By.id("location-field-destination"));

    public static final Target CIUDAD_HOTEL = Target.the("Ciudad destino")
            .locatedBy("(//*[contains(@data-stid,'destination-result-item')])[3]");

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

    public static final Target VUELOS = Target.the("Seccion vuelos")
            .locatedBy("//*[contains(@aria-controls,'flight')]");


}
