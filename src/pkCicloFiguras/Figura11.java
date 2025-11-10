package pkCicloFiguras;

import Recursividad.Variables;

public class Figura11 extends Variables{

    public Figura11(int num) {
        super();
        setNumero(num);
        setAux(0);
    }

    public void g2_crearFigura11() {
        System.out.println("Figura 11");
        for (int i = 1; i <= getNumero(); i++) {
            setAux(getAux()+1);
            System.out.print(" ".repeat(getAux()*i));
            for (int j = 1; j <= getNumero(); j++) {
                if(i==j){
                    System.out.print("|" + " _".repeat(i));
                }
        }
            
            System.out.println();
        }
    }

}
