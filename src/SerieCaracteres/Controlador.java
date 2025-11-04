package SerieCaracteres;

import SerieCaracteres.ciclos.Automata02;
import SerieCaracteres.ciclos.Auton;
import SerieCaracteres.ciclos.S1;
import SerieCaracteres.ciclos.S10;
import SerieCaracteres.ciclos.S2;
import SerieCaracteres.ciclos.S3;
import SerieCaracteres.ciclos.S4;
import SerieCaracteres.ciclos.S5;
import SerieCaracteres.ciclos.S6;
import SerieCaracteres.ciclos.S7;
import SerieCaracteres.ciclos.S8;
import SerieCaracteres.ciclos.S9;
import SerieCaracteres.ciclos.Tool;

public class Controlador extends IHVariable {
    
    public Controlador() {
        super();
    }
    
    public Controlador(int Repeticion) {
        super(Repeticion);
    }
    
    public void ejecutarEjercicio() {


        setRepeticion(Tool.leerEnteroPositivo("Ingrese un número entero positivo: "));
        
        S1 ejercicio1 = new S1(getRepeticion());
        ejercicio1.g2_crearSerieMasMenosFor();
        ejercicio1.g2_crearSerieMasMenosWhile();
        ejercicio1.g2_crearSerieMasMenosDoWhile();
        
        System.out.println("Serie Fibonacci con signo + :");
        S2 ejercicio2 = new S2(getRepeticion());
        ejercicio2.g2_crearSerieFibonacciMasFor();
        ejercicio2.g2_crearSerieFibonacciMasWhile();
        ejercicio2.g2_crearSerieFibonacciMasDoWhile();

        System.out.println("Serie de números primos con signo +: ");
        S3 ejercicio3 = new S3(getRepeticion());
        ejercicio3.g2_crearSeriePrimoFor();
        ejercicio3.g2_crearSeriePrimoWhile();
        ejercicio3.g2_crearSeriePrimoDoWhile();

        System.out.println("Sucesion de signos: ");
        S4 ejercicio4 = new S4(getRepeticion());
        ejercicio4.g2_mostrarSucesionSignoFor();
        ejercicio4.g2_mostrarSucesionSignoWhile();
        ejercicio4.g2_mostrarSucesionSignoDoWhile();

        System.out.println("Sucesión de Slash: ");
        S5 ejercicio5 = new S5(getRepeticion());
        ejercicio5.g2_serieSlashFor();
        ejercicio5.g2_serieSlashWhile();
        ejercicio5.g2_serieSlashDoWhile();

        System.out.println("Serie de letras del alfabeto: ");
        S6 ejercicio6 = new S6(getRepeticion());
        ejercicio6.g2_mostrarLetraFor();
        ejercicio6.g2_mostrarLetraWhile();
        ejercicio6.g2_mostrarLetraDoWhile();

        System.out.println("Serie de Letras y Signos: ");
        S7 ejercicio7 = new S7(getRepeticion());
        ejercicio7.g2_mostrarLetraSignoFor();
        ejercicio7.g2_mostrarLetraSignoWhile();
        ejercicio7.g2_mostrarLetraSignoDoWhile();

        System.out.println("Sucesion de Letras con multiplos de dos: ");
        S8 ejercicio8 = new S8(getRepeticion());
        ejercicio8.g2_mostrarMultiplodeDosLetraFor();
        ejercicio8.g2_mostrarMultiplodeDosLetraWhile();
        ejercicio8.g2_mostrarMultiplodeDosLetraDoWhile();

        System.out.println("Sucesion de Letras en grupos Impares: ");
        S9 ejercicio9 = new S9(getRepeticion());
        ejercicio9.mostrarSucesionLetrasImparesFor();
        ejercicio9.mostrarSucesionLetrasImparesWhile();
        ejercicio9.mostrarSucesionLetrasImparesDoWhile();

        System.out.println("Sucesion de Letros con Fibonacci: ");
        S10 ejercicio10 = new S10(getRepeticion());
        ejercicio10.mostrarSucesiondeLetraFibonacciDosFor();
        ejercicio10.mostrarSucesiondeLetraFibonacciDosWhile();
        ejercicio10.mostrarSucesiondeLetraFibonacciDosDoWhile();

        Auton automata = new Auton();
        automata.ejecutarValidacion();


        Automata02 automata02 = new Automata02();
        automata02.ejecutarValidacion();


        
    }
    
}