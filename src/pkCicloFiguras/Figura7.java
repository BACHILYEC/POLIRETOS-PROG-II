package pkCicloFiguras;

import Recursividad.Variables;

public class Figura7 extends Variables{

    public Figura7(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura7() {
        System.out.println("Figura 7");
        for (int i = 1; i <= getNumero(); i++) {
            for (int j = 1; j <= getNumero(); j++) {
                if(i==j && i+j==2){
                    System.out.print("_");
                }
                if(i==j && i+j>2){
                    System.out.print("|_");
                }
                System.out.print("  ");
            } 
            System.out.println();
        }
    }

}
