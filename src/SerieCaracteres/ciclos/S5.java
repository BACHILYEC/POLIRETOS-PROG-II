package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S5 extends IHVariable{

    public S5(int repeticion) {
        super(repeticion);
    }

    public void g2_serieSlashFor(){
        System.out.println("Con FOR:");
        
        for(int i=1; i<=getRepeticion(); i++)
        {
            for(int j=1; j<=3; j++)
            {
                int posicion = (j-1) % 3;
                if (posicion == 0)
                    System.out.print("\\  ");
                else if (posicion == 1)
                    System.out.print("|  ");
                else 
                    System.out.print("/  ");
            }
            System.out.print(" - |  ");
        }

        System.out.println("");
    }

    public void g2_serieSlashWhile(){
        System.out.println("Con WHILE:");

        int i = 1;
        while(i <= getRepeticion())
        {
            int j = 1;
            while(j <= 3)
            {
                int posicion = (j-1) % 3;
                if (posicion == 0)
                    System.out.print("\\  ");
                else if (posicion == 1)
                    System.out.print("|  ");
                else 
                    System.out.print("/  ");

                j++;
            }
            System.out.print(" - |  ");
            i++;
        }

        System.out.println("");
    }

    public void g2_serieSlashDoWhile(){
        System.out.println("Con DO WHILE:");

        int i = 1;
        do
        {
            int j = 1;
            do
            {
                int posicion = (j-1) % 3;
                if (posicion == 0)
                    System.out.print("\\  ");
                else if (posicion == 1)
                    System.out.print("|  ");
                else 
                    System.out.print("/  ");

                j++;
            } while(j <= 3);
            System.out.print(" - |  ");
            i++;
        } while(i <= getRepeticion());

        System.out.println("");
    }

}
