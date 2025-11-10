package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;

public class EliminadorDeVocal extends Variables{

    public String g2_usandoFor(String texto) {
        StringBuilder salida = new StringBuilder();
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++)
            if (vocales.indexOf(texto.charAt(i)) == -1) salida.append(texto.charAt(i));
        return salida.toString();
    }

    public String g2_usandoWhile(String texto) {
        StringBuilder salida = new StringBuilder();
        String vocales = "aeiouAEIOU";
        int i = 0;
        while (i < texto.length()) {
            if (vocales.indexOf(texto.charAt(i)) == -1) salida.append(texto.charAt(i));
            i++;
        }
        return salida.toString();
    }

    public String g2_usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "";
        StringBuilder salida = new StringBuilder();
        String vocales = "aeiouAEIOU";
        int i = 0;
        do {
            if (vocales.indexOf(texto.charAt(i)) == -1) salida.append(texto.charAt(i));
            i++;
        } while (i < texto.length());
        return salida.toString();
    }
}

