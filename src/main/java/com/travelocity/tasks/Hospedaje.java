package com.travelocity.tasks;

import com.travelocity.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Hospedaje implements Task {

    private final String ciudad;
    private final String checkIn;
    private final String checkOut;

    public Hospedaje(String ciudad, String checkIn, String checkOut) {
        this.ciudad = ciudad;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.DESTINO),
                Enter.theValue(ciudad).into(PaginaInicial.INPUT),
                WaitUntil.the(PaginaInicial.CIUDAD_HOTEL, WebElementStateMatchers.isVisible()),
                Click.on(PaginaInicial.CIUDAD_HOTEL),
                Click.on(PaginaInicial.CHECK_IN),
                Click.on(PaginaInicial.FECHA_UNO.of(checkIn)),
                Click.on(PaginaInicial.FECHA_DOS.of(checkOut)),
                Click.on(PaginaInicial.BTN_LISTO),
                Click.on(PaginaInicial.BTN_BUSCAR)
        );
    }

    public static Hospedaje buscar(String ciudad, String checkIn, String checkOut) {
        return Tasks.instrumented(Hospedaje.class, ciudad, checkIn, checkOut);
    }
}
