package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ElTexto implements Question<String> {

    Target elemento;

    public ElTexto(Target elemento){
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elemento).viewedBy(actor).asString();
    }

    public static ElTexto enElCampo(Target elemento){
        return new ElTexto(elemento);
    }
}
