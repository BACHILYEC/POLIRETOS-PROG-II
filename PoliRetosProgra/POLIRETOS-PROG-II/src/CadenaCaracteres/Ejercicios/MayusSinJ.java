package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class MayusSinJ extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mayúsculas sin la letra J");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine());

        String salida = getTexto().toUpperCase().replace("J", "");
        System.out.println("La frase quedará:" + salida);
    }
}