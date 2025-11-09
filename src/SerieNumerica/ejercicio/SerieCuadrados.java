package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SerieCuadrados extends Variables {
    public void reset() {
        setCiclo(1);
    }

    public SerieCuadrados(int numero) {
        super(numero);
        reset();
    }

    public String Cuadrados() {
        String resultado = "";
        for (int i = 1; i <= getNumero(); i++) {
            resultado += (i * i) + " ";
        }
        return resultado;
    }

    public String CuadradosWhile() {
        String resultado = "";
        int i = 1;
        while (i <= getNumero()) {
            resultado += (i * i) + " ";
            i++;
        }
        return resultado;
    }

    public String CuadradosDoWhile() {
        String resultado = "";
        int i = 1;
        do {
            resultado += (i * i) + " ";
            i++;
        } while (i <= getNumero());
        return resultado;
    }

    public void imprimirCuadrados() {
        System.out.println("Serie Cuadrados (For):");
        reset();
        System.out.println(Cuadrados());
    }

    public void imprimirCuadradosWhile() {
        System.out.println("Serie Cuadrados (While):");
        reset();
        System.out.println(CuadradosWhile());
    }

    public void imprimirCuadradosDoWhile() {
        System.out.println("Serie Cuadrados (Do-While):");
        reset();
        System.out.println(CuadradosDoWhile());
    }
}