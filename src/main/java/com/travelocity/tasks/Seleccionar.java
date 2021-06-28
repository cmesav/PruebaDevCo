package com.travelocity.tasks;

import com.travelocity.interactions.Cambiar;
import com.travelocity.ui.CheckOut;
import com.travelocity.ui.Detalles;
import com.travelocity.ui.Hotel;
import com.travelocity.ui.Resultados;
import com.travelocity.utils.MenorValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;

public class Seleccionar implements Task {

    private final ArrayList<String> precioNoche = new ArrayList<>();
    private final ArrayList<String> precioAdicional = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue("PRICE_LOW_TO_HIGH").from(Resultados.ORDENAR_HOTEL),
                WaitUntil.the(Resultados.HOTEL_BARATO.of("1"), WebElementStateMatchers.isClickable()),
                WaitUntil.the(Resultados.BTN_MOSTAR_MAS, WebElementStateMatchers.isClickable()),
                Scroll.to(Resultados.BTN_MOSTAR_MAS)
        );

        for (int i = 0; i < Resultados.LISTA_PRECIOS.resolveAllFor(actor).size(); i++) {
            precioNoche.add(Resultados.PRECIO.of(String.valueOf(i + 1)).resolveFor(actor).getText()
                    .replace("$", ""));
        }
        actor.attemptsTo(Scroll.to(Resultados.ORDENAR_HOTEL));

        String nombreHotel = Resultados.NOMBRE_HOTEL.of(String
                .valueOf(MenorValor.enHotel(precioNoche))).resolveFor(actor).getText();

        actor.attemptsTo(
                Click.on(Resultados.HOTEL_BARATO.of(String.valueOf(MenorValor.enHotel(precioNoche)))),
                Cambiar.ventana(nombreHotel),
                WaitUntil.the(Hotel.NOMBRE_HOTEL, WebElementStateMatchers.isVisible()),
                Scroll.to(Hotel.NOMBRE_HOTEL));

        for (int i = 0; i < Hotel.LISTA_CUARTOS.resolveAllFor(actor).size(); i++) {
            precioAdicional.add(Hotel.PRECIO_ADICIONAL.of(String.valueOf(i + 1)).resolveFor(actor).getText()
                    .replace("+ $", ""));
        }

        actor.attemptsTo(
                Click.on(Hotel.BTN_RESERVAR.of(String.valueOf(MenorValor.enHotel(precioAdicional)))),
                Click.on(Resultados.SELECCIONA_VUELO.of("1")),
                Click.on(Resultados.CONFIRMA_VUELO),
                WaitUntil.the(Resultados.SELECCIONA_VUELO.of("1"), WebElementStateMatchers.isClickable()),
                Click.on(Resultados.SELECCIONA_VUELO.of("1")),
                Click.on(Resultados.CONFIRMA_VUELO)
                );

        actor.attemptsTo(WaitUntil.the(Detalles.BTN_CONTINUAR, WebElementStateMatchers.isVisible()),
                Click.on(Detalles.BTN_CONTINUAR),
                WaitUntil.the(CheckOut.TITULO, WebElementStateMatchers.isVisible())
                );
    }

    public static Seleccionar masBarato() {
        return Tasks.instrumented(Seleccionar.class);
    }
}
