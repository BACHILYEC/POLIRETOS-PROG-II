package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class ContarVocal extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Contar Vocales");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine().toLowerCase()); 
        setAux(0);

        String texto = getTexto();
        String vocales = "aeiou"; 

       
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            
            if (vocales.indexOf(c) != -1) {

            
                setAux(getAux() + 1);
            }
        }

        System.out.println("La frase tiene " + getAux() + " vocales.");
    }
}