package SerieNumerica.ejercicio;

<<<<<<< HEAD
import SerieNumerica.Variables1;

public class SerieAlternante extends Variables1 {
=======
import Recursividad.Variables;

public class SerieAlternante extends Variables {
>>>>>>> mathias-rama2
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
