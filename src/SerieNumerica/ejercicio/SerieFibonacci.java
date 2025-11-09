package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SerieFibonacci extends Variables {
    public void reset(){
        setCiclo(0);
        setAux(1);
        setSuma(0);
    }
    public SerieFibonacci(int numero) {
        super(numero);
        reset();
    }

    public int g2_Fibonacci() {
        for (int j = 0; j < getNumero(); j++) {
            if (j == 0) {
                System.out.print(getCiclo() + " ");
            } else if (j == 1) {
                System.out.print(getAux() + " ");
            } else {
                setSuma(getCiclo() + getAux());
                setCiclo(getAux());
                setAux(getSuma());
                System.out.print(getSuma() + " ");
            }
        }
        return getSuma();
    }

    public int g2_FibonacciWhile() {
        int j = 0;
        while (j < getNumero()) {
            if (j == 0) {
                System.out.print(getCiclo() + " ");
            } else if (j == 1) {
                System.out.print(getAux() + " ");
            } else {
                setSuma(getCiclo() + getAux());
                setCiclo(getAux());
                setAux(getSuma());
                System.out.print(getSuma() + " ");
            }
            j++;
        }
        return getSuma();
    }

    public int g2_FibonacciDoWhile() {
        int j = 0;
        do {
            if (j == 0) {
                System.out.print(getCiclo() + " ");
            } else if (j == 1) {
                System.out.print(getAux() + " ");
            } else {
                setSuma(getCiclo() + getAux());
                setCiclo(getAux());
                setAux(getSuma());
                System.out.print(getSuma() + " ");
            }
            j++;
        } while (j < getNumero());
        return getSuma();
    }

    
    public void g2_imprimirFibonacci() {
        System.out.println("Serie Fibonacci (For):");
        reset();
        g2_Fibonacci();
        System.out.println();
    }

        
    public void g2_imprimirFibonacciWhile() {
        System.out.println("Serie Fibonacci (While):");
        reset();
        g2_FibonacciWhile();
        System.out.println();
    }

    public void g2_imprimirFibonacciDoWhile() {
        System.out.println("Serie Fibonacci (Do-While):");
        reset();
        g2_FibonacciDoWhile();
        System.out.println();
    }
}
