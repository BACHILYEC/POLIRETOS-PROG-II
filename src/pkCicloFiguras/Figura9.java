package pkCicloFiguras;

import Recursividad.Variables;

public class Figura9 extends Variables{

    public Figura9(int num) {
        super();
        setNumero(num);
        setAux(0);
    }

    public void g2_crearFigura9() {
        System.out.println("Figura 9");
        for (int i = getNumero(); i >=1; i--) {
            for (int j = 1; j <= getNumero(); j++) {
                if(i==j && i==getNumero() && j==getNumero()){
                    System.out.print("_");
                }
                if(i==j && i<getNumero()){
                    System.out.print("_| " + " ".repeat(getAux()) + " ".repeat(getAux()) + "|_");
                    setAux(getAux()+2);
                }
                System.out.print("  ");
            } 
            System.out.println();
        }
    }

}
