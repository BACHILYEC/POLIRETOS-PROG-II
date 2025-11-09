<<<<<<< HEAD
package SerieCaracteres;

public abstract class IHVariable {

    private int repeticion;
    private int numero1;
    private int numero2;
    private int numero3;
    private int aux;
    private int aux2;

    public IHVariable() {}

    public IHVariable(int repeticion) {
        setRepeticion(repeticion);
    }

    public void resetNumero(){
        setNumero1(0);
        setNumero2(1);
        setNumero3(0);
    }

    public IHVariable(int repeticion, int numero1, int numero2, int numero3) {
        setRepeticion(repeticion);
        setNumero1(numero1);
        setNumero2(numero2);
        setNumero3(numero3);
    }


    public int getRepeticion() { return repeticion; }
    public void setRepeticion(int repeticion) { this.repeticion = repeticion; }

    public int getNumero1() { return numero1; }
    public void setNumero1(int numero1) { this.numero1 = numero1; }

    public int getNumero2() { return numero2; }
    public void setNumero2(int numero2) { this.numero2 = numero2; }

    public int getNumero3() { return numero3; }
    public void setNumero3(int numero3) { this.numero3 = numero3; }

    public int getAux() { return aux; }
    public void setAux(int aux) { this.aux = aux; }

    public int getAux2() { return aux2; }
    public void setAux2(int aux2) { this.aux2 = aux2; }
=======
package SerieCaracteres;

public abstract class IHVariable {

    private int repeticion;
    private int numero1;
    private int numero2;
    private int numero3;
    private int aux;
    private int aux2;

    public IHVariable() {}

    public IHVariable(int repeticion) {
        setRepeticion(repeticion);
    }

    public void resetNumero(){
        setNumero1(0);
        setNumero2(1);
        setNumero3(0);
    }

    public IHVariable(int repeticion, int numero1, int numero2, int numero3) {
        setRepeticion(repeticion);
        setNumero1(numero1);
        setNumero2(numero2);
        setNumero3(numero3);
    }


    public int getRepeticion() { return repeticion; }
    public void setRepeticion(int repeticion) { this.repeticion = repeticion; }

    public int getNumero1() { return numero1; }
    public void setNumero1(int numero1) { this.numero1 = numero1; }

    public int getNumero2() { return numero2; }
    public void setNumero2(int numero2) { this.numero2 = numero2; }

    public int getNumero3() { return numero3; }
    public void setNumero3(int numero3) { this.numero3 = numero3; }

    public int getAux() { return aux; }
    public void setAux(int aux) { this.aux = aux; }

    public int getAux2() { return aux2; }
    public void setAux2(int aux2) { this.aux2 = aux2; }
>>>>>>> main
}