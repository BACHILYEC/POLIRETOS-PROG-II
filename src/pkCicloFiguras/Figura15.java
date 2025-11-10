package pkCicloFiguras;

import Recursividad.Variables;

public class Figura15 extends Variables{

    public Figura15(int num) {
        super();
        setNumero(num);
    }

    public void g2_crearFigura15() {
        System.out.println("Figura 15");
        int[][] v = new int[getNumero()+1][getNumero()+1];
        for (int i = 1; i<=getNumero(); i++) {
            for (int j = 1; j<=i; j++) {
                    if(i==j){
                        v[i][j]=1;
                    }
                    if(j==1 && i!=j){
                        v[i][j]=1;
                    }
                    if(j!=1 && i!=j){
                        v[i][j] = v[i-1][j-1] + v[i-1][j];
                    }
                    System.out.print(v[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
