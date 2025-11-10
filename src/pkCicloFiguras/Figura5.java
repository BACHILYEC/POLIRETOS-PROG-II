package pkCicloFiguras;

import Recursividad.Variables;

public class Figura5 extends Variables {

    public Figura5(int num) {
        super();
        setNumero(num);
        setAux(0);
    }
    
    public void g2_crearFigura5() {
        System.out.println("Figura 5");;
        for (int i = getNumero(); i >= 1; i--) {
            System.out.print(" ".repeat(getAux()+1));
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            setAux(getAux()+1);   
            System.out.println();
        }
    }    

}
