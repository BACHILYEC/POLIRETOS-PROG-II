<<<<<<< HEAD
package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class Serie5 extends Variables {
    public void reset(){
        setCiclo(3);
    }
    public Serie5(int numero) {
        super(numero);
        reset();
    }
    public String mas5() {
        String resultado = "";
        for (int i = 1; i <= getNumero(); i++) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 5);
        }
        return resultado;
    }

    public String Mas5While() {
        String resultado = "";
        int i = 1;
        while (i <= getNumero()) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 5);
            i++;
        }
        return resultado;
    }

    public String Mas5DoWhile() {
        String resultado = "";
        int i = 1;
        do {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 5);
            i++;
        } while (i <= getNumero());
        return resultado;
    }

    public void imprimirMas5() {
        System.out.println("Serie +5 (For):");
        reset();
        System.out.println(mas5());
    }

    public void imprimirMas5While() {
        System.out.println("Serie +5 (While):");
        reset();
        System.out.println(Mas5While());
    }

    public void imprimirMas5DoWhile() {
        System.out.println("Serie +5 (Do-While):");
        reset();
        System.out.println(Mas5DoWhile());
    }
=======
package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class Serie5 extends Variables {
    public void reset(){
        setCiclo(3);
    }
    public Serie5(int numero) {
        super(numero);
        reset();
    }
    public String g2_mas5() {
        String resultado = "";
        for (int i = 1; i <= getNumero(); i++) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 5);
        }
        return resultado;
    }

    public String g2_Mas5While() {
        String resultado = "";
        int i = 1;
        while (i <= getNumero()) {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 5);
            i++;
        }
        return resultado;
    }

    public String g2_Mas5DoWhile() {
        String resultado = "";
        int i = 1;
        do {
            resultado += getCiclo() + " ";
            setCiclo(getCiclo() + 5);
            i++;
        } while (i <= getNumero());
        return resultado;
    }

    public void g2_imprimirMas5() {
        System.out.println("Serie +5 (For):");
        reset();
        System.out.println(g2_mas5());
    }

    public void g2_imprimirMas5While() {
        System.out.println("Serie +5 (While):");
        reset();
        System.out.println(g2_Mas5While());
    }

    public void g2_imprimirMas5DoWhile() {
        System.out.println("Serie +5 (Do-While):");
        reset();
        System.out.println(g2_Mas5DoWhile());
    }
>>>>>>> main
}