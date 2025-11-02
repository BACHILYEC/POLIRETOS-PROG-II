import Recursividad.ControllerRecursividad;
import SerieNumerica.ControllerSerie;

public class App {
    public static void main(String[] args) throws Exception {
        ControllerRecursividad controller = new ControllerRecursividad();
        controller.Ejercicio();
        ControllerSerie controllerSerie = new ControllerSerie();
        controllerSerie.Ejercicio();
    }
}
