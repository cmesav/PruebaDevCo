package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuenta {

    public static final Target NOMBRE = Target.the("campo Nombre")
            .located(By.id("create-account-firstname"));

    public static final Target APELLIDOS = Target.the("Apellidos")
            .located(By.id("create-account-lastname"));

    public static final Target CORREO = Target.the("Direccion de correo electronico")
            .located(By.id("create-account-emailId"));

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("create-account-password"));

    public static final Target CONFIRMA_PASSWORD = Target.the("Confirmar Password")
            .located(By.id("create-account-confirm-password"));

    public static final Target CHECK_BOX = Target.the("Check Acepta terminos")
            .located(By.id("create-account-expedia-policy"));

    public static final Target BTN_CREAR = Target.the("Check Acepta terminos")
            .located(By.id("create-account-submit-button"));

    public static final Target CAPTCHA = Target.the("Check Acepta terminos")
            .locatedBy("//*[@id='rc-imageselect']//*[contains(text(),'Select all')]");


}
