package co.com.reto.googlesuite.stepdefinitions;

import co.com.reto.googlesuite.exceptions.FalloEnLaTraduccion;
import co.com.reto.googlesuite.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.reto.googlesuite.exceptions.FalloEnLaTraduccion.FALLO_TRADUCCION;
import static co.com.reto.googlesuite.questions.Traducir.laPalabraTraducidaEsCorrecta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GoogleTraslateStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor andres = Actor.named("Andres");

    @Before
    public void setUp () {
        hisBrowser.manage().window().maximize();
        hisBrowser.manage().deleteAllCookies();
        andres.can(BrowseTheWeb.with(hisBrowser));

    }

    @Dado("^que Andres quiere traducir una palabra$")
    public void queAndresQuiereTraducirUnaPalabra() throws Exception {
        andres.wasAbleTo(AbrirNavegador.en());
        andres.wasAbleTo( Ir.laAplicacion());

    }


    @Cuando("^el traduce la palabra (.*)de ingles a español$")
    public void elTraduceLaPalabraHouseDeInglesAEspaniol(String palabra) throws Exception {
        andres.wasAbleTo(Traducir.laPalabra(palabra));



    }

    @Entonces("^el deberia ver la palabra (.*) en la pantalla$")
    public void elDeberiaVerLaPalabraCasaEnLaPantalla(String traduccion) throws Exception {
        andres.should(seeThat(laPalabraTraducidaEsCorrecta(traduccion)).orComplainWith(FalloEnLaTraduccion.class,FALLO_TRADUCCION));
    }

    @Cuando("^el traduce la palabra (.*) de espaniol a ingles$")
    public void elTraduceLaPalabraPerroDeEspaniolAIngles(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDeEspaniolAIngles.laPalabraEspaniolAInlges(palabra));

    }

    @Cuando("^el traduce la palabra (.*) del espaniol a frances$")
    public void elTraduceLaPalabraGatoDelEspaniolAFrances(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDelEspaniolAlFrances.laPalabraEspaniolAFrances(palabra));
    }

    @Cuando("^el traduce la palabra (.*) del espaniol al espaniol$")
    public void elTraduceLaPalabraFutbolDelEspaniolAlEspaniol(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDelEspaniolAlEspaniol.laPalabraEspaniolAlEspaniol(palabra));

    }

    @Cuando("^el traduce la palabra (.*) del ingles al ingles$")
    public void elTraduceLaPalabraMusicaDelInglesAlIngles(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDeInglesAIngles.laPalabraInglesAIngles(palabra));
    }

    @Cuando("^el traduce la palabra (.*) del espaniol al portugues$")
    public void elTraduceLaPalabraFelicidadDelEspaniolAlPortugues(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDelEspaniolAlPortugues.laPalabraEspaniolAlPortugues(palabra));
    }

    @Cuando("^el traduce la palabra (.*) del espaniol al$")
    public void elTraduceLaPalabraFelicidadDelEspaniolAlNoruego(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDelEspaniolAlPortugues.laPalabraEspaniolAlPortugues(palabra));
    }

    @Cuando("^el traduce la palabra (.*) del espaniol al noruego$")
    public void elTraduceLaPalabraObrigadaDelEspaniolAlNoruego(String palabra) throws Exception {
        andres.wasAbleTo(TraducirDelPortuguesAlIngles.laPalabraDelPortuguesAlIngles(palabra));
    }
}
