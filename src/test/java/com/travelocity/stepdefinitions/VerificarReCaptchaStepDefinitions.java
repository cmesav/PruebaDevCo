package com.travelocity.stepdefinitions;

import com.travelocity.models.Usuario;
import com.travelocity.questions.ElCaptcha;
import com.travelocity.questions.ElTexto;
import com.travelocity.tasks.Crear;
import com.travelocity.tasks.Iniciar;
import com.travelocity.ui.Cuenta;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class VerificarReCaptchaStepDefinitions {

    @Dado("^que el cliente se encuentra en la pagina de inicio$")
    public void queElClienteSeEncuentraEnLaPaginaDeInicio() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com"));
    }

    @Cuando("^crea una cuenta con los datos$")
    public void creaUnaCuentaConLosDatos(DataTable datos) {
        List<Usuario> datosUsuario = datos.asList(Usuario.class);
        theActorInTheSpotlight().attemptsTo(Crear.cuentaCon(datosUsuario.get(0)));
    }

    @Entonces("^verá la pantalla del captcha$")
    public void veráLaPantallaDelCaptcha() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElCaptcha.aparecio(),
                Matchers.equalTo(true)));
    }

    @Cuando("^inicia sesion con los datos$")
    public void iniciaSesionConLosDatos() {
        theActorInTheSpotlight().attemptsTo(Iniciar.sesion());
    }

    @Entonces("^verá su nombre en la barra de menu$")
    public void veráSuNombreEnLaBarraDeMenu() {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElTexto.enElCampo(Cuenta.NOMBRE_CTA),
               Matchers.equalTo("cristian")));
    }
}
