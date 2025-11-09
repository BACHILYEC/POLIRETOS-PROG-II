package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class Serie3 extends Variables {
    public void reset(){
        setCiclo(1);
    }
    public Serie3(int numero) {
        super(numero);
        reset();
    }
    public String g2_Mas3() {
        String resultado = "";
        for (int i = 1; i <= getNumero(); i++) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 3);
        }
        return resultado;
    }

    public String g2_Mas3While() {
        String resultado = "";
        int i = 1;
        while (i <= getNumero()) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 3);
            i++;
        }
        return resultado;
    }

    public String g2_Mas3DoWhile() {
        String resultado = "";
        int i = 1;
        do {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 3);
            i++;
        } while (i <= getNumero());
        return resultado;
    }

    public void g2_imprimirMas3() {
        System.out.println("Serie +3 (For):");
        reset();
        System.out.println(g2_Mas3());
    }

    public void g2_imprimirMas3While() {
        System.out.println("Serie +3 (While):");
        reset();
        System.out.println(g2_Mas3While());
    }

    public void g2_imprimirMas3DoWhile() {
        System.out.println("Serie +3 (Do-While):");
        reset();
        System.out.println(g2_Mas3DoWhile());
    }
}
