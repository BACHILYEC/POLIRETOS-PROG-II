package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class Potencia3 extends Variables {
    public void reset() {
        setCiclo(3);
    }

    public Potencia3(int numero) {
        super(numero);
        reset();
    }

    public void Potencia() {
        System.out.println("Serie Potencia de 3 (For):");
        for(int i = 0; i < getNumero(); i++) {
            System.out.print(getCiclo()+" ");
            setCiclo(getCiclo()*3);
        }
    }

    public void PotenciaWhile() {
        System.out.println("Serie Potencia de 3 (While):");
        int i = 0;
        while(i < getNumero()) {
            System.out.print(getCiclo()+" ");
            setCiclo(getCiclo()*3);
            i++;
        }
    }

    public void PotenciaDoWhile() {
        System.out.println("Serie Potencia de 3 (Do-While):");
        int i = 0;
        do {
            System.out.print(getCiclo()+" ");
            setCiclo(getCiclo()*3);
            i++;
        } while(i < getNumero());
    }

    public void imprimirPotencia() {
        reset();
        System.out.println();
        Potencia();
    }

    public void imprimirPotenciaWhile() {
        reset();
        System.out.println();
        PotenciaWhile();
    }

    public void imprimirPotenciaDoWhile() {
        reset();
        System.out.println();
        PotenciaDoWhile();
    }
}