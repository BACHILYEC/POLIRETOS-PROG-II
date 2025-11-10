package Compilador;

import java.util.Scanner;

public class g2_A05 {

    public static boolean validarVariable(String variable) {
        variable = variable.trim();

        if (variable.endsWith(";")) {
            variable = variable.substring(0, variable.length() - 1);
        }

        if (variable.isEmpty() || variable.endsWith(",") || variable.endsWith("=")) {
            return false;
        }

        return variable.matches("^[a-zA-Z_$][a-zA-Z0-9_$]*$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COMPILADOR DE VARIABLES");
        System.out.println("Ingresa una posible declaración (ej: edad; edad1; _nombre; $dato;):");

        String entrada = sc.nextLine();

        if (validarVariable(entrada)) {
            System.out.println("Variable válida");
        } else {
            System.out.println("Error");
        }

        sc.close();
    }
}
