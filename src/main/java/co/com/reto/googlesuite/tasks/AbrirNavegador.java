package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {

    public static AbrirNavegador en() {
        return instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new GoogleHomePage()));
    }
}
