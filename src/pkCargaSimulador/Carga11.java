package pkCargaSimulador;

import Recursividad.Variables;

public class Carga11 extends Variables{

    java.util.Random random = new java.util.Random();

    public Carga11 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar11() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 11");
        System.out.println("============");
        System.out.println();
        for(int i=1; i<=50; i++){
            int num = random.nextInt(1,11);
            System.out.print(" ".repeat(11-num));
            for(int j=1; j<=50; j++){
                if(j==25){
                    System.out.print("-".repeat(num)+"|"+"-".repeat(num));
                }
            }
            Thread.sleep(getTiempo());
            System.out.println();
        }
    }
}
