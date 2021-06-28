package com.travelocity.tasks;

import com.travelocity.ui.IniciarSesion;
import com.travelocity.ui.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Iniciar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.MENU_INICIAR_SESION),
                Click.on(PaginaInicial.BTN_INICIAR_SESION),
                Enter.theValue(System.getProperty("user")).into(IniciarSesion.USUARIO),
                Enter.theValue(System.getProperty("password")).into(IniciarSesion.PASSWORD),
                Click.on(IniciarSesion.BTN_INICIAR)
        );
    }

    public static Iniciar sesion() {
        return Tasks.instrumented(Iniciar.class);
    }
}
