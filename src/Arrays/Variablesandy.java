package Arrays;
import java.util.Scanner;

public class Variablesandy {
    public String nombreCompleto;
    public String[] palabras;
    public int[] porcentaje;
    public int tamanio;
    public char caracter;
    public String nombre;
    public int puntos;
    public String apellido;

    public void pedirDatitos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        nombreCompleto = sc.nextLine().trim();

        palabras = nombreCompleto.split(" ");
        porcentaje = new int[palabras.length];
        System.out.print("Ingrese el tamaño del patrón (ej: 5): ");
        tamanio = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el carácter para dibujar: ");
        caracter = sc.next().charAt(0);

        nombre = nombreCompleto.split("\\s+")[0];
        puntos = nombre.length();

        dividirNombreCompleto();
    }

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        nombreCompleto = sc.nextLine().trim();

        palabras = nombreCompleto.split(" ");
        porcentaje = new int[palabras.length];

        System.out.println("\nIngrese el porcentaje de carga para cada palabra:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + ": ");
            porcentaje[i] = sc.nextInt();
        }
    }

    public void pedirDatosGrafica() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombreCompleto = sc.nextLine().trim();

        nombre = nombreCompleto.split("\\s+")[0];
        puntos = nombre.length();
    }

    public String[] obtenerIniciales() {
        String[] partes = nombreCompleto.split("\\s+");
        if (partes.length < 2) return new String[]{"?", "?"};
        return new String[]{partes[0].substring(0, 1).toUpperCase(), partes[1].substring(0, 1).toUpperCase()};
    }

    public void dividirNombreCompleto() {
        String[] partes = nombreCompleto.split("\\s+");

        if (partes.length >= 2) {
            nombre = partes[0];
            apellido = partes[1];
        } else {
            // Si solo se da un nombre, el apellido será vacío
            nombre = partes[0];
            apellido = "";
        }
    }

}
