package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S9 extends IHVariable{

    public S9(int repeticion) {
        super(repeticion);
    }

    public void mostrarSucesionLetrasImparesFor(){
        System.out.println("Con for: ");
        char letra = 'a';
        for(int i = 1; i <= 2*getRepeticion(); i++){
            if(i%2 != 0){
                for(int j = 1; j <= i; j++){
                    System.out.print(letra);
                }
                
                letra = (char) (letra +1);
            }else{
                System.out.printf(" ");
            }

        }

        System.out.println("");


    }

    public void mostrarSucesionLetrasImparesWhile(){
        System.out.println("Con WHILE:");
        int a= 1, b=2, c=0;
        System.out.print("a  ");
        int i=1;
        while(i<getRepeticion())
        {
            c= a+b;
            a= c;
            
            int j=1;
            while(j<=a)
            {
                char letra =(char) ('a'+ i % 26); 
                System.out.print(letra);
                j++;
            }
            System.out.print("  ");
            i++;
        }
        System.out.println("");
    }

    public void mostrarSucesionLetrasImparesDoWhile(){
        System.out.println("Con Do While: ");
        char letra = 'a';
        int i = 1;

        do{
            if(i%2 != 0){
                int j = 1;

                do{
                    System.out.print(letra);
                    j++;
                }while(j <= i);

                letra = (char) (letra +1);
            }else{
                System.out.printf(" ");
            }

            i++;
        }while(i <= 2*getRepeticion());

        System.out.println("");
    }
    
}