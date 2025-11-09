<<<<<<< HEAD
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S6 extends IHVariable{

    public S6(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarLetraFor(){
        System.out.println("Con FOR:");

        for(char letra='a'; letra < 'a' + getRepeticion(); letra++)
        {
            System.out.print(letra + "  ");

        }
        System.out.println("");
    } 

    public void g2_mostrarLetraWhile(){
        System.out.println("Con WHILE:");

        char letra = 'a';
        while(letra < 'a' + getRepeticion())
        {
            System.out.print(letra + "  ");
            letra++;
        }
        System.out.println("");
    }

    public void g2_mostrarLetraDoWhile(){
       System.out.println("Con DO WHILE:");

        char letra = 'a';
        do
        {
            System.out.print(letra + "  ");
            letra++;

        }while(letra < 'a' + getRepeticion());

        System.out.println("");
    }

=======
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S6 extends IHVariable{

    public S6(int repeticion) {
        super(repeticion);
    }

    public void g2_mostrarLetraFor(){
        System.out.println("Con FOR:");

        for(char letra='a'; letra < 'a' + getRepeticion(); letra++)
        {
            System.out.print(letra + "  ");

        }
        System.out.println("");
    } 

    public void g2_mostrarLetraWhile(){
        System.out.println("Con WHILE:");

        char letra = 'a';
        while(letra < 'a' + getRepeticion())
        {
            System.out.print(letra + "  ");
            letra++;
        }
        System.out.println("");
    }

    public void g2_mostrarLetraDoWhile(){
       System.out.println("Con DO WHILE:");

        char letra = 'a';
        do
        {
            System.out.print(letra + "  ");
            letra++;

        }while(letra < 'a' + getRepeticion());

        System.out.println("");
    }

>>>>>>> main
}