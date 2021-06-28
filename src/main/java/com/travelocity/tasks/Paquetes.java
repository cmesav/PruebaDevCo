package com.travelocity.tasks;

import com.travelocity.ui.FormularioPaquetes;
import com.travelocity.ui.PaginaInicial;
import com.travelocity.ui.Resultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Paquetes implements Task {

    private final String ciudadOrigen;
    private final String ciudadDestino;
    private final String checkIn;
    private final String checkOut;

    public Paquetes(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.PAQUETES),
                Click.on(FormularioPaquetes.ORIGEN),
                Enter.theValue(ciudadOrigen).into(FormularioPaquetes.INPUT_ORIGEN),
                WaitUntil.the(FormularioPaquetes.VUELO_ORIGEN, WebElementStateMatchers.isVisible()),
                Click.on(FormularioPaquetes.VUELO_ORIGEN),
                Click.on(FormularioPaquetes.DESTINO),
                Enter.theValue(ciudadDestino).into(FormularioPaquetes.INPUT_DESTINO),
                WaitUntil.the(FormularioPaquetes.VUELO_DESTINO, WebElementStateMatchers.isVisible()),
                Click.on(FormularioPaquetes.VUELO_DESTINO),
                Click.on(FormularioPaquetes.CHECK_IN),
                Click.on(FormularioPaquetes.FECHA_UNO.of(checkIn)),
                Click.on(FormularioPaquetes.FECHA_DOS.of(checkOut)),
                Click.on(FormularioPaquetes.BTN_LISTO),
                Click.on(FormularioPaquetes.BTN_BUSCAR)
        );

    }

    public static Paquetes buscar(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        return Tasks.instrumented(Paquetes.class, ciudadOrigen, ciudadDestino, checkIn, checkOut);
    }
}
