package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S10 extends IHVariable{

    public S10(int repeticion) {
        super(repeticion);
    }

    public void mostrarSucesiondeLetraFibonacciDosFor(){
        System.out.println("Con FOR:");
        int a = 0, b = 1, c = 0;
        System.out.print("a  ");
        for (int i = 1; i < getRepeticion(); i++)
        {
            c = a + b;
            a= b;
            b = c;

            for (int j = 1; j <= a; j++)
            {
                char letra = (char) ('a' + i % 26);
                System.out.print(letra);
            }
            System.out.print("  ");
        }
        System.out.println("");

    }

    public void mostrarSucesiondeLetraFibonacciDosWhile(){
        System.out.println("Con WHILE:");
        int a = 0, b = 1, c = 0;
        System.out.print("a  ");
        int i = 1;
        while (i < getRepeticion())
        {
            c = a + b;
            a= b;
            b = c;

            int j = 1;
            while (j <= a)
            {
                char letra = (char) ('a' + i % 26);
                System.out.print(letra);
                j++;
            }
            System.out.print("  ");
            i++;
        }
        System.out.println("");
    }

    public void mostrarSucesiondeLetraFibonacciDosDoWhile(){
        System.out.println("Con DO WHILE:");
        int a = 0, b = 1, c = 0;
        System.out.print("a  ");
        int i = 1;
        do
        {
            c = a + b;
            a= b;
            b = c;

            int j = 1;
            do
            {
                char letra = (char) ('a' + i % 26);
                System.out.print(letra);
                j++;
            } while (j <= a);
            System.out.print("  ");
            i++;
        } while (i < getRepeticion()); // Le pongo solo menor que, porque ya imprimí la primera letra 'a' antes del bucle.

        System.out.println("");
    }

}
