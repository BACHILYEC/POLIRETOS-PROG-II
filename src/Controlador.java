package Recursividad;

import java.util.Scanner;

import Recursividad.ejercicios.ConteoProg;
import Recursividad.ejercicios.ConteoReg;
import Recursividad.ejercicios.Factorial;
import Recursividad.ejercicios.Multiplicacion;
import Recursividad.ejercicios.Potencia;
import Recursividad.ejercicios.Suma;

public class ControllerRecursividad extends Variables {

public ControllerRecursividad() {
    super();
}
    public ControllerRecursividad(int numero, int ciclo) {
        super(numero, ciclo);
    }


    public ControllerRecursividad(int numero) {
        super(numero);
    }
    Scanner sc = new Scanner(System.in);
    public void Ejercicio(){
        System.out.println("Ingrese el primer numero:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();
Factorial factorial = new Factorial(numero1);
factorial.factorial();
factorial.mostrarFactorial();
Suma suma = new Suma(numero1,numero2);
suma.suma();
suma.mostrarSuma();
Multiplicacion multiplicacion = new Multiplicacion(numero1,numero2);
multiplicacion.multiplicacion();
multiplicacion.mostrarMultiplicacion();
Potencia potencia = new Potencia(numero1,numero2);
potencia.potencia();
potencia.mostrarPotencia();
ConteoProg conteoProg = new ConteoProg(numero1);
System.out.print("Conteo Progresivo: ");
conteoProg.conteoProg();
ConteoReg conteoReg = new ConteoReg(numero1);
System.out.print("Conteo Regresivo: ");
conteoReg.conteoReg();
}
}
