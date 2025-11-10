package pkCargaSimulador;

import Recursividad.Variables;

public class Carga7 extends Variables{
    public Carga7 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar7() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 7");
        System.out.println("============");
        System.out.println();
        int acum = 0;
        char[] signos = {'_','\\', '|', '/', '_','_','\\', '|', '/', '_','_','\\', '|', '/', '_','_','\\', '|', '/', '_','\\','|'};
        for (int i = 1; i <= 21; i++) {
            char caracter = signos[i];
            System.out.print("\r" + "[");
            for (int j = 1; j <= 20; j++) {
                if(j == i){
                    System.out.print(caracter);
                }

                if(i>j){
                    System.out.print("=");
                }
            }
            System.out.print("]" + acum + " %");
            Thread.sleep(getTiempo());
            acum = acum + 5;
        }
    }
}
