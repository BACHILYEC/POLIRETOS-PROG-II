package pkCicloFiguras;

import Recursividad.Variables;

public class Figura3 extends Variables{


    public Figura3(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura3() {
        System.out.println("Figura 3");
        for (int i = 1; i <= getNumero(); i++) {
            for (int j = 1; j <= getNumero(); j++) {
                System.out.print(i==j || i>j ? "*" + " " : " ");
            }   
            System.out.println();
        }
    }


}
