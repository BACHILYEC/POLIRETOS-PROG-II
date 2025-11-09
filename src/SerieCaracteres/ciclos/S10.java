<<<<<<< HEAD
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S10 extends IHVariable{

    public S10(int numero){
        super(numero);
        setNumero1(0);
        setNumero2(1);
        setNumero3(0);
    }

    public void mostrarSucesiondeLetraFibonacciDosFor(){
        System.out.println("Con For: ");
        char letra = 'a';

        System.out.print(letra + " ");

        letra = (char) (letra + 1);

        for(int i = 1; i < getRepeticion(); i++){

            setNumero3(getNumero1()+getNumero2());
            setNumero1(getNumero2());
            setNumero2(getNumero3());

            for(int j = 1; j <= getNumero1(); j++){
                System.out.print(letra);
            }

            letra = (char) (letra + 1);
            System.out.printf(" ");
        
        }

        System.out.println(" ");

    }

    public void mostrarSucesiondeLetraFibonacciDosWhile(){
        resetNumero();

        System.out.println("Con While: ");
        char letra = 'a';

        System.out.print(letra + " ");

        letra = (char) (letra + 1);

        int i = 1;

        while(i < getRepeticion()){
            setNumero3(getNumero1()+getNumero2());
            setNumero1(getNumero2());
            setNumero2(getNumero3());

            int j = 1;

            while(j <= getNumero1()){
                System.out.print(letra);

                j++;
            }

            letra = (char) (letra + 1);
            System.out.printf(" ");


            i++;
        }
        
        System.out.println(" ");
    }

    public void mostrarSucesiondeLetraFibonacciDosDoWhile(){
        resetNumero();

        System.out.println("Con Do While: ");
        char letra = 'a';

        System.out.print(letra + " ");

        letra = (char) (letra + 1);

        int i = 1;

        do{
            setNumero3(getNumero1()+getNumero2());
            setNumero1(getNumero2());
            setNumero2(getNumero3());

            int j = 1;

            do{
                System.out.print(letra);
                j++;

            }while(j <= getNumero1());

            letra = (char) (letra + 1);
            System.out.printf(" ");

            i++;

        }while(i < getRepeticion());

        System.out.println(" ");
    }

}
=======
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S10 extends IHVariable{

    public S10(int numero){
        super(numero);
        setNumero1(0);
        setNumero2(1);
        setNumero3(0);
    }

    public void mostrarSucesiondeLetraFibonacciDosFor(){
        System.out.println("Con For: ");
        char letra = 'a';

        System.out.print(letra + " ");

        letra = (char) (letra + 1);

        for(int i = 1; i < getRepeticion(); i++){

            setNumero3(getNumero1()+getNumero2());
            setNumero1(getNumero2());
            setNumero2(getNumero3());

            for(int j = 1; j <= getNumero1(); j++){
                System.out.print(letra);
            }

            letra = (char) (letra + 1);
            System.out.printf(" ");
        
        }

        System.out.println(" ");

    }

    public void mostrarSucesiondeLetraFibonacciDosWhile(){
        resetNumero();

        System.out.println("Con While: ");
        char letra = 'a';

        System.out.print(letra + " ");

        letra = (char) (letra + 1);

        int i = 1;

        while(i < getRepeticion()){
            setNumero3(getNumero1()+getNumero2());
            setNumero1(getNumero2());
            setNumero2(getNumero3());

            int j = 1;

            while(j <= getNumero1()){
                System.out.print(letra);

                j++;
            }

            letra = (char) (letra + 1);
            System.out.printf(" ");


            i++;
        }
        
        System.out.println(" ");
    }

    public void mostrarSucesiondeLetraFibonacciDosDoWhile(){
        resetNumero();

        System.out.println("Con Do While: ");
        char letra = 'a';

        System.out.print(letra + " ");

        letra = (char) (letra + 1);

        int i = 1;

        do{
            setNumero3(getNumero1()+getNumero2());
            setNumero1(getNumero2());
            setNumero2(getNumero3());

            int j = 1;

            do{
                System.out.print(letra);
                j++;

            }while(j <= getNumero1());

            letra = (char) (letra + 1);
            System.out.printf(" ");

            i++;

        }while(i < getRepeticion());

        System.out.println(" ");
    }

}
>>>>>>> main
