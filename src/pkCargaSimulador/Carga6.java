package pkCargaSimulador;

import Recursividad.Variables;

public class Carga6 extends Variables{
    public Carga6 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar6() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 6");
        System.out.println("============");
        System.out.println();
        int acum = 0;
        String caracter = "<=>";
        for (int i = 1; i <= 41; i++) {
            System.out.print("\r" + "[");
            for (int j = 1; j <= 20; j++) {
                if(j == i){
                        System.out.print(caracter);
                } else {
                        System.out.print(" ");      
                }
            }
                if(acum >=100){
                    System.out.print("\r");
                    System.out.print("[");
                    for(int j=40; j>=21; j--){
                        if(j == i){
                        System.out.print(caracter);
                        } else {
                            System.out.print(" ");      
                        }
                    }
                }
            
            System.out.print("]" + acum/2 + " %");
            Thread.sleep(getTiempo());
            acum = acum + 5;
        }
    }
}
