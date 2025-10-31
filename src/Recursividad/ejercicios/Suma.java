package Recursividad.ejercicios;

import Recursividad.Variables;

public class Suma extends Variables {

    public Suma(int numero, int numero2) {
        super(numero, numero2);
        this.setCiclo(1);
        this.setSuma(1);
    }

    public int suma() {
        int resultado = this.getSuma();
        if (this.getCiclo() <= this.getNumero2()) {
            this.setNumero(this.getNumero() + 1);
            this.setSuma(this.getNumero());
            this.setNumero2(this.getNumero2() - 1);
            suma();
        }
        return resultado;
    }

    public void mostrarSuma() {
        System.out.println("Suma: " + this.getSuma());
    }
}
