package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Traducir implements Task {

    private String palabra;

    public Traducir(String palabra){
        this.palabra = palabra;
    }


    public static Traducir laPalabra(String palabra) {
        return instrumented(Traducir.class,palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_ORIGEN_INGLES));
        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTranslatePage.TEXTO_IDIOMA_ORIGEN));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_ESPANIOL));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_ESPANIOL));
    }
}
