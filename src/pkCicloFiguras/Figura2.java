package pkCicloFiguras;

import Recursividad.Variables;

public class Figura2 extends Variables{


    public Figura2(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura2() {
        System.out.println("Figura 2");
        for (int i = 1; i <= getNumero(); i++) {
            for (int j = 1; j <= getNumero(); j++) {
                if(i==1 || i==getNumero() || j==1 || j==getNumero()){
                    System.out.print((i+j)%2==0 ? "*" + " " : "+" + " ");
                }else{
                    System.out.print("  ");
                }
            }   
            System.out.println();
        }
    }




}
