package pkCicloFiguras;

import Recursividad.Variables;

public class Figura1 extends Variables {

    public Figura1(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura1() {
        System.out.println("Figura 1");
        for (int i = 1; i <= getNumero(); i++) {
            for (int j = 1; j <= getNumero(); j++) {
                System.out.print(i==1 || i==getNumero() || j==1 || j==getNumero() ? "*" + " " : "  ");
            }   
            System.out.println();
        }
    }

}
