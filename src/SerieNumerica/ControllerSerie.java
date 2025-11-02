package SerieNumerica;

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

    public void Ejercicio() {
        SerieFibonacci serieFibonacci = new SerieFibonacci(10);
        serieFibonacci.imprimirFibonacci();
        serieFibonacci.imprimirFibonacciWhile();
        serieFibonacci.imprimirFibonacciDoWhile();
        System.out.println();
        SerieAlternante serieAlternante = new SerieAlternante(10);
        serieAlternante.imprimirAlternante();
        System.out.println();
        serieAlternante.imprimirAlternanteWhile();
        System.out.println();
        serieAlternante.imprimirAlternanteDoWhile();
        System.out.println();
        SerieCombinada serieCombinada = new SerieCombinada(10);
        System.out.println();
        serieCombinada.imprimirCombinada();
        serieCombinada.imprimirCombinadaWhile();
        serieCombinada.imprimirCombinadaDoWhile();
        SerieCombinada2 serieCombinada2 = new SerieCombinada2(10);
        System.out.println();
        serieCombinada2.imprimirCombinada();
        serieCombinada2.imprimirCombinadaWhile();
        serieCombinada2.imprimirCombinadaDoWhile();
        SeriePrimos seriePrimos = new SeriePrimos(10);
        System.out.println();
        seriePrimos.imprimirPrimos();
        seriePrimos.imprimirPrimosWhile();
        seriePrimos.imprimirPrimosDoWhile();
        SerieCuadrados serieCuadrados = new SerieCuadrados(10);
        System.out.println();
        serieCuadrados.imprimirCuadrados();
        serieCuadrados.imprimirCuadradosWhile();    
        serieCuadrados.imprimirCuadradosDoWhile();
        Serie3 serie3 = new Serie3(10);
        System.out.println();
        serie3.imprimirMas3();
        serie3.imprimirMas3While();
        serie3.imprimirMas3DoWhile();
        Serie5 serie5 = new Serie5(10);
        System.out.println();   
        serie5.imprimirMas5();
        serie5.imprimirMas5While(); 
        serie5.imprimirMas5DoWhile();
        Potencia2 potencia = new Potencia2(5);
        System.out.println();
        potencia.imprimirPotencia();         
        potencia.imprimirPotenciaWhile();    
        potencia.imprimirPotenciaDoWhile(); 
        Potencia3 potencia3 = new Potencia3(5);
        System.out.println();
        potencia3.imprimirPotencia();
        potencia3.imprimirPotenciaWhile();
        potencia3.imprimirPotenciaDoWhile();
        System.out.println();
        SeriePronic seriePronic = new SeriePronic(10);
        System.out.println();
        seriePronic.imprimirPronic();
        seriePronic.imprimirPronicWhile();
        seriePronic.imprimirPronicDoWhile();
            

    }
}