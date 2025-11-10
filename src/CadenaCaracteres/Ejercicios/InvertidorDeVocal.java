package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;


public class InvertidorDeVocal extends Variables{

    public String g2_usandoFor(String texto) {
        StringBuilder salida = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            char c = texto.charAt(i);
            salida.append("aeiouAEIOU".indexOf(c) != -1 ?
                Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        return salida.toString();
    }

    public String g2_usandoWhile(String texto) {
        StringBuilder salida = new StringBuilder();
        int i = texto.length() - 1;
        while (i >= 0) {
            char c = texto.charAt(i);
            salida.append("aeiouAEIOU".indexOf(c) != -1 ?
                Character.toUpperCase(c) : Character.toLowerCase(c));
            i--;
        }
        return salida.toString();
    }

    public String g2_usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "";
        StringBuilder salida = new StringBuilder();
        int i = texto.length() - 1;
        do {
            char c = texto.charAt(i);
            salida.append("aeiouAEIOU".indexOf(c) != -1 ?
                Character.toUpperCase(c) : Character.toLowerCase(c));
            i--;
        } while (i >= 0);
        return salida.toString();
    }
}