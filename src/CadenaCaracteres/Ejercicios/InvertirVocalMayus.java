package CadenaCaracteres.Ejercicios;

<<<<<<< HEAD
import CadenaCaracteres.VariableCadena;


public class InvertirVocalMayus extends VariableCadena{
=======
import Recursividad.Variables;


public class InvertirVocalMayus extends Variables{
>>>>>>> main

    public String usandoFor(String texto) {
        StringBuilder salida = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            char c = texto.charAt(i);
            salida.append("aeiouAEIOU".indexOf(c) != -1 ?
                Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        return salida.toString();
    }

    public String usandoWhile(String texto) {
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

    public String usandoDoWhile(String texto) {
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