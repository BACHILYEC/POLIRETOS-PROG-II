package Recursividad.ejercicios;

import Recursividad.Variables;

public class Potencia extends Variables {


    public Potencia(int numero, int numero2) {
        super(numero, numero2);
        setCiclo(1);
        setSuma(1);
    }

    public long g2_potencia(){
        if(getCiclo() <= Math.abs(getNumero2())){
          setSuma(getSuma() * getNumero());
            setCiclo(getCiclo() +1);
            g2_potencia();
        }
        return getSuma();
    }
    public void g2_mostrarPotencia(){
        System.out.println("Potencia: " + getSuma());
    }
}
