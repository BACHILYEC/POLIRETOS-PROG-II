<<<<<<< HEAD
package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SerieAlternante extends Variables {
    public void reset(){
        setCiclo(0);
        setAux(1);
    }
    public SerieAlternante(int numero) {
        super(numero);
        reset();
    }

    public int Alternante() {
        for (int j = 1; j < getNumero(); j++) {
            if (j % 2 == 0) {
                System.out.print(getCiclo()+" ");
            } else {
                System.out.print(getAux()+" ");
                setAux(getAux()+2);
            }
        }
        return getAux();
    }

    
    public int AlternanteWhile() {
        int j = 1;
        while (j < getNumero()) {
            if (j % 2 == 0) {
                System.out.print(getCiclo()+" ");
            } else {
                System.out.print(getAux()+" ");
                setAux(getAux()+2);
            }
            j++;
        }
        return getAux();
    }

    public int AlternanteDoWhile() {
        int j = 1;
        do {
            if (j % 2 == 0) {
                System.out.print(getCiclo()+ " ");
            } else {
                System.out.print(getAux()+ " ");
                setAux(getAux()+2);
            }
            j++;
        } while (j < getNumero());
        return getAux();
    }

    public void imprimirAlternante() {
        reset();
        System.out.println("Serie Alternante (For):");
        Alternante();
    }
    public void imprimirAlternanteWhile() {
        reset();
        System.out.println("Serie Alternante (While):");
        AlternanteWhile();
    }

    public void imprimirAlternanteDoWhile() {
        reset();
        System.out.println("Serie Alternante (Do-While):");
        AlternanteDoWhile();
    }
}
=======
package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SerieAlternante extends Variables {
    public void reset(){
        setCiclo(0);
        setAux(1);
    }
    public SerieAlternante(int numero) {
        super(numero);
        reset();
    }

    public int g2_Alternante() {
        for (int j = 1; j < getNumero(); j++) {
            if (j % 2 == 0) {
                System.out.print(getCiclo()+" ");
            } else {
                System.out.print(getAux()+" ");
                setAux(getAux()+2);
            }
        }
        return getAux();
    }

    
    public int g2_AlternanteWhile() {
        int j = 1;
        while (j < getNumero()) {
            if (j % 2 == 0) {
                System.out.print(getCiclo()+" ");
            } else {
                System.out.print(getAux()+" ");
                setAux(getAux()+2);
            }
            j++;
        }
        return getAux();
    }

    public int g2_AlternanteDoWhile() {
        int j = 1;
        do {
            if (j % 2 == 0) {
                System.out.print(getCiclo()+ " ");
            } else {
                System.out.print(getAux()+ " ");
                setAux(getAux()+2);
            }
            j++;
        } while (j < getNumero());
        return getAux();
    }

    public void g2_imprimirAlternante() {
        reset();
        System.out.println("Serie Alternante (For):");
        g2_Alternante();
    }
    public void g2_imprimirAlternanteWhile() {
        reset();
        System.out.println("Serie Alternante (While):");
        g2_AlternanteWhile();
    }

    public void g2_imprimirAlternanteDoWhile() {
        reset();
        System.out.println("Serie Alternante (Do-While):");
        g2_AlternanteDoWhile();
    }
}
>>>>>>> main
