package SerieNumerica.ejercicio;

import SerieNumerica.Variables;

public class SeriePrimos extends Variables {
    public SeriePrimos(int numero) {
        super(numero);
        setCiclo(2);
        setAux(0);
    }

    public String Primos() {
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

    public void imprimirPrimos() {
        System.out.println("Serie Primos (For):\n"+Primos());
    }

    public String PrimosWhile() {
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

    public String PrimosDoWhile() {
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

    public void imprimirPrimosWhile() {
        System.out.println("Serie Primos (While):\n"+PrimosWhile());
    }

    public void imprimirPrimosDoWhile() {
        System.out.println("Serie Primos (Do-While):\n"+PrimosDoWhile());
    }
}
