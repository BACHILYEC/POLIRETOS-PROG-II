import java.util.Scanner;
import CadenaCaracteres.ControllerCadena;
import GrafosYAutomatas.ControllerGrafo;

public class App {

    public void iniciar() throws Exception {
        Scanner sc = new Scanner(System.in);

    
        ControllerCadena controllerCadenas = new ControllerCadena();
        controllerCadenas.ejecutar();

     
        ControllerGrafo controllerGrafos = new ControllerGrafo();
        controllerGrafos.ejecutar(sc);

        sc.close(); 
    }

    public static void main(String[] args) throws Exception {
        new App().iniciar();
    }
}


