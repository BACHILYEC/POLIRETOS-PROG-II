package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S5 extends IHVariable{

    public S5(int repeticion) {
        super(repeticion);
    }

    public void g2_serieSlashFor(){
        System.out.println("Con For: ");

        for(int i = 1; i <= getRepeticion(); i++){
            if(i % 2 != 0){
                for(int j = 1; j<=3; j++){
                    if(j % 3 == 1)
                        System.out.printf("\\ ");
                    if(j % 3 == 2)
                        System.out.printf("| ");
                    if(j % 3 == 0)
                        System.out.printf("/  ");
                    
                }
            } else{
                for(int k = 1; k<=2; k++){
                    if(k % 2 == 0)
                        System.out.printf("- |  ");
                }
            }
        }

        System.out.println("");
    }

    public void g2_serieSlashWhile(){
        System.out.println("Con While: ");
        int i = 1;

        while(i <= getRepeticion()){
            if(i % 2 != 0){
                int j = 1;

                while(j <= 3){
                    if(j % 3 == 1)
                        System.out.printf("\\ ");
                    if(j % 3 == 2)
                        System.out.printf("| ");
                    if(j % 3 == 0)
                        System.out.printf("/  ");
                    
                    j++;
                }
            } else{
                int k = 1;

                while(k <= 2){
                    if(k % 2 == 0)
                        System.out.printf("- |  ");
                    
                    k++;
                }
            }

            i++;
        }

        System.out.println("");
    }

    public void g2_serieSlashDoWhile(){
        System.out.println("Con Do While: ");
        int i = 1;

        do{
            if(i % 2 != 0){
                int j = 1;

                do{
                    if(j % 3 == 1)
                        System.out.printf("\\ ");
                    if(j % 3 == 2)
                        System.out.printf("| ");
                    if(j % 3 == 0)
                        System.out.printf("/  ");
                    
                    j++;
                }while(j <= 3);
            } else{
                int k = 1;

                do{
                    if(k % 2 == 0)
                        System.out.printf("- |  ");
                    
                    k++;
                }while(k <= 2);
            }

            i++;
        }while(i <= getRepeticion());

        System.out.println("");
    }

}
