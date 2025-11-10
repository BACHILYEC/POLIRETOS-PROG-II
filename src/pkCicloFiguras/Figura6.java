package pkCicloFiguras;

import Recursividad.Variables;

public class Figura6 extends Variables {

    public Figura6(int num) {
        super();
        setNumero(num);
        setAux(0);
    }

    public void g2_crearFigura6() {
        System.out.println("Figura 6");
        for (int i = 1; i <= getNumero(); i++) {
            for (int j = 1; j <= getNumero(); j++) {
                System.out.print(j==getNumero() || j>=getNumero()-getAux() ? " "+"*": " ");
            }
            setAux(getAux()+1);;   
            System.out.println();
        }
    }

}
