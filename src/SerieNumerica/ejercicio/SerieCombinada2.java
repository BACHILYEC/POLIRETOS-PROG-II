package SerieNumerica.ejercicio;
import Recursividad.Variables;

public class SerieCombinada2 extends Variables {
    public void reset(){
        setCiclo(0);
        setAux(2);
        setSuma(1);
        setAux2(0);
    }
    public SerieCombinada2(int numero) {
        super(numero);
        reset();
    }

    public String Combinada2() {
        String resultado = "";
        for (int j = 0; j < getNumero(); j++) {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux() + " ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux() + " ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux() + " ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
        }
        return resultado;
    }

    public String Combinada2While() {
        String resultado = "";
        int j = 0;
        while (j < getNumero()) {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux() + " ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux() + " ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux() + " ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
            j++;
        }
        return resultado;
    }

    public String Combinada2DoWhile() {
        String resultado = "";
        int j = 0;
        do {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux() + " ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux() + " ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux() + " ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
            j++;
        } while (j < getNumero());
        return resultado;
    }

    // Métodos de impresión agrupados al final
    public void imprimirCombinada() {
        reset();
        System.out.println("Serie Combinada2 (For):\n" + Combinada2());
    }

    public void imprimirCombinadaWhile() {
        reset();
        System.out.println("Serie Combinada2 (While):\n" + Combinada2While());
    }

    public void imprimirCombinadaDoWhile() {
        reset();
        System.out.println("Serie Combinada2 (Do-While):\n" + Combinada2DoWhile());
    }
}
