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
        for(int i=1; i<=6; i++){
            System.out.print(" ".repeat(i) );
            System.out.print("\n"+ " ".repeat(i)+"      \\|/");
            System.out.print("\n" + " ".repeat(i) + "     (> <)");
            System.out.print("\n" + " ".repeat(i) + "  ooO-(_)-Ooo");
            Thread.sleep(getTiempo());
        }
        for(int i=6; i>=1; i--){
            System.out.print(" ".repeat(i) );
            System.out.print("\n"+ " ".repeat(i)+"      \\|/");
            System.out.print("\n" + " ".repeat(i) + "     (> <)");
            System.out.print("\n" + " ".repeat(i) + "  ooO-(_)-Ooo");
            Thread.sleep(getTiempo());
        }
        System.out.println();
    }
}
