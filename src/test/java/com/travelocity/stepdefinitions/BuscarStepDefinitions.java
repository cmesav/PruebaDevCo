package com.travelocity.stepdefinitions;

import com.travelocity.questions.ElElemento;
import com.travelocity.questions.ElTexto;
import com.travelocity.questions.LaLista;
import com.travelocity.tasks.Hospedaje;
import com.travelocity.tasks.Paquetes;
import com.travelocity.tasks.Seleccionar;
import com.travelocity.tasks.Vuelos;
import com.travelocity.ui.CheckOut;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BuscarStepDefinitions {

    @Cuando("^busca hospedaje para el destino \"([^\"]*)\" con fechas \"([^\"]*)\" y \"([^\"]*)\"$")
    public void buscaHospedajeParaElDestinoConFechasY(String ciudad, String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(Hospedaje.buscar(ciudad, checkIn, checkOut));
    }

    @Entonces("^verá el listado de \"([^\"]*)\" disponibles$")
    public void veráElListadoDeDisponibles(String hoteles) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LaLista.deResultados(hoteles),
                Matchers.equalTo(true)));
    }

    @Cuando("^busca disponibilidad de vuelos con origen \"([^\"]*)\" destino \"([^\"]*)\" y fechas \"([^\"]*)\" y \"([^\"]*)\"$")
    public void buscaDisponibilidadDeVuelosConOrigenDestinoYFechasY(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(Vuelos.buscar(ciudadOrigen, ciudadDestino, checkIn, checkOut));
    }

    @Entonces("^vera el listado de \"([^\"]*)\" disponibles$")
    public void veraElListadoDeVuelosDisponibles(String vuelos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LaLista.deResultados(vuelos)));
    }

    @Cuando("^busca paquetes con origen \"([^\"]*)\" destino \"([^\"]*)\" y fechas \"([^\"]*)\" y \"([^\"]*)\"$")
    public void buscaPaquetesConOrigenDestinoYFechasY(String ciudadOrigen, String ciudadDestino, String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(Paquetes.buscar(ciudadOrigen, ciudadDestino, checkIn, checkOut));
    }

    @Y("^selecciona el hotel mas barato y el vuelo$")
    public void seleccionaElHotelMasBaratoYElVuelo() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.masBarato());
    }

    @Entonces("^vera el mensaje \"([^\"]*)\"$")
    public void veraElMensaje(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElTexto.enElCampo(CheckOut.TITULO),
                Matchers.equalTo(mensaje)));
    }

    @Y("^el boton Complete Booking$")
    public void elBotonCompleteBooking() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElElemento.esta(),
                Matchers.equalTo(true)));
    }

    @Cuando("^hace click$")
    public void haceClick() {
        theActorInTheSpotlight().attemptsTo(
                Click.on("//*[@class='uitk-layout-grid-item']//button[contains(text(),'Next')]"),
                WaitUntil.the(CheckOut.TITULO, WebElementStateMatchers.isVisible()));
    }
}
