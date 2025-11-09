package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SeriePrimos extends Variables {
    public void reset(){
        setCiclo(2);
        setAux(0);
    }
    public SeriePrimos(int numero) {
        super(numero);
        reset();
    }

    public String g2_Primos() {
        String resultado = "";
        for (int j = 0; j < getNumero(); ) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(getCiclo()); i++) {
                if (getCiclo() % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                resultado += getCiclo() + " ";
                j++;
            }
            setCiclo(getCiclo() + 1);
        }
        return resultado;
    }

    public String g2_PrimosWhile() {
        String resultado = "";
        int j = 0;
        while (j < getNumero()) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(getCiclo()); i++) {
                if (getCiclo() % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                resultado += getCiclo() + " ";
                j++;
            }
            setCiclo(getCiclo() + 1);
        }
        return resultado;
    }

    public String g2_PrimosDoWhile() {
        String resultado = "";
        int j = 0;
        do {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(getCiclo()); i++) {
                if (getCiclo() % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                resultado += getCiclo() + " ";
                j++;
            }
            setCiclo(getCiclo() + 1);
        } while (j < getNumero());
        return resultado;
    }


    public void g2_imprimirPrimos() {
        System.out.println("Serie Primos (For):");
        reset();
        System.out.println(g2_Primos());
    }

    public void g2_imprimirPrimosWhile() {
        System.out.println("Serie Primos (While):");
        reset();
        System.out.println(g2_PrimosWhile());
    }

    public void g2_imprimirPrimosDoWhile() {
        System.out.println("Serie Primos (Do-While):");
        reset();
        System.out.println(g2_PrimosDoWhile());
    }
}
