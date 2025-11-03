package Arrays;
import java.util.Scanner;

public class Variablesandy {
    public String nombreCompleto;
    public String[] palabras;
    public int[] porcentaje;

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        nombreCompleto = sc.nextLine();

        palabras = nombreCompleto.split(" ");
        porcentaje = new int[palabras.length];

        System.out.println("\nIngrese el porcentaje de carga para cada palabra:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + ": ");
            porcentaje[i] = sc.nextInt();
        }

        sc.close();
    }
}