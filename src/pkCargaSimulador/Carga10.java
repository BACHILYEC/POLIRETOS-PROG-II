package pkCargaSimulador;

import Recursividad.Variables;

public class Carga10 extends Variables{

    java.util.Random random = new java.util.Random();

    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String azul = "\u001B[34m";
    public static final String blanco = "\u001B[97m";

    public Carga10 (int tiempo){
        super();
        setTiempo(tiempo);
    }
    public void g2_cargar10() throws InterruptedException{
        System.out.println("\n============");
        System.out.println("Carga 10");
        System.out.println("============");
        System.out.println();
        
        int numero = random.nextInt(10, 101);
        int acum = 0;
        System.out.println("Descargando pelicula.rar (" + numero + "kb)");
        String color = blanco;
        for(int i=1; i<=numero; i++){
            System.out.print("\r");
            System.out.print("[ ");
            for(int j=1; j<=numero; j++){
                if(acum<=10){
                    color = azul;
                }
                if(acum>10){
                    color = amarillo;
                }
                if(acum>=50){
                    color = azul;
                }
                if(acum>=70){
                    color = verde;
                }
                if(j<i){
                    System.out.print(color + "-");
                }else{
                    System.out.print(" ");
                }
                
            }
            Thread.sleep(getTiempo());
            acum = acum + 100/numero;
            if(i==numero){
                    acum = 100;
                    color = blanco;
            }
            System.out.print("]" + acum + " %" + color);
            
        }
    }
}
