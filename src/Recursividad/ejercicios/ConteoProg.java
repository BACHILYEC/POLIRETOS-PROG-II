package Recursividad.ejercicios;

import Recursividad.Variables;

public class ConteoProg extends Variables {


    public ConteoProg(int numero) {
        super(Math.abs(numero));
        setCiclo(0);
    }

    public void conteoProg() {
       if(getCiclo() <= getNumero()){
        if(getCiclo() != getNumero()){
        System.out.print(getCiclo() + "-");
        }
        else
        System.out.println(getCiclo());
           setCiclo(getCiclo() +1);
           conteoProg();
       
    }
}
}
