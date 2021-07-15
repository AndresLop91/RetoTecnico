package co.com.reto.googlesuite.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleApp {
    public static final Target GOOGLE_APPS = Target.the("Google App Button").located(By.id("gbwa"));
    public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").locatedBy("//span[contains(text(),'Traductor')]/..");
    //public static final Target FRAME_GOOGLE_APPS = Target.the("Google Frame Apps").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[13]/a");
}
