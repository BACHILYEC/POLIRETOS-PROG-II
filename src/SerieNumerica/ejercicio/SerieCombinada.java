<<<<<<< HEAD
package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SerieCombinada extends Variables {
    public void reset(){
        setCiclo(0);
        setAux(1);
        setSuma(1);
        setAux2(0);
    }
    public SerieCombinada(int numero) {
        super(numero);
        reset();
    }

    public String Combinada() {
        String resultado = "";
        for (int j = 0; j < getNumero(); j++) {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux()+" ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux()+" ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux()+" ";
                setCiclo(getSuma());
                setSuma(getAux2());

            }
            setAux(getAux() + 2);
        }
        return resultado;
    }

    public String CombinadaWhile() {
        String resultado = "";
        int j = 0;
        reset(); // Reiniciamos los valores
        while (j < getNumero()) {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux()+" ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux()+" ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux()+" ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
            j++;
        }
        return resultado;
    }

    public String CombinadaDoWhile() {
        String resultado = "";
        int j = 0;
        reset(); // Reiniciamos los valores
        do {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux()+" ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux()+" ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux()+" ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
            j++;
        } while (j < getNumero());
        return resultado;
    }

    public void imprimirCombinada() {
        reset();
        System.out.println("Serie Combinada (For):\n"+Combinada());
    }

    public void imprimirCombinadaWhile() {
        reset();
        System.out.println("Serie Combinada (While):\n"+CombinadaWhile());
    }

    public void imprimirCombinadaDoWhile() {
        reset();
        System.out.println("Serie Combinada (Do-While):\n"+CombinadaDoWhile());
    }
=======
package SerieNumerica.ejercicio;

import Recursividad.Variables;

public class SerieCombinada extends Variables {
    public void reset(){
        setCiclo(0);
        setAux(1);
        setSuma(1);
        setAux2(0);
    }
    public SerieCombinada(int numero) {
        super(numero);
        reset();
    }

    public String g2_Combinada() {
        String resultado = "";
        for (int j = 0; j < getNumero(); j++) {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux()+" ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux()+" ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux()+" ";
                setCiclo(getSuma());
                setSuma(getAux2());

            }
            setAux(getAux() + 2);
        }
        return resultado;
    }

    public String g2_CombinadaWhile() {
        String resultado = "";
        int j = 0;
        reset(); 
        while (j < getNumero()) {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux()+" ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux()+" ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux()+" ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
            j++;
        }
        return resultado;
    }

    public String g2_CombinadaDoWhile() {
        String resultado = "";
        int j = 0;
        reset(); 
        do {
            if (j == 0) {
                resultado += getCiclo() + "/" + getAux()+" ";
            } else if (j == 1) {
                resultado += getSuma() + "/" + getAux()+" ";
            } else {
                setAux2(getSuma() + getCiclo());
                resultado += getAux2() + "/" + getAux()+" ";
                setCiclo(getSuma());
                setSuma(getAux2());
            }
            setAux(getAux() + 2);
            j++;
        } while (j < getNumero());
        return resultado;
    }

    public void g2_imprimirCombinada() {
        reset();
        System.out.println("Serie Combinada (For):\n"+g2_Combinada());
    }

    public void g2_imprimirCombinadaWhile() {
        reset();
        System.out.println("Serie Combinada (While):\n"+g2_CombinadaWhile());
    }

    public void g2_imprimirCombinadaDoWhile() {
        reset();
        System.out.println("Serie Combinada (Do-While):\n"+g2_CombinadaDoWhile());
    }
>>>>>>> main
}