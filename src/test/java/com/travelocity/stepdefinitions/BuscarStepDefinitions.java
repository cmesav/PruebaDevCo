package com.travelocity.stepdefinitions;

import com.travelocity.questions.LaLista;
import com.travelocity.tasks.Hospedaje;
import com.travelocity.tasks.Vuelos;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BuscarStepDefinitions {

    @Cuando("^busca hospedaje para el destino \"([^\"]*)\" con fechas \"([^\"]*)\" y \"([^\"]*)\"$")
    public void buscaHospedajeParaElDestinoConFechasY(String ciudad, String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(Hospedaje.buscar(ciudad, checkIn, checkOut));
    }

    @Entonces("^verá el listado de hoteles disponibles$")
    public void veráElListadoDeHotelesDisponibles() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LaLista.deResultados(),
                Matchers.equalTo(true)));
    }

    @Cuando("^busca disponibilidad de vuelos con origen \"([^\"]*)\" destino \"([^\"]*)\" y fechas \"([^\"]*)\" y \"([^\"]*)\"$")
    public void buscaDisponibilidadDeVuelosConOrigenDestinoYFechasY(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(Vuelos.buscar(ciudadOrigen, ciudadDestino, checkIn, checkOut));
    }

    @Entonces("^vera el listado de vuelos disponibles$")
    public void veraElListadoDeVuelosDisponibles() {

    }
}
