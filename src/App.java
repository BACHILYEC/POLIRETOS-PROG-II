import Compilador.ejercicio.numerodecimal;
import SerieNumerica.ControllerSerie;

public class App {
    public static void main(String[] args) throws Exception {
        Controlador controller = new Controlador();
        controller.Ejercicio();
        ControllerSerie controllerSerie = new ControllerSerie();
        controllerSerie.Ejercicio();
        numerodecimal numero = new numerodecimal("");
        numero.decimal();
    }
}
