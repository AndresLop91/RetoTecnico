package co.com.reto.googlesuite.tasks;

import co.com.reto.googlesuite.userinterfaces.GoogleApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ir implements Task {

    public static Ir laAplicacion() {
        return instrumented(Ir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(GoogleApp.GOOGLE_APPS));
       // BrowseTheWeb.as(actor).getDriver().switchTo().frame(GoogleApp.FRAME_GOOGLE_APPS.resolveFor(actor));
       //actor.attemptsTo(Click.on(GoogleApp.GOOGLE_TRANSLATE));

    }
}
