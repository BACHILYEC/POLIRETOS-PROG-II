package SerieNumerica.ejercicio;
import Recursividad.Variables;

public class SeriePronic extends Variables {
    public void reset() {
        setCiclo(1);
    }

    public SeriePronic(int numero) {
        super(numero);
        reset();
    }

    public String g2_Pronic() {
        String resultado = "";
        for (int j = 0; j < getNumero(); j++) {
            resultado += (getCiclo() * (getCiclo() + 1)) + " ";
            setCiclo(getCiclo() + 1);
        }
        return resultado;
    }

    public String g2_PronicWhile() {
        String resultado = "";
        int j = 0;
        while (j < getNumero()) {
            resultado += (getCiclo() * (getCiclo() + 1)) + " ";
            setCiclo(getCiclo() + 1);
            j++;
        }
        return resultado;
    }

    public String g2_PronicDoWhile() {
        String resultado = "";
        int j = 0;
        do {
            resultado += (getCiclo() * (getCiclo() + 1)) + " ";
            setCiclo(getCiclo() + 1);
            j++;
        } while (j < getNumero());
        return resultado;
    }

    public void g2_imprimirPronic() {
        System.out.println("Serie Pronic (For):");
        reset();
        System.out.println(g2_Pronic());
    }

    public void g2_imprimirPronicWhile() {
        System.out.println("Serie Pronic (While):");
        reset();
        System.out.println(g2_PronicWhile());
    }

    public void g2_imprimirPronicDoWhile() {
        System.out.println("Serie Pronic (Do-While):");
        reset();
        System.out.println(g2_PronicDoWhile());
    }
}
