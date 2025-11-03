package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Random;
import java.util.Scanner;

public class FromarAnagrama extends VariableCadena{

    public void ejecutar() {
        System.out.println("Juego de Anagramas con conjunto de palabras de comida");

        String[][] conjunto = {
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

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] par = conjunto[rnd.nextInt(conjunto.length)];

        String palabra = par[0];
        String anagrama = par[1];

        System.out.println("Adivina el anagrama de: " + palabra);

        int intentos = 0;
        boolean acierto = false;

        while (intentos < 3 && !acierto) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            String intento = sc.nextLine().toLowerCase();

            if (intento.equals(anagrama)) {
                System.out.println("Respuesta correcta, el anagrama es: " + anagrama);
                acierto = true;
            } else {
                intentos++;
                if (intentos == 3)
                    System.out.println("Respuesta incorrecta. La respuesta era: " + anagrama);
                else
                    System.out.println("Incorrecto, intenta otra vez.");
            }
        }
    }
}
