package pkCicloFiguras;

import Recursividad.Variables;

public class Figura16 extends Variables{

    public Figura16(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura16() {
        System.out.println("Figura 16");
        for (int i = 1; i<=getNumero(); i++) {
            for (int j = 1; j<=getNumero(); j++) {
                if(i==j && i%2!=0){
                    System.out.print("+");
                }
                if(i==j && i%2==0){
                    System.out.print("-");
                }
                if(i+j==getNumero()+1 && i!=((getNumero()/2)+1)){
                    System.out.print(i%2!=0?"+":"-");
                }
                System.out.print(i==((i+j)/2)+1 && i==j?" + ":"");
                System.out.print("   ");
            }
            System.out.println();
        }
    }

}
