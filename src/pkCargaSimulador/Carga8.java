package pkCargaSimulador;

import Recursividad.Variables;
import java.util.Scanner;

public class Carga8 extends Variables{

    Scanner sc = new Scanner(System.in);

    public Carga8 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar8() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 8");
        System.out.println("============");
        System.out.println();
        System.out.println("Ingrese su nombre y apellido: ");
        String nombre = sc.nextLine();
        int acum = 0;
        System.out.print("\r");
        System.out.print("[");
        for(int i=0; i<=nombre.length(); i++){
            System.out.print("\r[");
            for (int j = 0; j < nombre.length(); j++) {
                if (j < i) {
                    System.out.print(nombre.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            acum = acum + (100)/nombre.length();
            if(i==nombre.length()){
                acum = 100;
            }
            System.out.print("] " + acum + "%");
            Thread.sleep(getTiempo());
        }
    }
}
