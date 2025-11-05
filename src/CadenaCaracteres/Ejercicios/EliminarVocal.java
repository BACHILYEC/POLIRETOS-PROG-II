package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;

public class EliminarVocal extends Variables{

    public String usandoFor(String texto) {
        StringBuilder salida = new StringBuilder();
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++)
            if (vocales.indexOf(texto.charAt(i)) == -1) salida.append(texto.charAt(i));
        return salida.toString();
    }

    public String usandoWhile(String texto) {
        StringBuilder salida = new StringBuilder();
        String vocales = "aeiouAEIOU";
        int i = 0;
        while (i < texto.length()) {
            if (vocales.indexOf(texto.charAt(i)) == -1) salida.append(texto.charAt(i));
            i++;
        }
        return salida.toString();
    }

    public String usandoDoWhile(String texto) {
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

