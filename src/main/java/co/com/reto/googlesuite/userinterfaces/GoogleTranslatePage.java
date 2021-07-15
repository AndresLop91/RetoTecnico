package co.com.reto.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

    public static final Target IDIOMA_ORIGEN_INGLES = Target.the("Boton para seleccionar idioma origen ingles").located(By.id("i9"));
    public static final Target IDIOMA_DESTINO_ESPANIOL = Target.the("Boton para seleccionar idioma destino español").located(By.id("i12"));
    public static final Target IDIOMA_ORIGEN_ESPANIOL = Target.the("Boton para seleccionar idioma origen español").located(By.id("i10"));
    public static final Target IDIOMA_DESTINO_INGLES = Target.the("Boton para seleccionar idioma destino ingles").located(By.id("i13"));
    public static final Target IDIOMA_ORIGEN_ESPANIOL_FRA = Target.the("Boton para seleccionar idioma origen español").located(By.id("i10"));
    public static final Target IDIOMA_DESTINO_FRANCES = Target.the("Boton para seleccionar idioma destino frances").located(By.id("i14"));
    public static final Target IDIOMA_ORIGEN_ESPANIOL_ALT = Target.the("Boton para seleccionar idioma origen español").located(By.id("i10"));
    public static final Target IDIOMA_DESTINO_ESPANIOL_ALT = Target.the("Boton para seleccionar idioma destino español").located(By.id("i12"));
    public static final Target IDIOMA_ORIGEN_INGLES_ALT = Target.the("Boton para seleccionar idioma origen ingles").located(By.id("i9"));
    public static final Target IDIOMA_DESTINO_INGLES_ALT = Target.the("Boton para seleccionar idioma destino ingles").located(By.id("i13"));
    public static final Target IDIOMA_ORIGEN_PORTUGUES = Target.the(" Boton para seleccionar idioma origen portuges").located(By.id("(i11"));
    public static final Target IDIOMA_DESTINO_INGLES_POR = Target.the("Boton para seleccionar idioma destino ingles").located(By.id("i13"));

    public static final Target TEXTO_IDIOMA_ORIGEN = Target.the("área de texto idioma origen").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/span/span/div/textarea");
    public static final Target TEXTO_IDIOMA_DESTINO = Target.the("área de texto idioma destino").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]");
    public static final Target TEXTO_IDIOMA_DESTINO_FRA = Target.the("area de texto idioma destino").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[2]/div/div[3]/div/div[2]/div[35]");
    public static final Target TEXTO_IDIOMA_DESTINO_ALT = Target.the("área de texto idioma destino").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]");
    public static final Target TEXTO_IDIOMA_DESTINO_ING = Target.the("área de texto idioma destino").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]");
    public static final Target TEXTO_IDIOMA_DESTINO_INGLES_POR = Target.the("área de texto idioma destino").locatedBy("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div[5]/div/div[1]");
    public static final Target TRADUCCION = Target.the("traducción").locatedBy("//div/span/span/span[contains(text(),'{0}')]");

}
