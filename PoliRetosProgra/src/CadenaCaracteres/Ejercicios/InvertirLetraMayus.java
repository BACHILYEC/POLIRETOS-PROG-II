package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class InvertirLetraMayus extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Invertir con Consonantes en Mayúscula");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine());

        StringBuilder resultado = new StringBuilder();

        for (int i = getTexto().length() - 1; i >= 0; i--) {
            char c = getTexto().charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                resultado.append(Character.toLowerCase(c));
            } else if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
        }

        System.out.println("Frase invertida: " + resultado);
    }
}
