<<<<<<< HEAD
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S3 extends IHVariable {

    public S3(int repeticion) {
        super(repeticion);
    }

    public void g2_crearSeriePrimoFor(){
        System.out.println("Con For: ");

        for(int i = 2; i <= getRepeticion(); i++){
            if(g2_verificarPrimoFor(i)){

                for(int j = 1; j <= i; j++){

                    System.out.printf("+");

                }
                System.out.printf(" ");
            }

        }

        System.out.println("");
    }

    public boolean g2_verificarPrimoFor(int numero){
        if (numero < 2)
            return false;
            
        for(int i = 2; i <= Math.sqrt(numero); i++){

            if(numero % i == 0)
                return false;
        }

        return true;
        
    }

    public void g2_crearSeriePrimoWhile(){
        System.out.println("Con While: ");

        int i = 2;

        while(i <= getRepeticion()){

            if(g2_verificarPrimoWhile(i)){

                int j = 1;

                while (j <= i){

                    System.out.printf("+");
                    j++;
                    
                }
                System.out.printf(" ");
            }

            i++;

        }
        System.out.println("");
    }

    public boolean g2_verificarPrimoWhile(int numero){

        if (numero < 2)
            return false;
        
        int i = 2;

        while(i <= Math.sqrt(numero)){
            if (numero % i == 0){
                return false;
            }

        i++;

        }

        return true;

    }

    public void g2_crearSeriePrimoDoWhile(){
        System.out.println("Con Do While: ");

        int i = 2;

        do{

            if(g2_verificarPrimoDoWhile(i)){

                int j = 1;

                do{
                    System.out.printf("+");
                    j++;
                }while (j <= i);
                
                System.out.printf(" ");
            }

            i++;

        }while(i <= getRepeticion());

        System.out.println("");
    }

    public boolean g2_verificarPrimoDoWhile(int numero){

        if(numero ==2) // por Do While, 
            return true;

        if (numero < 2)
            return false;
        
        int i = 2;

        do{

            if (numero % i == 0){
                return false;
            }

            i++;

        }while(i <= Math.sqrt(numero));

        return true;

    }

}
=======
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S3 extends IHVariable {

    public S3(int repeticion) {
        super(repeticion);
    }

    public void g2_crearSeriePrimoFor(){
        System.out.println("Con For: ");

        for(int i = 2; i <= getRepeticion(); i++){
            if(g2_verificarPrimoFor(i)){

                for(int j = 1; j <= i; j++){

                    System.out.printf("+");

                }
                System.out.printf(" ");
            }

        }

        System.out.println("");
    }

    public boolean g2_verificarPrimoFor(int numero){
        if (numero < 2)
            return false;
            
        for(int i = 2; i <= Math.sqrt(numero); i++){

            if(numero % i == 0)
                return false;
        }

        return true;
        
    }

    public void g2_crearSeriePrimoWhile(){
        System.out.println("Con While: ");

        int i = 2;

        while(i <= getRepeticion()){

            if(g2_verificarPrimoWhile(i)){

                int j = 1;

                while (j <= i){

                    System.out.printf("+");
                    j++;
                    
                }
                System.out.printf(" ");
            }

            i++;

        }
        System.out.println("");
    }

    public boolean g2_verificarPrimoWhile(int numero){

        if (numero < 2)
            return false;
        
        int i = 2;

        while(i <= Math.sqrt(numero)){
            if (numero % i == 0){
                return false;
            }

        i++;

        }

        return true;

    }

    public void g2_crearSeriePrimoDoWhile(){
        System.out.println("Con Do While: ");

        int i = 2;

        do{

            if(g2_verificarPrimoDoWhile(i)){

                int j = 1;

                do{
                    System.out.printf("+");
                    j++;
                }while (j <= i);
                
                System.out.printf(" ");
            }

            i++;

        }while(i <= getRepeticion());

        System.out.println("");
    }

    public boolean g2_verificarPrimoDoWhile(int numero){

        if(numero ==2) // por Do While, 
            return true;

        if (numero < 2)
            return false;
        
        int i = 2;

        do{

            if (numero % i == 0){
                return false;
            }

            i++;

        }while(i <= Math.sqrt(numero));

        return true;

    }

}
>>>>>>> main
