package com.travelocity.questions;

import com.travelocity.ui.CheckOut;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElElemento implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CheckOut.BTN_COMPLETAR.resolveFor(actor).isDisplayed();
    }

    public static ElElemento esta(){
        return new ElElemento();
    }
}
