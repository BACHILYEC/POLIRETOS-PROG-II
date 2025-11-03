package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class EliminarLetra extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eliminar Letras");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine());
        System.out.print("Ingrese una letra para que sea eliminada");
        char letra = sc.next().charAt(0);

        String texto = getTexto();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
        }

        System.out.println("Frase modificada: " + resultado);
    }
}
