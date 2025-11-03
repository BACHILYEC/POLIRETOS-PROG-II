package GrafosYAutomatas;

import java.util.Scanner;

public class ValidarClave {

    public void ejecutar(Scanner sc) {
        System.out.println("Validador de Clave");
        System.out.print("Ingrese una clave: ");
        String clave = sc.nextLine();

        boolean mayus = false, minus = false, numero = false, caracter = false;

        for (char c : clave.toCharArray()) {
            if (Character.isUpperCase(c)) mayus = true;
            else if (Character.isLowerCase(c)) minus = true;
            else if (Character.isDigit(c)) numero = true;
            else caracter = true;
        }

        if (mayus && minus && numero && caracter) {
            System.out.println("Clave Validada");
        } else {
            System.out.println("La clave no es válida. Debe contener:");
            if (!mayus) System.out.println("- Al menos una letra mayúscula");
            if (!minus) System.out.println("- Al menos una letra minúscula");
            if (!numero) System.out.println("- Al menos un número");
            if (!caracter) System.out.println("- Al menos un carácter especial");
        }
    }
}




