package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ElMensaje implements Question<String> {

    Target elemento;

    public ElMensaje(Target elemento){
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elemento).viewedBy(actor).asString();
    }

    public static ElMensaje deRespuestaEn(Target elemento){
        return new ElMensaje(elemento);
    }
}
