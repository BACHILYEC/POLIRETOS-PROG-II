package pkCicloFiguras;

import Recursividad.Variables;

public class Figura12 extends Variables{

    public Figura12(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura12() {
        System.out.println("Figura 12");
        for (int i = getNumero(); i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
        }
            System.out.println();
        }
    }

}
