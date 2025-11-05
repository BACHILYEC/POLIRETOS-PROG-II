package SerieNumerica;

import java.util.Scanner;

import SerieNumerica.ejercicio.Potencia2;
import SerieNumerica.ejercicio.Potencia3;
import SerieNumerica.ejercicio.Serie3;
import SerieNumerica.ejercicio.Serie5;
import SerieNumerica.ejercicio.SerieAlternante;
import SerieNumerica.ejercicio.SerieCombinada;
import SerieNumerica.ejercicio.SerieCombinada2;
import SerieNumerica.ejercicio.SerieCuadrados;
import SerieNumerica.ejercicio.SerieFibonacci;
import SerieNumerica.ejercicio.SeriePrimos;
import SerieNumerica.ejercicio.SeriePronic;

public class ControllerSerie extends Variables1 {
    

    public ControllerSerie() {
        super();
    }

    public ControllerSerie(int numero, int ciclo) {
        super(numero, ciclo);
    }

    public ControllerSerie(int numero) {
        super(numero);
    }
Scanner sc = new Scanner(System.in);
    public void Ejercicio() {
        System.out.println("Ingrese un numero:");
        int numero1 = sc.nextInt();
        SerieFibonacci serieFibonacci = new SerieFibonacci(numero1);
        serieFibonacci.imprimirFibonacci();
        serieFibonacci.imprimirFibonacciWhile();
        serieFibonacci.imprimirFibonacciDoWhile();
        System.out.println();
        SerieAlternante serieAlternante = new SerieAlternante(numero1);
        serieAlternante.imprimirAlternante();
        System.out.println();
        serieAlternante.imprimirAlternanteWhile();
        System.out.println();
        serieAlternante.imprimirAlternanteDoWhile();
        System.out.println();
        SerieCombinada serieCombinada = new SerieCombinada(numero1);
        System.out.println();
        serieCombinada.imprimirCombinada();
        serieCombinada.imprimirCombinadaWhile();
        serieCombinada.imprimirCombinadaDoWhile();
        SerieCombinada2 serieCombinada2 = new SerieCombinada2(numero1);
        System.out.println();
        serieCombinada2.imprimirCombinada();
        serieCombinada2.imprimirCombinadaWhile();
        serieCombinada2.imprimirCombinadaDoWhile();
        SeriePrimos seriePrimos = new SeriePrimos(numero1);
        System.out.println();
        seriePrimos.imprimirPrimos();
        seriePrimos.imprimirPrimosWhile();
        seriePrimos.imprimirPrimosDoWhile();
        SerieCuadrados serieCuadrados = new SerieCuadrados(numero1);
        System.out.println();
        serieCuadrados.imprimirCuadrados();
        serieCuadrados.imprimirCuadradosWhile();    
        serieCuadrados.imprimirCuadradosDoWhile();
        Serie3 serie3 = new Serie3(numero1);
        System.out.println();
        serie3.imprimirMas3();
        serie3.imprimirMas3While();
        serie3.imprimirMas3DoWhile();
        Serie5 serie5 = new Serie5(numero1);
        System.out.println();   
        serie5.imprimirMas5();
        serie5.imprimirMas5While(); 
        serie5.imprimirMas5DoWhile();
        Potencia2 potencia = new Potencia2(numero1);
        System.out.println();
        potencia.imprimirPotencia();         
        potencia.imprimirPotenciaWhile();    
        potencia.imprimirPotenciaDoWhile(); 
        Potencia3 potencia3 = new Potencia3(numero1);
        System.out.println();
        potencia3.imprimirPotencia();
        potencia3.imprimirPotenciaWhile();
        potencia3.imprimirPotenciaDoWhile();
        System.out.println();
        SeriePronic seriePronic = new SeriePronic(numero1);
        System.out.println();
        seriePronic.imprimirPronic();
        seriePronic.imprimirPronicWhile();
        seriePronic.imprimirPronicDoWhile();
            

    }
}