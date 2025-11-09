package Recursividad.ejercicios;

import Recursividad.Variables;

public class ConteoReg extends Variables {
    public ConteoReg(int numero){
        super(Math.abs(numero));
        this.setCiclo(0);
    }
    public void g2_conteoReg(){
        if(getCiclo() <= getNumero()){
            if(getCiclo() != getNumero()){
            System.out.print(getNumero()+ "-");
            }
            else
            System.out.println(getNumero());
            setNumero(getNumero()-1);    
            g2_conteoReg();    
    }
    

}
}
