package CadenaCaracteres.Ejercicios;

<<<<<<< HEAD
import CadenaCaracteres.VariableCadena;

public class EliminarLetra extends VariableCadena{
=======

import Recursividad.Variables;

public class EliminarLetra extends Variables{
>>>>>>> main

    // Método usando for
    public String usandoFor(String texto) {
        char letra = 'a'; 
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
        }

        return "Frase sin '" + letra + "': " + resultado.toString();
    }

    // Método usando while
    public String usandoWhile(String texto) {
        char letra = 'a';
        StringBuilder resultado = new StringBuilder();
        int i = 0;

        while (i < texto.length()) {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
            i++;
        }

        return "Frase sin '" + letra + "': " + resultado.toString();
    }

    // Método usando do-while
    public String usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "Frase vacía.";
        char letra = 'a';
        StringBuilder resultado = new StringBuilder();
        int i = 0;

        do {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
            i++;
        } while (i < texto.length());

        return "Frase sin '" + letra + "': " + resultado.toString();
    }
}