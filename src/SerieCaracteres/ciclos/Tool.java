package SerieCaracteres.ciclos;

import java.util.Scanner;

public class Tool {

    Scanner scanner = new Scanner(System.in);

    public int getConsoleNumero(String mensaje, int minimo, int maximo) {
        int valor;
        String entrada;
        while (true) {
            System.out.print(mensaje);
            entrada = scanner.nextLine(); // Lee toda la línea como String
            try {
                valor = Integer.parseInt(entrada); // Intenta convertir a int
                if (valor >= minimo && valor <= maximo)
                    break;
                else
                    System.out.println(":( Valores entre " + minimo + " y " + maximo);
            } catch (NumberFormatException e) {
                System.out.println(":( Ingrese solo numeros validos entre " + minimo + " y " + maximo);
            }
        }
        return valor;
    }

    // Sobrecarga para usar valores por defecto
    public int getConsoleNumero() {
        return getConsoleNumero("Ingrese un numero: ", 0, 10);
    }
}