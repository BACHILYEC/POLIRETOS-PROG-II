<<<<<<< HEAD
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S8 extends IHVariable{

    public S8(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarMultiplodeDosLetraFor(){
        System.out.println("Con For: ");

        char letra = 'a';
        int num = 2;

        for(int i = 1; i <= getRepeticion(); i++){
            for(int j = 1; j <=num ; j++){
                System.out.print(letra);
            }

            System.out.printf(" ");
            letra = (char) (letra +1);
            num +=2;
        }
        System.out.println("");
    }

    public void g2_mostrarMultiplodeDosLetraWhile(){
        System.out.println("Con While: ");

        char letra = 'a';
        int num = 2;
        int i = 1;

        while(i <= getRepeticion()){
            int j = 1;

            while(j <= num){
                System.out.print(letra);
                j++;
            }

            System.out.printf(" ");
            letra = (char) (letra +1);
            num +=2;
            i++;
        }

        System.out.println("");
    }

    public void g2_mostrarMultiplodeDosLetraDoWhile(){
        System.out.println("Con Do While: ");

        char letra = 'a';
        int num = 2;
        int i = 1;

        do{
            int j = 1;

            do{
                System.out.print(letra);
                j++;
            }while(j <= num);

            System.out.printf(" ");
            letra = (char) (letra +1);
            num +=2;
            i++;
        }while(i <= getRepeticion());

        System.out.println("");
    }
=======
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S8 extends IHVariable{

    public S8(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarMultiplodeDosLetraFor(){
        System.out.println("Con For: ");

        char letra = 'a';
        int num = 2;

        for(int i = 1; i <= getRepeticion(); i++){
            for(int j = 1; j <=num ; j++){
                System.out.print(letra);
            }

            System.out.printf(" ");
            letra = (char) (letra +1);
            num +=2;
        }
        System.out.println("");
    }

    public void g2_mostrarMultiplodeDosLetraWhile(){
        System.out.println("Con While: ");

        char letra = 'a';
        int num = 2;
        int i = 1;

        while(i <= getRepeticion()){
            int j = 1;

            while(j <= num){
                System.out.print(letra);
                j++;
            }

            System.out.printf(" ");
            letra = (char) (letra +1);
            num +=2;
            i++;
        }

        System.out.println("");
    }

    public void g2_mostrarMultiplodeDosLetraDoWhile(){
        System.out.println("Con Do While: ");

        char letra = 'a';
        int num = 2;
        int i = 1;

        do{
            int j = 1;

            do{
                System.out.print(letra);
                j++;
            }while(j <= num);

            System.out.printf(" ");
            letra = (char) (letra +1);
            num +=2;
            i++;
        }while(i <= getRepeticion());

        System.out.println("");
    }
>>>>>>> main
}