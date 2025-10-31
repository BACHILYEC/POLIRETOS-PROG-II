package Recursividad.ejercicios;

import Recursividad.Variables;

public class Multiplicacion extends Variables {

    public Multiplicacion(int numero, int numero2){
        super(numero, numero2);
        this.setCiclo(1);
        this.setSuma(0);
    }
    public int multiplicacion(){
        if(this.getCiclo() <= this.getNumero2()){
            this.setSuma(this.getSuma() + this.getNumero());
            this.setCiclo(this.getCiclo() +1);
            multiplicacion();
        }
        return this.getSuma();
    }
    public void mostrarMultiplicacion(){
        System.out.println("Multiplicacion: " + this.getSuma());
    }
}
