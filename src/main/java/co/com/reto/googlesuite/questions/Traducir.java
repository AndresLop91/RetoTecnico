package co.com.reto.googlesuite.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.reto.googlesuite.userinterfaces.GoogleTranslatePage.TRADUCCION;

public class Traducir implements Question {

    private String traduccion;

    public Traducir(String traduccion) {
        this.traduccion = traduccion;
    }

    public static Question laPalabraTraducidaEsCorrecta(String traduccion) {
        return new Traducir(traduccion);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoObtenido = TRADUCCION.of(traduccion).resolveFor(actor).getText();
        String resultadoEsperado = traduccion;

        return resultadoObtenido.equals(resultadoEsperado);
    }
}
