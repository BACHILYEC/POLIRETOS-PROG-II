package CadenaCaracteres.Ejercicios;


import Recursividad.Variables;

public class EliminadorDeLetra extends Variables{

    
    public String g2_usandoFor(String texto) {
        char letra = 'a'; 
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
        }

        return "Frase sin '" + letra + "': " + resultado.toString();
    }

    public String g2_usandoWhile(String texto) {
        char letra = 'a';
        StringBuilder resultado = new StringBuilder();
        int i = 0;

        while (i < texto.length()) {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
            i++;
        }

        return "Frase sin '" + letra + "': " + resultado.toString();
    }

    public String g2_usandoDoWhile(String texto) {
        if (texto.isEmpty()) return "Frase vacía.";
        char letra = 'a';
        StringBuilder resultado = new StringBuilder();
        int i = 0;

        do {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
            i++;
        } while (i < texto.length());

        return "Frase sin '" + letra + "': " + resultado.toString();
    }
}