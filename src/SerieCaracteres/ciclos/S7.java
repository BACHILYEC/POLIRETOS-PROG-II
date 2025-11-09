<<<<<<< HEAD
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S7 extends IHVariable{
    public S7(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarLetraSignoFor(){
        System.out.println("Con FOR:");
        for(int i=0; i<getRepeticion(); i++)
        {
            char letra = (char) ('a' + (2*i) %26) ;
            char mas='+';
            char menos='-';

            if (i % 2 == 0)
                System.out.print(letra + " " + mas + " ");
            else
                System.out.print(letra + " " + menos + " ");

        }
        System.out.println("");
    }

    public void g2_mostrarLetraSignoWhile(){
        System.out.println("Con While: ");
        char letra = 'a';
        int i = 1;
        while(i <= getRepeticion()){
            if(i % 2 != 0){
                System.out.printf(letra + " + ");
                letra = (char) (letra + 2);
            }
            if(i % 2 == 0){
                System.out.printf(letra + " - ");
                letra = (char) (letra + 2);
                
            }
            i++;
        }
        System.out.println("");
    }

    public void g2_mostrarLetraSignoDoWhile(){
        System.out.println("Con Do-While: ");
        char letra = 'a';
        int i = 1;
        do{
            if(i % 2 != 0){
                System.out.printf(letra + " + ");
                letra = (char) (letra + 2);
            }
            if(i % 2 == 0){
                System.out.printf(letra + " - ");
                letra = (char) (letra + 2);

            }
            i++;
        }while(i <= getRepeticion());
        System.out.println("");
    }

}


=======
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S7 extends IHVariable{
    public S7(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarLetraSignoFor(){
        System.out.println("Con FOR:");
        for(int i=0; i<getRepeticion(); i++)
        {
            char letra = (char) ('a' + (2*i) %26) ;
            char mas='+';
            char menos='-';

            if (i % 2 == 0)
                System.out.print(letra + " " + mas + " ");
            else
                System.out.print(letra + " " + menos + " ");

        }
        System.out.println("");
    }

    public void g2_mostrarLetraSignoWhile(){
        System.out.println("Con While: ");
        char letra = 'a';
        int i = 1;
        while(i <= getRepeticion()){
            if(i % 2 != 0){
                System.out.printf(letra + " + ");
                letra = (char) (letra + 2);
            }
            if(i % 2 == 0){
                System.out.printf(letra + " - ");
                letra = (char) (letra + 2);
                
            }
            i++;
        }
        System.out.println("");
    }

    public void g2_mostrarLetraSignoDoWhile(){
        System.out.println("Con Do-While: ");
        char letra = 'a';
        int i = 1;
        do{
            if(i % 2 != 0){
                System.out.printf(letra + " + ");
                letra = (char) (letra + 2);
            }
            if(i % 2 == 0){
                System.out.printf(letra + " - ");
                letra = (char) (letra + 2);

            }
            i++;
        }while(i <= getRepeticion());
        System.out.println("");
    }

}


>>>>>>> main
