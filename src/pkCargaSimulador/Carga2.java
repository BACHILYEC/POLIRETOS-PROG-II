package pkCargaSimulador;

import Recursividad.Variables;
import java.util.Scanner;

public class Carga2 extends Variables {

    Scanner sc = new Scanner(System.in);

    public Carga2 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    
    public void g2_cargar2() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 2");
        System.out.println("============");
        System.out.println();
        System.out.print("Ingrese el caracter a imprimir: ");
        String caracter = sc.nextLine();
        int acum = 0;
        for (int i = 1; i <= 21; i++) {
            System.out.print("\r" + "[");
            for (int j = 1; j <= 20; j++) {
                if(j<i){
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("]" + acum + " %");
            acum = acum + 5;
            Thread.sleep(getTiempo());
        }
    }
}
