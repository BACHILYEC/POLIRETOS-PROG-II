package CadenaCaracteres.Ejercicios;

<<<<<<< HEAD
import CadenaCaracteres.VariableCadena;

public class ContarLetra extends VariableCadena{
=======

import Recursividad.Variables;

public class ContarLetra extends Variables{
>>>>>>> main

    public String usandoFor(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++)
            if (Character.isLetter(texto.charAt(i))) contador++;
        return "La frase tiene " + contador + " letras.";
    }

    public String usandoWhile(String texto) {
        int contador = 0, i = 0;
        while (i < texto.length()) {
            if (Character.isLetter(texto.charAt(i))) contador++;
            i++;
        }
        return "La frase tiene " + contador + " letras.";
    }

    public String usandoDoWhile(String texto) {
<<<<<<< HEAD
        if (texto.isEmpty()) return "La frase tiene 0 letras";
=======
        if (texto.isEmpty()) return "La frase tiene 0 letras.";
>>>>>>> main
        int contador = 0, i = 0;
        do {
            if (Character.isLetter(texto.charAt(i))) contador++;
            i++;
        } while (i < texto.length());
<<<<<<< HEAD
        return "La frase tiene " + contador + " letras";
=======
        return "La frase tiene " + contador + " letras.";
>>>>>>> main
    }
}