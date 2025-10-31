package Recursividad;

import Recursividad.ejercicios.Factorial;
import Recursividad.ejercicios.Multiplicacion;
import Recursividad.ejercicios.Suma;

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
Multiplicacion multiplicacion = new Multiplicacion(5,5);
multiplicacion.multiplicacion();
multiplicacion.mostrarMultiplicacion();
}
}
