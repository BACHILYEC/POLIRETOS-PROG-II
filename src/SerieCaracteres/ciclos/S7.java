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
        System.out.println("Con WHILE:");
        int i=0;
        while(i<getRepeticion())
        {
            char letra = (char) ('a' + (2*i) %26) ;
            char mas='+';
            char menos='-';

            if (i % 2 == 0)
                System.out.print(letra + " " + mas + " ");
            else
                System.out.print(letra + " " + menos + " ");

            i++;
        }
        System.out.println("");
    }

    public void g2_mostrarLetraSignoDoWhile(){
        System.out.println("Con DO WHILE:");
        int i=0;
        do
        {
            char letra = (char) ('a' + (2*i) %26) ;
            char mas='+';
            char menos='-';

            if (i % 2 == 0)
                System.out.print(letra + " " + mas + " ");
            else
                System.out.print(letra + " " + menos + " ");

            i++;
        }while(i<getRepeticion());

        System.out.println("");
    }

}


