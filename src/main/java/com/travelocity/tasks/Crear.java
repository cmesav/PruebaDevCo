package com.travelocity.tasks;

import com.travelocity.models.Usuario;
import com.travelocity.ui.CrearCuenta;
import com.travelocity.ui.PaginaInicial;
import com.travelocity.utils.Devolver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Crear implements Task {

    Usuario usuario;

    public Crear(Usuario usuario) {
        this.usuario = usuario;
    }

    public static Crear cuentaCon(Usuario usuario) {
        return Tasks.instrumented(Crear.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        Usuario usuario = new Usuario();
        actor.attemptsTo(Click.on(PaginaInicial.INICIAR_SESION),
                Click.on(PaginaInicial.CREAR_CUENTA),
                Enter.theValue(usuario.getNombre()).into(CrearCuenta.NOMBRE),
                Enter.theValue(usuario.getApellido()).into(CrearCuenta.APELLIDOS),
                Enter.theValue(Devolver.email()).into(CrearCuenta.CORREO),
                Enter.theValue(usuario.getPassword()).into(CrearCuenta.PASSWORD),
                Enter.theValue(usuario.getPassword()).into(CrearCuenta.CONFIRMA_PASSWORD),
                Click.on(CrearCuenta.CHECK_BOX),
                Click.on(CrearCuenta.BTN_CREAR)
                );

    }
}
