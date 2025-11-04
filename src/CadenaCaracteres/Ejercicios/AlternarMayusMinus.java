package CadenaCaracteres.Ejercicios; // ← Asegúrate que coincida con tu carpeta exacta

import CadenaCaracteres.VariableCadena;


public class AlternarMayusMinus extends VariableCadena{

    public String usandoFor(String texto) {
        StringBuilder salida = new StringBuilder();
        boolean alternar = true;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                salida.append(alternar ? Character.toUpperCase(c) : Character.toLowerCase(c));
                alternar = !alternar;
            } else salida.append(c);
        }
        return salida.toString();
    }

    public String usandoWhile(String texto) {
        StringBuilder salida = new StringBuilder();
        boolean alternar = true;
        int i = 0;
        while (i < texto.length()) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                salida.append(alternar ? Character.toUpperCase(c) : Character.toLowerCase(c));
                alternar = !alternar;
            } else salida.append(c);
            i++;
        }
        return salida.toString();
    }

    public String usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "";
        StringBuilder salida = new StringBuilder();
        boolean alternar = true;
        int i = 0;
        do {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                salida.append(alternar ? Character.toUpperCase(c) : Character.toLowerCase(c));
                alternar = !alternar;
            } else salida.append(c);
            i++;
        } while (i < texto.length());
        return salida.toString();
    }
}