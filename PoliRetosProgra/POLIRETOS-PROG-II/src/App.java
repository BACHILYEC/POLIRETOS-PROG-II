import java.util.Scanner;
import CadenaCaracteres.ControllerCadena;
import GrafosYAutomatas.ControllerGrafo;
import Recursividad.Controller;

public class App {
    public void iniciar() throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Controller controller = new Controller();
        controller.Ejercicio();

        ControllerCadena controllerCadenas = new ControllerCadena();
        controllerCadenas.ejecutar();

        ControllerGrafo controllerGrafos = new ControllerGrafo();
        controllerGrafos.ejecutar(sc);

        // no cerramos el Scanner aún
    }
}



