<<<<<<< HEAD
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S1 extends IHVariable {
    public S1(int repeticion) {
        super(repeticion);
    }

    public void g2_crearSerieMasMenosFor() {
        System.out.println("Con For: ");

        for(int i= 1; i <=getRepeticion(); i++){

            if(i%2 ==0)
                System.out.printf("- ");
            else
                System.out.printf("+ ");
        }

        System.out.println("");
    }

    public void g2_crearSerieMasMenosWhile() {
        System.out.println("Con While: ");

        int i =1;

        while(i <=getRepeticion()){
            if(i%2 ==0)
                System.out.printf("- ");
            else
                System.out.printf("+ ");
            
            i++;
        }
        System.out.println("");
    }

    public void g2_crearSerieMasMenosDoWhile() {
        System.out.println("Con Do While: ");

        int i = 1;
        do{
            if(i%2 ==0)
                System.out.printf("- ");
            else
                System.out.printf("+ ");
            
            i++;

        }while(i<=getRepeticion());
        System.out.println("");
    }
=======
package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S1 extends IHVariable {
    public S1(int repeticion) {
        super(repeticion);
    }

    public void g2_crearSerieMasMenosFor() {
        System.out.println("Con For: ");

        for(int i= 1; i <=getRepeticion(); i++){

            if(i%2 ==0)
                System.out.printf("- ");
            else
                System.out.printf("+ ");
        }

        System.out.println("");
    }

    public void g2_crearSerieMasMenosWhile() {
        System.out.println("Con While: ");

        int i =1;

        while(i <=getRepeticion()){
            if(i%2 ==0)
                System.out.printf("- ");
            else
                System.out.printf("+ ");
            
            i++;
        }
        System.out.println("");
    }

    public void g2_crearSerieMasMenosDoWhile() {
        System.out.println("Con Do While: ");

        int i = 1;
        do{
            if(i%2 ==0)
                System.out.printf("- ");
            else
                System.out.printf("+ ");
            
            i++;

        }while(i<=getRepeticion());
        System.out.println("");
    }
>>>>>>> main
}