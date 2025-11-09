<<<<<<< HEAD
package Recursividad.ejercicios;

import Recursividad.Variables;

public class Factorial extends Variables {
    public Factorial(int numero) {
        super(numero);
        setCiclo(1);
        setSuma(1);
        setAux(0);
    }

    public int factorial() {
        if (getCiclo() <= Math.abs(getNumero())) {
            setAux(getCiclo() * getSuma());
            setCiclo(getCiclo() + 1);
            setSuma(getAux());
            factorial();
        }
        return getAux();
    }

    public void mostrarFactorial() {
        System.out.println("Factorial: " + getSuma());
    }
}
=======
package Recursividad.ejercicios;

import Recursividad.Variables;

public class Factorial extends Variables {
    public Factorial(int numero) {
        super(numero);
        setCiclo(1);
        setSuma(1);
        setAux(0);
    }

    public int g2_factorial() {
        if (getCiclo() <= Math.abs(getNumero())) {
            setAux(getCiclo() * getSuma());
            setCiclo(getCiclo() + 1);
            setSuma(getAux());
            g2_factorial();
        }
        return getAux();
    }

    public void g2_mostrarFactorial() {
        System.out.println("Factorial: " + getSuma());
    }
}
>>>>>>> main
