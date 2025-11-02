package SerieNumerica.ejercicio;

import SerieNumerica.Variables;

public class SerieAlternante extends Variables {
    public SerieAlternante(int numero) {
        super(numero);
        setCiclo(0);
        setAux(1);
    }

    public int Alternante() {
        for (int j = 1; j < getNumero(); j++) {
            if (j % 2 == 0) {
                System.out.print(getCiclo());
            } else {
                System.out.print(getAux());
                setAux(getAux()+2);
            }
        }
        return getAux();
    }

    public void imprimirAlternante() {
        System.out.println("Serie Alternante:");
        Alternante();
    }

}
