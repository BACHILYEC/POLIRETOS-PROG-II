package SerieNumerica;

import SerieNumerica.ejercicio.SerieAlternante;
import SerieNumerica.ejercicio.SerieCombinada;
import SerieNumerica.ejercicio.SerieCombinada2;
import SerieNumerica.ejercicio.SerieFibonacci;
import SerieNumerica.ejercicio.SeriePrimos;

public class ControllerSerie extends Variables {

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
        System.out.println();
        SerieAlternante serieAlternante = new SerieAlternante(10);
        serieAlternante.imprimirAlternante();
        System.out.println();
        SerieCombinada serieCombinada = new SerieCombinada(10);
        serieCombinada.imprimirCombinada();
        SerieCombinada2 serieCombinada2 = new SerieCombinada2(10);
        serieCombinada2.imprimirCombinada();
        SeriePrimos seriePrimos = new SeriePrimos(10);
        seriePrimos.imprimirPrimos();

    }
}