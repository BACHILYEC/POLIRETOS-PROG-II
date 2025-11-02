package Recursividad;

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
}
