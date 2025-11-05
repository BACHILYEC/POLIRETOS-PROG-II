package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S4 extends IHVariable {

    public S4(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarSucesionSignoFor(){

        System.out.println("Con FOR:");

        for(int j=1; j<=getRepeticion(); j++){

            for(int i = 1; i<=4; i++){

                int posicion = (i-1) % 4;
                // Determiné el signo a imprimir según la posición 
                if (posicion == 0)
                    System.out.print("+  ");
                else if (posicion == 1)
                    System.out.print("-  ");
                else if (posicion == 2)
                    System.out.print("*  ");
                else
                    System.out.print("/  ");
            }        
        }

        System.out.println("");

    }

    public void g2_mostrarSucesionSignoWhile(){

        System.out.println("Con WHILE:");

        int j = 1;
        while(j <= getRepeticion()){

            int i = 1;
            while(i <= 4){

                int posicion = (i-1) % 4;
                // Determiné el signo a imprimir según la posición 
                if (posicion == 0)
                    System.out.print("+  ");
                else if (posicion == 1)
                    System.out.print("-  ");
                else if (posicion == 2)
                    System.out.print("*  ");
                else
                    System.out.print("/  ");

                i++;
            }

            j++;
        }
        System.out.println("");

    }

    public void g2_mostrarSucesionSignoDoWhile(){

        System.out.println("Con DO WHILE:");

        int j = 1;
        do{

            int i = 1;
            do{

                int posicion = (i-1) % 4;
                // Determiné el signo a imprimir según la posición 
                if (posicion == 0)
                    System.out.print("+  ");
                else if (posicion == 1)
                    System.out.print("-  ");
                else if (posicion == 2)
                    System.out.print("*  ");
                else
                    System.out.print("/  ");

                i++;
            }while(i <= 4);

            j++;
        }while(j <= getRepeticion());

        System.out.println("");

    }

}

