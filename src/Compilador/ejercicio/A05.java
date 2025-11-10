package Compilador.ejercicio;

import java.util.Scanner;

public class A05 {

    public static boolean g2_validarVariable(String variable) {
        variable = variable.trim();

        if (variable.endsWith(";")) {
            variable = variable.substring(0, variable.length() - 1);
        }

        if (variable.isEmpty() || variable.endsWith(",") || variable.endsWith("=")) {
            return false;
        }

        return variable.matches("^[a-zA-Z_$][a-zA-Z0-9_$]*$");
    }
Scanner sc = new Scanner(System.in);
    public void imprimir() {
        
        System.out.println("Ingresa una posible declaración (ej: edad; edad1; _nombre; $dato;):");

        String entrada = sc.nextLine();

        if (g2_validarVariable(entrada)) {
            System.out.println("Variable válida");
        } else {
            System.out.println("Error");
        }

    }
}
