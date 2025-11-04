package GrafosYAutomatas;

import java.util.Scanner;

public class ControllerGrafo {

    public void ejecutar(Scanner sc) {
        System.out.println("Grafos y Autómatas");
        System.out.println("[1] Validador de Clave");
        System.out.print("Seleccione una opción: ");

        int opcion = 0;
        if (sc.hasNextInt()) {
            opcion = sc.nextInt();
            sc.nextLine(); 
        }

        switch (opcion) {
            case 1 -> {
                ValidarClave validador = new ValidarClave();
                validador.ejecutar(sc);
            }
            default -> System.out.println("Opción no válida.\n");
        }
    }
}


