#language:  es

Característica: traductor de google
  yo como usuario de la web
  quiero usar el traductor de google
  para traducir palabras entre diferentes idiomas

  Escenario: traducir de ingles a español escenario exitoso
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra House de ingles a español
    Entonces el deberia ver la palabra casa en la pantalla

  Escenario: traducir de español a ingles escenario exitoso
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra Perro de espaniol a ingles
    Entonces el deberia ver la palabra Dog en la pantalla

  Escenario: traducir de español al frances escenario exitoso
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra Gato del espaniol a frances
    Entonces el deberia ver la palabra Chat en la pantalla

  Escenario: traducir de español al español escenario alterno
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra futbol del espaniol al espaniol
    Entonces el deberia ver la palabra futbol en la pantalla


  Escenario: traducir de ingles al ingles escenario alterno
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra musica del ingles al ingles
    Entonces el deberia ver la palabra musica en la pantalla

  @manual
    Escenario: traducir de espaniol a portugues escenario alterno
      Dado que Andres quiere traducir una palabra
      Cuando el traduce la palabra felicidad del espaniol al portugues
      Entonces el deberia ver la palabra felicidade en la pantalla

  @manual
  Escenario: traducir de espaniol a noruego escenario alterno
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra felicidad del espaniol al noruego
    Entonces el deberia ver la palabra lykke en la pantalla

  @manual
  Escenario: traducir del portugues al ingles  escenario alterno
    Dado que Andres quiere traducir una palabra
    Cuando el traduce la palabra Obrigada del espaniol al noruego
    Entonces el deberia ver la palabra thanks en la pantalla
