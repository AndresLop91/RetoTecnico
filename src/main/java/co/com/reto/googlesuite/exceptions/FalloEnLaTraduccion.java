package co.com.reto.googlesuite.exceptions;

public class FalloEnLaTraduccion extends AssertionError{

    public static final String FALLO_TRADUCCION = "Falló la traducción";

    public FalloEnLaTraduccion(String mensaje,Throwable causa){
        super(mensaje,causa);
    }
}
