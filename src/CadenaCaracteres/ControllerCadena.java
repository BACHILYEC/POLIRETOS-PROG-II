package CadenaCaracteres;

import CadenaCaracteres.Ejercicios.*;
import java.util.Scanner;

public class ControllerCadena {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String texto = sc.nextLine();

        System.out.println("Cadena de Caracteres");
        
        AlternarMayusMinus alt = new AlternarMayusMinus();
        ContarLetra contarL = new ContarLetra();
        ContarVocal contarV = new ContarVocal();
        EliminarLetra elimL = new EliminarLetra();
        EliminarVocal elimV = new EliminarVocal();
        InvertirLetraMayus invL = new InvertirLetraMayus();
        InvertirVocalMayus invV = new InvertirVocalMayus();
        MayusSinJ mayusJ = new MayusSinJ();
        FromarAnagrama ana = new FromarAnagrama();

        
        System.out.println("AlternarMayusMinus:");
        System.out.println("   Con for:      " + alt.usandoFor(texto));
        System.out.println("   Con while:    " + alt.usandoWhile(texto));
        System.out.println("   Con do-while: " + alt.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("ContarLetra:");
        System.out.println("   Con for:      " + contarL.usandoFor(texto));
        System.out.println("   Con while:    " + contarL.usandoWhile(texto));
        System.out.println("   Con do-while: " + contarL.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("ContarVocal:");
        System.out.println("   Con for:      " + contarV.usandoFor(texto));
        System.out.println("   Con while:    " + contarV.usandoWhile(texto));
        System.out.println("   Con do-while: " + contarV.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("EliminarLetra:");
        System.out.println("   Con for:      " + elimL.usandoFor(texto));
        System.out.println("   Con while:    " + elimL.usandoWhile(texto));
        System.out.println("   Con do-while: " + elimL.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("EliminarVocal:");
        System.out.println("   Con for:      " + elimV.usandoFor(texto));
        System.out.println("   Con while:    " + elimV.usandoWhile(texto));
        System.out.println("   Con do-while: " + elimV.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("InvertirLetraMayus:");
        System.out.println("   Con for:      " + invL.usandoFor(texto));
        System.out.println("   Con while:    " + invL.usandoWhile(texto));
        System.out.println("   Con do-while: " + invL.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("InvertirVocalMayus:");
        System.out.println("   Con for:      " + invV.usandoFor(texto));
        System.out.println("   Con while:    " + invV.usandoWhile(texto));
        System.out.println("   Con do-while: " + invV.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("MayusSinJ:");
        System.out.println("   Con for:      " + mayusJ.usandoFor(texto));
        System.out.println("   Con while:    " + mayusJ.usandoWhile(texto));
        System.out.println("   Con do-while: " + mayusJ.usandoDoWhile(texto));
        System.out.println();

        
        System.out.println("FromarAnagrama:");
        System.out.println("   Con for:      " + ana.usandoFor(texto));
        System.out.println("   Con while:    " + ana.usandoWhile(texto));
        System.out.println("   Con do-while: " + ana.usandoDoWhile(texto));
        System.out.println();

        System.out.println("Fin del programa");
        sc.close();
    }

    public static void main(String[] args) {
        new ControllerCadena().ejecutar();
    }
}