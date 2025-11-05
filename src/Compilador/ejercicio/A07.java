package Compilador.ejercicio;

import java.util.Scanner;

public class A07 {

    public void ejecutar(Scanner sc) {
        System.out.println("Validador de Clave");
        System.out.print("Ingrese una clave: ");
String clave = sc.nextLine();

        boolean mayus = false, minus = false, numero = false, especial = false;

        for (char c : clave.toCharArray()) {
            if (Character.isUpperCase(c)) mayus = true;
            else if (Character.isLowerCase(c)) minus = true;
            else if (Character.isDigit(c)) numero = true;
            else especial = true;
        }

        if (mayus && minus && numero && especial) {
            System.out.println("La clave ingresada es válida");
        } else {
            System.out.println("Clave no válida. Debe contener:");
            if (!mayus) System.out.println("- Al menos una letra mayúscula");
            if (!minus) System.out.println("- Al menos una letra minúscula");
            if (!numero) System.out.println("- Al menos un número");
            if (!especial) System.out.println("- Al menos un carácter especial");
        }
    }
}




