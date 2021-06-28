package com.travelocity.tasks;

import com.travelocity.ui.FormularioVuelos;
import com.travelocity.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Vuelos implements Task {

    private final String ciudadOrigen;
    private final String ciudadDestino;
    private final String checkIn;
    private final String checkOut;

    public Vuelos(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.VUELOS),
                Click.on(FormularioVuelos.ORIGEN),
                Enter.theValue(ciudadOrigen).into(FormularioVuelos.INPUT_ORIGEN),
                WaitUntil.the(FormularioVuelos.VUELO_ORIGEN, WebElementStateMatchers.isVisible()),
                Click.on(FormularioVuelos.VUELO_ORIGEN),
                Click.on(FormularioVuelos.DESTINO),
                Enter.theValue(ciudadDestino).into(FormularioVuelos.INPUT_DESTINO),
                WaitUntil.the(FormularioVuelos.VUELO_DESTINO, WebElementStateMatchers.isVisible()),
                Click.on(FormularioVuelos.VUELO_DESTINO),
                Click.on(FormularioVuelos.CHECK_IN),
                Click.on(FormularioVuelos.FECHA_UNO.of(checkIn)),
                Click.on(FormularioVuelos.FECHA_DOS.of(checkOut)),
                Click.on(FormularioVuelos.BTN_LISTO),
                Click.on(FormularioVuelos.BTN_BUSCAR)
        );
    }

    public static Vuelos buscar(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        return Tasks.instrumented(Vuelos.class, ciudadOrigen, ciudadDestino, checkIn, checkOut);
    }
}
