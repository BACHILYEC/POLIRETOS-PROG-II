package pkCargaSimulador;

import Recursividad.Variables;

public class Carga12 extends Variables{

    java.util.Random random = new java.util.Random();

    public Carga12 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar12() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 12");
        System.out.println("============");
        System.out.println();
        for(int i=1; i<=10; i++){
            int num = random.nextInt(1,9);
            System.out.print("\r");
            for(int j=1; j<=num; j++){
                System.out.print("☰");
            }
            Thread.sleep(getTiempo());
            System.out.println();
        }
    }
}
