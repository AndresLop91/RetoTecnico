package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TraducirDeEspaniolAIngles implements Task {

    private String palabra;

    public TraducirDeEspaniolAIngles(String palabra){
        this.palabra = palabra;
    }


    public static TraducirDeEspaniolAIngles laPalabraEspaniolAInlges(String palabra) {
        return instrumented(TraducirDeEspaniolAIngles.class,palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_ORIGEN_ESPANIOL));
        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTranslatePage.TEXTO_IDIOMA_ORIGEN));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_INGLES));
    }
}
