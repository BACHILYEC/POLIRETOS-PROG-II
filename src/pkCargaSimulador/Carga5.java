package pkCargaSimulador;

import Recursividad.Variables;

public class Carga5 extends Variables{
    public Carga5 (int tiempo){
        super();
        setTiempo(tiempo);
    }

    public void g2_cargar5() throws InterruptedException {
        System.out.println("\n============");
        System.out.println("Carga 5");
        System.out.println("============");
        System.out.println();
        int acum = 0;
        char caracter = '>';
        for (int i = 1; i <= 21; i++) {
            System.out.print("\r" + "[");
            for (int j = 1; j <= 20; j++) {
                if(j == i){
                    System.out.print(caracter);
                }
                if(j%2==0){
                    caracter = '>';
                }
                if(j%2!=0){
                    caracter = '-';
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
