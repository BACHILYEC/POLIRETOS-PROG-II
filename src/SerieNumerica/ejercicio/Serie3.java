package SerieNumerica.ejercicio;

import SerieNumerica.Variables1;

public class Serie3 extends Variables1 {
    public void reset(){
        setCiclo(1);
    }
    public Serie3(int numero) {
        super(numero);
        reset();
    }
    public String Mas3() {
        String resultado = "";
        for (int i = 1; i <= getNumero(); i++) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 3);
        }
        return resultado;
    }

    public String Mas3While() {
        String resultado = "";
        int i = 1;
        while (i <= getNumero()) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 3);
            i++;
        }
        return resultado;
    }

    public String Mas3DoWhile() {
        String resultado = "";
        int i = 1;
        do {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 3);
            i++;
        } while (i <= getNumero());
        return resultado;
    }

    public void imprimirMas3() {
        System.out.println("Serie +3 (For):");
        reset();
        System.out.println(Mas3());
    }

    public void imprimirMas3While() {
        System.out.println("Serie +3 (While):");
        reset();
        System.out.println(Mas3While());
    }

    public void imprimirMas3DoWhile() {
        System.out.println("Serie +3 (Do-While):");
        reset();
        System.out.println(Mas3DoWhile());
    }
}
