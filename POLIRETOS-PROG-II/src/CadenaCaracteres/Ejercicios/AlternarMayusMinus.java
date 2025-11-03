package CadenaCaracteres.Ejercicios; // ← Asegúrate que coincida con tu carpeta exacta

import CadenaCaracteres.VariableCadena;
import java.util.Scanner;

public class AlternarMayusMinus extends VariableCadena{

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alternar Mayúsculas y Minúsculas");
        System.out.print("Ingrese una frase: ");
        setTexto(sc.nextLine());

        String texto = getTexto();
        StringBuilder salida = new StringBuilder();
        boolean alternar = true;

        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            
            if (Character.isLetter(c)) {

                
                if (alternar) salida.append(Character.toUpperCase(c));
                else          salida.append(Character.toLowerCase(c));

                alternar = !alternar;
            } else {
                salida.append(c); 
            }
        }

        System.out.println("Frase alternada: " + salida);
    }
}
