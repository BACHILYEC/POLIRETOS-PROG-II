package Compilador.ejercicio;

import java.util.Scanner;

public class A06 {

    private static final String[] PALABRAS_VALIDAS = {"for", "if", "else", "ifelse", "foreach"};

    public static boolean g2_validarEstructura(String entrada) {
        entrada = entrada.trim();

        for (String palabra : PALABRAS_VALIDAS) {
            if (entrada.startsWith(palabra)) {
                String resto = entrada.substring(palabra.length()).trim();
                if (resto.equals("") || resto.equals("(") || resto.equals("()") || resto.equals("{")) {
                    return true;
                }
            }
        }
        return false;
    }
Scanner sc = new Scanner(System.in);
    public void imprimir() {
        
        System.out.println("Lenguaje L = {for, if, else, ifelse, foreach}");
        System.out.println("Ingresa una palabra o estructura a validar:");

        String entrada = sc.nextLine();

        if (g2_validarEstructura(entrada)) {
            System.out.println("Estructura válida del lenguaje L");
        } else {
            System.out.println("Error");
        }

    }
}
