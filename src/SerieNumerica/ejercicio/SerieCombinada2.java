package SerieNumerica.ejercicio;

import SerieNumerica.Variables;

public class SerieCombinada2 extends Variables {
    public SerieCombinada2(int numero) {
        super(numero);
        setCiclo(0);
        setAux(0);
        setSuma(1);
        setAux2(0);
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

    public void imprimirCombinada() {
        System.out.println("Serie Combinada:\n" + Combinada2());
    }

}
