package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S3 extends IHVariable {

    public S3(int repeticion) {
        super(repeticion);
    }

    public void g2_crearSeriePrimoFor(){
        System.out.println("Con FOR:");

        int contadorPrimos = 0;
        for(int i=2; contadorPrimos < getRepeticion(); i++){
            boolean esPrimo = true;
            for(int j=2; j*j <= i; j++){
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
            }

            if(esPrimo){
                for(int k=0; k < i; k++){
                    System.out.print("+");
                }
                System.out.print("  ");
                contadorPrimos++;
            }
        }

        System.out.println("");
    }

    public void g2_crearSeriePrimoWhile(){
        System.out.println("Con WHILE:");
        int contadorPrimos = 0;
        int i = 2;
        while(contadorPrimos < getRepeticion()){
            boolean esPrimo = true;
            int j = 2;
            while(j * j <= i){
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
                j++;
            }

            if(esPrimo){
                int k = 0;
                while(k < i){
                    System.out.print("+");
                    k++;
                }
                System.out.print("  ");
                contadorPrimos++;
            }
            i++;
        }
        System.out.println("");
    }

    public void g2_crearSeriePrimoDoWhile(){
        System.out.println("Con DO WHILE:");
        int contadorPrimos = 0;
        int i = 2;
        do{
            boolean esPrimo = true;
            int j = 2;
            do{
                if(j * j > i) break;
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
                j++;
            }while(true);

            if(esPrimo){
                int k = 0;
                do{
                    if(k >= i) break;
                    System.out.print("+");
                    k++;
                }while(true);
                System.out.print("  ");
                contadorPrimos++;
            }
            i++;
        }while(contadorPrimos < getRepeticion());

        System.out.println("");
    }

}
