package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class Potencia2 extends Variables {
    public void reset(){
        setCiclo(2);
    }
    public Potencia2(int numero) {
        super(numero);
        reset();
    }
    public void Potencia() {
        System.out.println("Serie Potencia de 2 (For):");
        for(int i = 0; i < getNumero(); i++) {
            System.out.print(getCiclo()+" ");
            setCiclo(getCiclo()*2);
        }
    }

    public void PotenciaWhile() {
        System.out.println("Serie Potencia de 2 (While):");
        int i = 0;
        while(i < getNumero()) {
            System.out.print(getCiclo()+" ");
            setCiclo(getCiclo()*2);
            i++;
        }
    }

    public void PotenciaDoWhile() {
        System.out.println("Serie Potencia de 2 (Do-While):");
        int i = 0;
        do {
            System.out.print(getCiclo()+" ");
            setCiclo(getCiclo()*2);
            i++;
        } while(i < getNumero());
    }

    public void imprimirPotencia() {
        reset();
        Potencia();
        System.out.println();
    }

    public void imprimirPotenciaWhile() {
        reset();
        PotenciaWhile();
        System.out.println();
    }

    public void imprimirPotenciaDoWhile() {
        reset();
        PotenciaDoWhile();
        System.out.println();
    }
}
