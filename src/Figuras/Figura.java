package Figuras;

import Recursividad.Variables;

public class Figura extends Variables {

    public Figura(){
        super();
    }

    public Figura(int largo, int ancho){
        super(largo,ancho);
        this.setLargo(5);
        this.setAncho(5);
    }

    public void figura1(){
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(j==this.getAncho()-1 || i==this.getLargo()-1 || j==0 || i==0){
                v[i][j] = "*";
                }
                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }

    public void figura2(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(j==this.getAncho()-1 || i==this.getLargo()-1 || j==0 || i==0){
                    v[i][j] = "*";
                    if(j%2!=0 || i%2!=0){
                        v[i][j] = "+";
                    }
                }
                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }

    public void figura3(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(i>=j){
                    v[i][j] = "*";
                }
                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }

    public void figura4(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(i >= (this.getAncho() - 1 - j)){
                    v[i][j] = "*";
                }
                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }







}
