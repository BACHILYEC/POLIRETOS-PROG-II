package pkCargaSimulador;

import Recursividad.Variables;

public class Carga1 extends Variables {

    public Carga1 (int tiempo){
        super();
        setTiempo(tiempo);
    }

    public void g2_cargar1() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 1");
        System.out.println("============");
        System.out.println();
        int acum = 0;
        char caracter = ' ';
        for (int i = 1; i <= 5; i++) {
                if(acum==0){
                    caracter = '\\';
                }
                if(acum==25){
                    caracter = '|';
                }
                if(acum==50){
                    caracter = '/';
                }
                if(acum==75){
                    caracter = '-';
                }
                if(acum==100){
                    caracter = '|';
                }
                System.out.print("\r" + "[ "+caracter+" ]" + acum + " %");
                acum = acum + 25;
                Thread.sleep(getTiempo());
            }
    
    }


}
