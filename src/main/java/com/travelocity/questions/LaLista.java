package com.travelocity.questions;

import com.travelocity.ui.Resultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaLista implements Question<Boolean> {

    public static LaLista deResultados() {
        return new LaLista();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Resultados.HOTELES.resolveAllFor(actor).size() > 0;
    }
}
