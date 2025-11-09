package Recursividad.ejercicios;

import Recursividad.Variables;

public class Multiplicacion extends Variables {

    public Multiplicacion(int numero, int numero2) {
        super(numero, numero2);
        setCiclo(1);
        setSuma(0);
    }

    public int g2_multiplicacion() {
        if (getCiclo() <= Math.abs(getNumero2())) {
            setSuma(getSuma() + Math.abs(getNumero()));
            setCiclo(getCiclo() + 1);
            g2_multiplicacion();
        }
        else{
        if (getNumero() == 0 || getNumero2() == 0) {
            setSuma(0);
        } else if (getNumero() < 0 && getNumero2() < 0) {
            setSuma(getSuma()); 
        } else if (getNumero() < 0 || getNumero2() < 0) {
            setSuma(-getSuma()); 
        }
    }
        return getSuma();
    }

    public void g2_mostrarMultiplicacion() {
        System.out.println("Multiplicacion: " + getSuma());
    }
}
