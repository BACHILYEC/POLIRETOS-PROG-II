package CadenaCaracteres.Ejercicios;

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class ContarLetra extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Contar Letras");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine());
        setAux(0);

        String texto = getTexto();

        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            
            if (Character.isLetter(c)) {

                
                setAux(getAux() + 1);
            }
        }

        System.out.println("La frase tiene " + getAux() + " letras.");
    }
}
