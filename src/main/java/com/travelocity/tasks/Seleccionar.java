package com.travelocity.tasks;

import com.travelocity.ui.Resultados;
import com.travelocity.utils.MenorValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Seleccionar implements Task {

    private ArrayList<String> values = new ArrayList<String>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue("PRICE_LOW_TO_HIGH").from(Resultados.ORDENAR),
                WaitUntil.the(Resultados.BTN_MOSTAR_MAS,
                        WebElementStateMatchers.isClickable()),
                Scroll.to(Resultados.BTN_MOSTAR_MAS)
        );

        for (int i = 0; i < Resultados.LISTA_PRECIOS.resolveAllFor(actor).size(); i++) {
            values.add(Resultados.PRECIO.of(String.valueOf(i+1)).resolveFor(actor).getText()
                    .replace("$",""));
        }
        System.out.println("prueba "+ (MenorValor.enHotel(values)));
        actor.attemptsTo(
                Scroll.to(Resultados.ORDENAR),
                Click.on(Resultados.HOTEL_BARATO.of(String.valueOf(MenorValor.enHotel(values)))));
    }

    public static Seleccionar hotelMasBarato() {
        return Tasks.instrumented(Seleccionar.class);
    }
}
