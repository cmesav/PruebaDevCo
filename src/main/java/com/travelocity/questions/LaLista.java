package com.travelocity.questions;

import com.travelocity.ui.Resultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaLista implements Question<Boolean> {

    private final String parametro;

    public LaLista(String parametro) {
        this.parametro = parametro;
    }

    public static LaLista deResultados(String parametro) {
        return new LaLista(parametro);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (parametro.equals("hoteles")) {
            return !Resultados.LISTA_HOTELES.resolveAllFor(actor).isEmpty();
        }else if (parametro.equals("vuelos")){
            return !Resultados.LISTA_VUELOS.resolveAllFor(actor).isEmpty();
        }else {
            return false;
        }
    }
}
