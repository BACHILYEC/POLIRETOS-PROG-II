package Recursividad.ejercicios;

import Recursividad.Variables;

public class Potencia extends Variables {


    public Potencia(int numero, int numero2) {
        super(numero, numero2);
        setCiclo(1);
        setSuma(1);
    }

<<<<<<< HEAD
    public int potencia(){
=======
    public long potencia(){
>>>>>>> mathias-rama2
        if(getCiclo() <= Math.abs(getNumero2())){
          setSuma(getSuma() * getNumero());
            setCiclo(getCiclo() +1);
            potencia();
        }
        return getSuma();
    }
    public void mostrarPotencia(){
        System.out.println("Potencia: " + getSuma());
    }
}
