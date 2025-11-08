package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S4 extends IHVariable {

    public S4(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarSucesionSignoFor(){

        System.out.println("Con For: ");
        for(int i=1; i<=getRepeticion(); i++){
            
            for(int j= 1; j<=4; j++){
                if(j % 4 == 1)
                    System.out.printf("+ ");
                
                if(j % 4 == 2)
                    System.out.printf("- ");
                
                if(j % 4 == 3)
                    System.out.printf("* ");

                if(j % 4 == 0)
                    System.out.printf("/ ");
                
            }

            System.out.printf(" ");
        }

        System.out.println("");

    }

    public void g2_mostrarSucesionSignoWhile(){

        System.out.println("Con While: ");
        int i = 1;

        while(i<=getRepeticion()){
            int j = 1;

            while(j<=4){
                if(j % 4 == 1)
                    System.out.printf("+ ");
                
                if(j % 4 == 2)
                    System.out.printf("- ");
                
                if(j % 4 == 3)
                    System.out.printf("* ");

                if(j % 4 == 0)
                    System.out.printf("/ ");
                
                j++;
            }

            System.out.printf(" ");
            i++;
        }

        System.out.println("");

    }

    public void g2_mostrarSucesionSignoDoWhile(){

        System.out.println("Con Do While: ");
        int i = 1;

        do{
            int j = 1;

            do{
                if(j % 4 == 1)
                    System.out.printf("+ ");
                
                if(j % 4 == 2)
                    System.out.printf("- ");
                
                if(j % 4 == 3)
                    System.out.printf("* ");

                if(j % 4 == 0) //Division exacta!
                    System.out.printf("/ ");
                
                j++;
            }while(j<=4);

            System.out.printf(" ");
            i++;
        }while(i<=getRepeticion());

        System.out.println("");

    }

}

