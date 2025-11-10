package pkCicloFiguras;

import Recursividad.Variables;

public class Figura10 extends Variables {

    public Figura10(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura10() {
        System.out.println("Figura 10");
        for (int i = 1; i <= getNumero()+1; i++) {
            for (int j = 1; j <= getNumero()+1; j++) {
                if(i==j && j%2!=0 && i==1 && j==1){
                    System.out.print("_+_");
                }
                if(i==j && j%2!=0 && i>1 && j>1 && i!=getNumero()+1 && j!=getNumero()+1){
                    System.out.print("|_+_");
                }
                if(i==j && j%2==0 && i!=getNumero()+1 && j!=getNumero()+1){
                    System.out.print("|_-_");
                }
                if(i==getNumero()+1 && j==getNumero()+1){
                    System.out.print("|"); 
                }
                System.out.print("    ");
            } 
            System.out.println();
        }
    }


}
