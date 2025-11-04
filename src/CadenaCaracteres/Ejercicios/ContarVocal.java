package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;

public class ContarVocal extends VariableCadena{

    public String usandoFor(String texto) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++)
            if (vocales.indexOf(texto.charAt(i)) != -1) contador++;
        return "La frase tiene " + contador + " vocales.";
    }

    public String usandoWhile(String texto) {
        int contador = 0, i = 0;
        String vocales = "aeiouAEIOU";
        while (i < texto.length()) {
            if (vocales.indexOf(texto.charAt(i)) != -1) contador++;
            i++;
        }
        return "La frase tiene " + contador + " vocales.";
    }

    public String usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "La frase tiene 0 vocales.";
        int contador = 0, i = 0;
        String vocales = "aeiouAEIOU";
        do {
            if (vocales.indexOf(texto.charAt(i)) != -1) contador++;
            i++;
        } while (i < texto.length());
        return "La frase tiene " + contador + " vocales.";
    }
}