package pkCicloFiguras;

import Recursividad.Variables;

public class Figura4 extends Variables{

    public Figura4(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura4() {
        System.out.println("Figura 4");
        int aux = 0;
        for (int i = 1; i <= getNumero(); i++) {
            for (int j = 1; j <= getNumero(); j++) {
                System.out.print(j==getNumero() || j>=getNumero()-aux ? "*" + "": " ");
                System.out.print(" ");
            }
            aux++;   
            System.out.println();
        }
    }

}
