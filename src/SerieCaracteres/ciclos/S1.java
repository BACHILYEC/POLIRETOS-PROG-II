package SerieCaracteres.ciclos;

import SerieCaracteres.IHVariable;

public class S1 extends IHVariable {
    public S1(int repeticion) {
        super(repeticion);
    }

    public void g2_crearSerieMasMenosFor() {
        System.out.println("Con FOR:");
        for (int i = 1; i <= getRepeticion(); i++) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println("");
    }

    public void g2_crearSerieMasMenosWhile() {
        System.out.println("Con WHILE:");
        int i = 1;
        while (i <= getRepeticion()) {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
            i++;
        }
        System.out.println("");
    }

    public void g2_crearSerieMasMenosDoWhile() {
        System.out.println("Con DO WHILE:");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print("+ ");
            } else {
                System.out.print("- ");
            }
            i++;
        } while (i <= getRepeticion());
        System.out.println("");
    }
}