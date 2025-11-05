package CadenaCaracteres.Ejercicios;

import Recursividad.Variables;
import java.util.Random;

public class FromarAnagrama extends Variables {

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

    public String usandoFor(String texto) {
        return generarAnagrama("for");
    }

    public String usandoWhile(String texto) {
        return generarAnagrama("while");
    }

    public String usandoDoWhile(String texto) {
        return generarAnagrama("do-while");
    }

    private String generarAnagrama(String tipo) {
        Random rnd = new Random();
        String[] par = conjunto[rnd.nextInt(conjunto.length)];
        String palabra = par[0];
        String anagrama = par[1];
        return "Palabra: " + palabra + "  →  Anagrama (" + tipo + "): " + anagrama;
    }
}