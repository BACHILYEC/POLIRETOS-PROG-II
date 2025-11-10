package CadenaCaracteres.Ejercicios;


import Recursividad.Variables;

public class ContadorDeLetra extends Variables{

    public String g2_usandoFor(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++)
            if (Character.isLetter(texto.charAt(i))) contador++;
        return "La frase tiene " + contador + " letras.";
    }

    public String g2_usandoWhile(String texto) {
        int contador = 0, i = 0;
        while (i < texto.length()) {
            if (Character.isLetter(texto.charAt(i))) contador++;
            i++;
        }
        return "La frase tiene " + contador + " letras.";
    }

    public String g2_usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "La frase tiene 0 letras.";
        int contador = 0, i = 0;
        do {
            if (Character.isLetter(texto.charAt(i))) contador++;
            i++;
        } while (i < texto.length());
        return "La frase tiene " + contador + " letras.";
    }
}