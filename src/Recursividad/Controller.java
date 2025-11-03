package Recursividad;

import Recursividad.ejercicios.ConteoProg;
import Recursividad.ejercicios.ConteoReg;
import Recursividad.ejercicios.Factorial;
import Recursividad.ejercicios.Multiplicacion;
import Recursividad.ejercicios.Potencia;
import Recursividad.ejercicios.Suma;
import Figuras.Figura;

public class Controller extends Variables {

public Controller() {
    super();
}
    public Controller(int numero, int ciclo) {
        super(numero, ciclo);
    }

    public Controller(int numero) {
        super(numero);
    }

    public void Ejercicio(){

    Factorial factorial = new Factorial(5);
        factorial.factorial();
        factorial.mostrarFactorial();
    Suma suma = new Suma(10,10);
        suma.suma();
        suma.mostrarSuma();
    Multiplicacion multiplicacion = new Multiplicacion(-5,5);
        multiplicacion.multiplicacion();
        multiplicacion.mostrarMultiplicacion();
    Potencia potencia = new Potencia(2,3);
        potencia.potencia();
        potencia.mostrarPotencia();
    ConteoProg conteoProg = new ConteoProg(5);
        System.out.print("Conteo Progresivo: ");
        conteoProg.conteoProg();
    ConteoReg conteoReg = new ConteoReg(15);
        System.out.print("Conteo Regresivo: ");
        conteoReg.conteoReg();

    }

    public void iniciarFigura(){
        System.out.println("");
        System.out.println("***************");
        System.out.println("--- Figuras ---");
        System.out.println("***************");
        Figura figura = new Figura(5,9);
        System.out.println("Figura 1: ");
        figura.figura1();
        System.out.println("Figura 2: ");
        figura.figura2();
        System.out.println("Figura 3: ");
        figura.figura3();
        System.out.println("Figura 4: ");
        figura.figura4();
        System.out.println("Figura 5: ");
        figura.figura5();
        System.out.println("Figura 6: ");
        figura.figura6();
        System.out.println("Figura 7: ");
        figura.figura7();
        System.out.println("Figura 8: ");
        figura.figura8();
    }
}
