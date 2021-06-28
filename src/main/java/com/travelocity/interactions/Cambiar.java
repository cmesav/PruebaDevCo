package com.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class Cambiar implements Interaction {
    String titulo;

    public Cambiar(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> pestanas = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String pestana: pestanas){
            BrowseTheWeb.as(actor).getDriver().switchTo().window(pestana);
            if(BrowseTheWeb.as(actor).getDriver().getTitle().contains(titulo)){

                break;
            }
        }
    }

    public static Cambiar ventana(String titulo){
        return Tasks.instrumented(Cambiar.class,titulo);
    }
}
