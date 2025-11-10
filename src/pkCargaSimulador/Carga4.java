package pkCargaSimulador;

import Recursividad.Variables;

public class Carga4 extends Variables{
    public Carga4 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar4() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 4");
        System.out.println("============");
        System.out.println();
        int acum = 0;
        String caracter = " ";

        for (int i = 1; i <= 21; i++) {
            System.out.print("\r");
            System.out.print("[");
            if(i%2==0){
                caracter = "0oo";
            }
            if(i%2!=0){
                caracter = "o0o";
            }
            if(i%3==0){
                caracter = "oo0";
            }
            System.out.print(caracter + "]" + acum + " %");
            Thread.sleep(getTiempo());
            acum = acum + 5;
        }
    }
}
