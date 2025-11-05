package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;

public class MayusSinJ extends Variables{

    public String usandoFor(String texto) {
        return texto.toUpperCase().replace("J", "");
    }

    public String usandoWhile(String texto) {
        StringBuilder salida = new StringBuilder();
        int i = 0;
        while (i < texto.length()) {
            char c = Character.toUpperCase(texto.charAt(i));
            if (c != 'J') salida.append(c);
            i++;
        }
        return salida.toString();
    }

    public String usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "";
        StringBuilder salida = new StringBuilder();
        int i = 0;
        do {
            char c = Character.toUpperCase(texto.charAt(i));
            if (c != 'J') salida.append(c);
            i++;
        } while (i < texto.length());
        return salida.toString();
    }
}