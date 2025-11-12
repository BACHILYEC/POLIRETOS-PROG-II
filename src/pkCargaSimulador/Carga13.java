package pkCargaSimulador;

import Recursividad.Variables;

public class Carga13 extends Variables{
    public Carga13 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar13() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 13");
        System.out.println("============");
        System.out.println();
        String caracter = "ooO-(>_<)-Ooo";
        int acum = 0;
        for (int i = 1; i <= 21; i++) {
            System.out.print("\r" + "[");
            for (int j = 1; j <= 10; j++) {
                if(j == i){
                        System.out.print(caracter);
                } else {
                        System.out.print(" ");      
                }
            }
                if(acum >=45){
                    System.out.print("\r");
                    System.out.print("[");
                    for(int j=20; j>=11; j--){
                        if(j == i){
                        System.out.print(caracter);
                        } else {
                            System.out.print(" ");      
                        }
                    }
                }
            Thread.sleep(getTiempo());
            acum = acum + 5;
        }
    }
}
