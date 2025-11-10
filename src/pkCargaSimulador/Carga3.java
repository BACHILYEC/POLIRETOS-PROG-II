package pkCargaSimulador;

import Recursividad.Variables;
import java.util.Scanner;

public class Carga3 extends Variables {

    Scanner sc = new Scanner(System.in);

    public Carga3 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar3() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 3");
        System.out.println("============");
        System.out.println();
        System.out.print("Ingrese el caracter a imprimir: ");
        String caracter = sc.nextLine();
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
            System.out.print("]" + acum + " %");
            Thread.sleep(getTiempo());
            acum = acum + 5;
        }
    }
}
