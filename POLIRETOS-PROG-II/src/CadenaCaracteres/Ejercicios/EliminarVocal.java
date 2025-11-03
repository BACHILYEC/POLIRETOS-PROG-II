package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class EliminarVocal extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eliminar Vocal");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine());
        System.out.print("Ingrese una vocal a eliminar: ");
        char vocal = sc.next().toLowerCase().charAt(0);

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < getTexto().length(); i++) {
            char c = Character.toLowerCase(getTexto().charAt(i));
            if (c != vocal) resultado.append(getTexto().charAt(i));
        }

        System.out.println("Frase sin '" + vocal + "': " + resultado);
    }
}

