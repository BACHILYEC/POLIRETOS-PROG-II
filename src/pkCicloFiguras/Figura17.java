package pkCicloFiguras;

import Recursividad.Variables;

public class Figura17 extends Variables {

    public Figura17(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura17() {
        System.out.println("Figura 17");
        for (int i = 1; i<=getNumero(); i++) {
            for (int j = 1; j<=getNumero(); j++) {
                if(i==j && i%2!=0){
                    System.out.print("1");
                }
                if(i==j && i%2==0){
                    System.out.print("0");
                }
                if(i+j==getNumero()+1 && i!=((getNumero()/2)+1)){
                    System.out.print(i%2!=0?"1":"0");
                }
                System.out.print(i==((i+j)/2)+1 && i==j?" 1 ":"");
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
