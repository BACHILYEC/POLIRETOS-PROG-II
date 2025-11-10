package pkCicloFiguras;

import Recursividad.Variables;

public class Figura13 extends Variables {

    public Figura13(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura13() {
        System.out.println("Figura 13");
        for (int i = 1; i <=getNumero(); i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
