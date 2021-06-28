package com.travelocity.questions;

import com.travelocity.ui.CrearCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElCaptcha implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the("//*[@title='recaptcha challenge']",
                WebElementStateMatchers.isVisible()));
        BrowseTheWeb.as(actor).getDriver().switchTo().frame((WebElement) BrowseTheWeb.as(actor).getDriver()
                .findElement(By.xpath("//*[@title='recaptcha challenge']")));
        return CrearCuenta.CAPTCHA.resolveFor(actor).isVisible();
    }

    public static ElCaptcha aparecio() {
        return new ElCaptcha();
    }
}
