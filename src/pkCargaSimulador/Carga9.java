package pkCargaSimulador;

import Recursividad.Variables;
import java.util.Scanner;

public class Carga9 extends Variables{

    Scanner sc = new Scanner(System.in);

    public Carga9 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar9() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 9");
        System.out.println("============");
        System.out.println();
        System.out.println("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();
        int acum = 0;
        for(int i=0; i<nombre.length(); i++){
            for(int j =0; j<nombre.length(); j++){
                if(i==j){
                    System.out.print(nombre.charAt(i));
                }else{
                    System.out.print(" ");
                }
                if(j==nombre.length()-1){
                    if(i==nombre.length()-1){
                    acum = 100;
                    }
                    System.out.print(" "+ acum + " %");
                }
            }
            acum = acum + 100/nombre.length();
            Thread.sleep(getTiempo());
            System.out.println(" ");
        }
    }
}
