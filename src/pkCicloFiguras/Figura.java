package pkCicloFiguras;

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

    public void g2_crearFigura1(){
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(j==this.getAncho()-1 || i==this.getLargo()-1 || j==0 || i==0){
                v[i][j] = "*";
                }
                System.out.print(v[i][j]);
            } 

            System.out.println("");
        }
    }

    public void g2_crearFigura2(){
        
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
                System.out.print(v[i][j]);
            } 

            System.out.println("");
        }
    }

    public void g2_crearFigura3(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 1; i <= this.getLargo(); i++){ 
            for(int j = 1; j <= i; j++){ 
                System.out.print("*");
            } 
            System.out.println("");
        }
    }

    public void g2_crearFigura4(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(i >= (this.getAncho()-1-j)){
                    v[i][j] = "*";
                }
                System.out.print(v[i][j]);
            } 

            System.out.println("");
        }
    }

    public void g2_crearFigura5(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
            v[i][j] = " ";
            if(j >= i && j < this.getAncho()-i){
                v[i][j] = "*";
            }
            System.out.print(v[i][j]);
        } 
        System.out.println("");
        }       
    }

    public void g2_crearFigura6(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                v[i][j] = " ";
                if(j >= this.getAncho()/2-i && j<=this.getAncho()/2+i){
                    v[i][j] = "*";
                }

                System.out.print(v[i][j]);
            } 

            System.out.println("");
        }       
    }

    public void g2_crearFigura7(){
        
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

                System.out.print(v[i][j]);
            } 

            System.out.println("");
        }
    }

    public void g2_crearFigura8(){
        
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
                System.out.print(v[i][j]);
            } 
            System.out.println("");
        }
    }

    public void g2_crearFigura9(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getAncho(); i++){ 
            for(int j = 0; j < this.getAncho() - i - 1; j++){
                System.out.print("   ");
            }

            System.out.print("|--");

            for(int j = 0; j < i*2; j++){
            System.out.print("   ");
            }
            if(i < this.getAncho() - 1){
                System.out.print("--|");
            }
            System.out.println("");
        }   
    }

    public void g2_crearFigura10(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
     
        for(int i = 0; i < this.getLargo(); i++){ 
            for(int j = 0; j < this.getAncho(); j++){ 
                if(i==j){
                    v[i][j] = " _+_";
                }
                if(i%2==0 && i!=0){
                    v[i][j] = "|_+_";
                }
                if(i==j && i%2!=0){
                    v[i][j] = "|_-_ ";
                }
                if(i!=j){
                    v[i][j] = " ";
                }
                if(i==j && i==this.getLargo()-1){
                    v[i][j] = "|";
                }
                System.out.print("   "+v[i][j]);
            } 

            System.out.println("");
        }
    }

    public void g2_crearFigura11(){
        
        String[][] v = new String[this.getLargo()][this.getAncho()];
        
        for(int i = 0; i < this.getAncho(); i++){ 
            for(int j = 0; j < i * this.getLargo(); j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("");
            for(int j = 0; j <= i; j++){
                System.out.print(" _");
            }
            System.out.println("");
        
        }       
    }

    public void g2_crearFigura12(){
        
        int[][] v = new int[this.getLargo()][this.getAncho()];
        
        for (int i = this.getAncho(); i >= 1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
                System.out.println();
        }       
    }

    public void g2_crearFigura13(){
        
        int[][] v = new int[this.getLargo()][this.getAncho()];
        
        for (int i=1; i<=this.getAncho(); i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
                System.out.println();
        }       
    }

    public void g2_crearFigura14(){
        for (int i=0; i < this.getLargo(); i++) {
            for (int j=0; j < this.getAncho() - i; j++) {
                System.out.print(" ");
            }
            int num= 1;
            for (int j=0; j<= i; j++) {
                System.out.print(num + " ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

     public void g2_crearFigura15(){
        for (int i = 0; i < this.getLargo(); i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num =num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public void g2_crearFigura16(){

        String[][] v = new String[this.getLargo()][this.getAncho()];

        for (int i = 0; i < this.getLargo(); i++) {
            for (int j = 0; j < this.getAncho(); j++) {
                v[i][j] = " ";
                if(i==0 && j==0 || i==0 && j==this.getAncho()-1 || i==this.getLargo()-1 && j==0 || i==this.getLargo()-1 && j==this.getAncho()-1){
                v[i][j] = "+";
                }

                if(i%2!=0 && j==(this.getLargo()-3) || i%2!=0 && j==(this.getAncho()-3)){
                    v[i][j] = "-";
                }

                if(j==((this.getAncho()-1)/2) && i==((this.getLargo()-1)/2)){
                    v[i][j] = "+";
                }

                System.out.print(v[i][j]);
            }
            System.out.println("");
        }
    }

    public void g2_crearFigura17(){

        String[][] v = new String[this.getLargo()][this.getAncho()];

        for (int i = 0; i < this.getLargo(); i++) {
            for (int j = 0; j < this.getAncho(); j++) {
                v[i][j] = " ";
                if(i==0 && j==0 || i==0 && j==this.getAncho()-1 || i==this.getLargo()-1 && j==0 || i==this.getLargo()-1 && j==this.getAncho()-1){
                v[i][j] = "1";
                }

                if(i%2!=0 && j==(this.getLargo()-3) || i%2!=0 && j==(this.getAncho()-3)){
                    v[i][j] = "0";
                }

                if(j==((this.getAncho()-1)/2) && i==((this.getLargo()-1)/2)){
                    v[i][j] = "1";
                }

                System.out.print(v[i][j]);
            }
            System.out.println("");
        }
    }

    public void g2_crearFigura18(){

        String[][] v = new String[this.getLargo()][this.getAncho()];

        for (int i = 0; i < this.getLargo(); i++) {
                int num = 2;
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num =num*(i-j)/(j+1);
                }
                
                System.out.println();
        }
    }

    public void g2_crearFigura19(){

        String[][] v = new String[this.getLargo()][this.getAncho()];
        int[][] v1 = new int[this.getLargo()][this.getAncho()];
        int num = 1;
        for (int i = 1; i <= this.getLargo(); i++) {
            System.out.print("+ ");
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.print("*");
            
            System.out.println();
        }
    }


    }


