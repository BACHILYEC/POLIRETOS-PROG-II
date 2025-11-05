package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S2 extends IHVariable {

    public S2(int repeticion) {
        super(repeticion);
        inicializarFibonacci();
    }

    private void inicializarFibonacci() {
    setNumero1(0);
    setNumero2(1);
    setNumero3(0);
    }

    public void g2_crearSerieFibonacciMasFor(){

        System.out.println("Con FOR:");

        for(int i=1; i<=getRepeticion(); i++){

            setNumero3(getNumero1() + getNumero2());

            setNumero1(getNumero2());
            setNumero2(getNumero3());

            for(int j=1; j<=getNumero1(); j++)
                System.out.print("+");
            
            System.out.print(" ");
            
        }
        System.out.println("");
    }

    public void g2_crearSerieFibonacciMasWhile(){

        System.out.println("Con WHILE:");

        inicializarFibonacci();

        int i=1;
        while(i <=getRepeticion()){

            setNumero3(getNumero1() + getNumero2());

            setNumero1(getNumero2());
            setNumero2(getNumero3());

            int j=1;
            while(j <= getNumero1()){
                System.out.print("+");
                j++;
            }

            System.out.print(" ");

            i++;

        }

        System.out.println("");

    }

    public void g2_crearSerieFibonacciMasDoWhile(){

        System.out.println("Con DO WHILE:");
        
        inicializarFibonacci();
        int i=1;
        do{

            setNumero3(getNumero1() + getNumero2());

            setNumero1(getNumero2());
            setNumero2(getNumero3());

            int j=1;
            do{
                System.out.print("+");
                j++;
            }while(j <= getNumero1());

            System.out.print(" ");

            i++;

        }while(i <=getRepeticion());

        System.out.println("");

    }


}
    