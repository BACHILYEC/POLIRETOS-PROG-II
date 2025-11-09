package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;

public class InvertidorLetra extends Variables {

    public String g2_usandoFor(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            char c = texto.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                resultado.append(Character.toLowerCase(c));
            } else if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String g2_usandoWhile(String texto) {
        StringBuilder resultado = new StringBuilder();
        int i = texto.length() - 1;
        while (i >= 0) {
            char c = texto.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                resultado.append(Character.toLowerCase(c));
            } else if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
            i--;
        }
        return resultado.toString();
    }

    public String g2_usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "";
        StringBuilder resultado = new StringBuilder();
        int i = texto.length() - 1;
        do {
            char c = texto.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                resultado.append(Character.toLowerCase(c));
            } else if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
            i--;
        } while (i >= 0);
        return resultado.toString();
    }
}
