package Recursividad.ejercicios;

import Recursividad.Variables;

public class Factorial extends Variables {
    public Factorial(int numero) {
        super(numero);
        this.setCiclo(1);
        this.setSuma(1);
        this.setAux(0);
    }

    public int factorial() {
        if (this.getCiclo() <= this.getNumero()) {
            this.setAux(this.getCiclo() * this.getSuma());
            this.setCiclo(this.getCiclo() + 1);
            this.setSuma(this.getAux());
            factorial();
        }
        return this.getAux();
    }

    public void mostrarFactorial() {
        System.out.println("Factorial: " + this.getSuma());
    }
}
