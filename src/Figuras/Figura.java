package Figuras;

import Recursividad.Variables;

public class Figura extends Variables {

    public Figura(){
        super();
    }

    public Figura(int largo, int ancho){
        super(largo,ancho);
        this.setLargo(largo);
        this.setAncho(ancho);
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

    public void figura5(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = "*";
                if(i>j || i >= (this.getAncho() - 2 - j)){
                    v[i][j] = " ";
                }

                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }

    public void figura6(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(j >= this.getAncho() / 2 - i && j <= this.getAncho() / 2 + i){
                    v[i][j] = "*";
                }

                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }       
    }

    public void figura7(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                if(i==j && i%2==0){
                    v[i][j] = " - ";
                }
                if(i==j && i%2!=0){
                    v[i][j] = " | ";
                }
                if(i!=j){
                    v[i][j] = " ";
                }

                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }

    public void figura8(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                if (i + j == this.getAncho() - 1 && i % 2 == 0) {
                v[i][j] = "-";
            }
            if (i + j == this.getAncho() - 1 && i % 2 != 0) {
                v[i][j] = "|";
            }
            if (i + j != this.getAncho() - 1) {
                v[i][j] = " ";
            }
                System.out.print(v[i][j] + " ");
            } 

            System.out.println("");
        }
    }





}
