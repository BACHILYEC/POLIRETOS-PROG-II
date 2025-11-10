package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;

public class Presentador extends Variables {

    public String g2_usandoFor(String texto) {
        return texto.toUpperCase().replace("J", "");
    }

    public String g2_usandoWhile(String texto) {
        StringBuilder salida = new StringBuilder();
        int i = 0;
        while (i < texto.length()) {
            char c = Character.toUpperCase(texto.charAt(i));
            if (c != 'J') salida.append(c);
            i++;
        }
        return salida.toString();
    }

    public String g2_usandoDoWhile(String texto) {
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
