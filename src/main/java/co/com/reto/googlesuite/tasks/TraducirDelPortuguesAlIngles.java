package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TraducirDelPortuguesAlIngles implements Task {

    private String palabra;

    public TraducirDelPortuguesAlIngles(String palabra){
        this.palabra = palabra;
    }


    public static TraducirDelPortuguesAlIngles laPalabraDelPortuguesAlIngles(String palabra) {
        return instrumented(TraducirDelPortuguesAlIngles.class,palabra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(palabra).into(GoogleTranslatePage.TEXTO_IDIOMA_ORIGEN));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_ORIGEN_PORTUGUES));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_INGLES_POR));
        actor.attemptsTo(Click.on(GoogleTranslatePage.IDIOMA_DESTINO_INGLES_POR));

    }
}
