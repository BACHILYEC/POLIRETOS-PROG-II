package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;
import java.util.Random;

public class FormadorDeAnagrama extends Variables {

    private final String[][] conjunto = {
        {"pera", "arep"},
        {"fresa", "seraf"},
        {"arroz", "razor"},
        {"limon", "molni"},
        {"cacao", "acaco"},
        {"melon", "lonem"},
        {"cereal", "relace"},
        {"torta", "ratot"},
        {"pan", "nap"},
        {"sopa", "asop"}
    };

    public String g2_usandoFor(String texto) {
        return g2_generarAnagrama("for");
    }

    public String g2_usandoWhile(String texto) {
        return g2_generarAnagrama("while");
    }

    public String g2_usandoDoWhile(String texto) {
        return g2_generarAnagrama("do-while");
    }

    private String g2_generarAnagrama(String tipo) {
        Random rnd = new Random();
        String[] par = conjunto[rnd.nextInt(conjunto.length)];
        String palabra = par[0];
        String anagrama = par[1];
        return "Palabra: " + palabra + "  →  Anagrama (" + tipo + "): " + anagrama;
    }
}