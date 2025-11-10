package pkCicloFiguras;

import Recursividad.Variables;

public class Figura8 extends Variables {

    public Figura8(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura8() {
        System.out.println("Ejercicio 8");
        for (int i = getNumero(); i >=1; i--) {
            for (int j = 1; j <= getNumero(); j++) {
                if(i==j && i==getNumero() && j==getNumero()){
                    System.out.print("_");
                }
                if(i==j && i<getNumero()){
                    System.out.print("_|");
                }
                System.out.print("  ");
            } 
            System.out.println();
        }
    }
}
