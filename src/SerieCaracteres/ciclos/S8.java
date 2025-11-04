package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S8 extends IHVariable{

    public S8(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarMultiplodeDosLetraFor(){
        System.out.println("Con FOR:");
        for(int i=1; i<=getRepeticion(); i++)
        {
            int c= i*2;
            char letra = (char) ('a' + (i-1) %26) ;

            for(int j=1; j<=c; j++)
            {
                System.out.print((i == 1) ? 'a': letra);
            }
            System.out.print("  ");

        }
        System.out.println("");
    }

    public void g2_mostrarMultiplodeDosLetraWhile(){
        System.out.println("Con WHILE:");
        int i=1;
        while(i<=getRepeticion())
        {
            int c= i*2;
            char letra = (char) ('a' + (i-1) %26) ;

            int j=1;
            while(j<=c)
            {
                System.out.print((i == 1) ? 'a': letra);
                j++;
            }
            System.out.print("  ");
            i++;
        }
        System.out.println("");
    }

    public void g2_mostrarMultiplodeDosLetraDoWhile(){
        System.out.println("Con DO WHILE:");
        int i=1;
        do
        {
            int c= i*2;
            char letra = (char) ('a' + (i-1) %26) ;

            int j=1;
            do
            {
                System.out.print((i == 1) ? 'a': letra);
                j++;
            }while(j<=c);
            System.out.print("  ");
            i++;
        }while(i<=getRepeticion());

        System.out.println("");
    }
}