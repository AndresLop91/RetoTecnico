package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TraducirDelEspaniolAlNoruego implements Task {

    private String palabra;

    public TraducirDelEspaniolAlNoruego(String palabra){
        this.palabra = palabra;
    }


    public static TraducirDelEspaniolAlNoruego laPalabraEspaniolAlNoruego(String palabra) {
        return instrumented(TraducirDelEspaniolAlNoruego.class,palabra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTranslatePage.TEXTO_IDIOMA_ORIGEN));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_ORIGEN_INGLES_ALT));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_INGLES_ALT));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_INGLES_ALT));

    }
}