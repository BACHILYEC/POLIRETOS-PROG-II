package pkCargaSimulador;

import Recursividad.Variables;

public class Carga extends Variables{

    public Carga(){
        super();
    }

    public Carga(int tiempo){
        super(tiempo);
        this.setTiempo(tiempo);
    }

    public void carga1() throws InterruptedException {
        String v[][] = new String[1][5];
        int acum = 0;
        for(int i=0; i<1; i++){
            for(int j=0; j<5; j++){
                v[i][j] = "_";
                if(acum==25){
                    v[i][j] = "\\";
                }
                if(acum==50){
                    v[i][j] = "|";
                }
                if(acum==75){
                    v[i][j] = "/";
                }
                if(acum==100){
                    v[i][j] = "_";
                }
                System.out.print("\r"); 
                System.out.print(v[i][j] + " " + acum + "%");
                Thread.sleep(getTiempo());
                acum = acum + 25;
            }
        }
        
    }

    public void carga2(char caracter) throws InterruptedException {
    
        for(int i=0; i<=20; i++){
            int porcentaje = (i*4)+20;
            System.out.print("\r");
            System.out.print("[");
            for(int j=0; j<20; j++){
                if(j < i){
                    System.out.print(caracter);
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.print("]" + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
        
    }

    public void carga3(char caracter) throws InterruptedException {
    
        for(int i=0; i<=20; i++){
            int porcentaje = (i*4)+20;
            System.out.print("\r");
            System.out.print("[");
                for(int j=0; j<10; j++){
                    if(j == i){
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");      
                    }
                }
                if(porcentaje >= 54){
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
            System.out.print("]" + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
        
    }








}
