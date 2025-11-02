package SerieNumerica.ejercicio;

import SerieNumerica.Variables;

public class SerieFibonacci extends Variables {
    public SerieFibonacci(int numero) {
        super(numero);
        setCiclo(0);
        setAux(1);
        setSuma(0);
    }

    public int Fibonacci() {
        for (int j = 0; j < getNumero(); j++) {
            if (j == 0) {
                System.out.print(getCiclo());
            } else if (j == 1) {
                System.out.print(getAux());
            } else {
                setSuma(getCiclo() + getAux());
                setCiclo(getAux());
                setAux(getSuma());
                System.out.print(getSuma());
            }
        }
        return getSuma();
    }

    public void imprimirFibonacci() {
        System.out.println("Serie Fibonacci:");
        Fibonacci();
    }
}
