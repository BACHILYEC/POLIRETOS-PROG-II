package Recursividad;

import Recursividad.ejercicios.ConteoProg;
import Recursividad.ejercicios.ConteoReg;
import Recursividad.ejercicios.Factorial;
import Recursividad.ejercicios.Multiplicacion;
import Recursividad.ejercicios.Potencia;
import Recursividad.ejercicios.Suma;
import pkCargaSimulador.Carga;
import pkCicloFigura.Figura;

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
        System.out.println("--------FIGURAS--------");
        Figura figura = new Figura(5,9);
        System.out.println("Figura 1: ");
        figura.g2_crearFigura1();
        System.out.println("Figura 2: ");
        figura.g2_crearFigura2();
        System.out.println("Figura 3: ");
        figura.g2_crearFigura3();
        System.out.println("Figura 4: ");
        figura.g2_crearFigura4();
        System.out.println("Figura 5: ");
        figura.g2_crearFigura5();
        System.out.println("Figura 6: ");
        figura.g2_crearFigura6();
        System.out.println("Figura 7: ");
        figura.g2_crearFigura7();
        System.out.println("Figura 8: ");
        figura.g2_crearFigura8();
        System.out.println("Figura 9: ");
        figura.g2_crearFigura9();
        System.out.println("Figura 10: ");
        figura.g2_crearFigura10();
        System.out.println("Figura 11: ");
        figura.g2_crearFigura11();
        System.out.println("Figura 12: ");
        figura.g2_crearFigura12();
        System.out.println("Figura 13: ");
        figura.g2_crearFigura13();
        System.out.println("Figura 14: ");
        figura.g2_crearFigura14();
        System.out.println("Figura 15: ");
        figura.g2_crearFigura15();
        System.out.println("Figura 16: ");
        figura.g2_crearFigura16();
        System.out.println("Figura 17: ");
        figura.g2_crearFigura17();
        System.out.println("Figura 18: ");
        figura.g2_crearFigura18();
        System.out.println("Figura 19: ");
        figura.g2_crearFigura19();
    }

    public void iniciarCarga() throws InterruptedException{
        System.out.println("");
        System.out.println("--------CARGAS--------");
        Carga carga = new Carga(500);
        //System.out.println("Carga 1: ");
        //carga.carga1();
        //System.out.println("\nCarga 2: ");
        //carga.carga2('#');
        System.out.println("\nCarga 3: ");
        carga.carga3('-');
        System.out.println("\nCarga 4: ");
        carga.carga4('-');


    }
}
