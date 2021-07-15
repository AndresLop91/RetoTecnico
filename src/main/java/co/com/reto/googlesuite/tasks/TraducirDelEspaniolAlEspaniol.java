package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TraducirDelEspaniolAlEspaniol implements Task {

    private String palabra;

    public TraducirDelEspaniolAlEspaniol(String palabra){
        this.palabra = palabra;
    }


    public static TraducirDelEspaniolAlEspaniol laPalabraEspaniolAlEspaniol(String palabra) {
        return instrumented(TraducirDelEspaniolAlEspaniol.class,palabra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTranslatePage.TEXTO_IDIOMA_ORIGEN));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_ORIGEN_ESPANIOL_ALT));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_ESPANIOL_ALT));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_ESPANIOL_ALT));

    }
}