package SerieNumerica;

public abstract class Variables {

private  int numero;

private int numero2;

private int ciclo;

private int suma;

private int aux;

private int aux2;
public Variables() {

}

public Variables(int numero) {
    setNumero(numero);
}
public Variables(int numero, int numero2) {
    setNumero(numero);
    setNumero2(numero2);
}
public int getNumero2() {
    return numero2;
}
public void setNumero2(int numero2) {
    this.numero2 = numero2;
}

public int getAux2() {
    return aux2;
}
public void setAux2(int aux2) {
    this.aux2 = aux2;
}
public int getAux() {
    return aux;
}
public void setAux(int aux) {
    this.aux = aux;
}
public int getSuma() {
    return suma;
}
public void setSuma(int suma) {
    this.suma = suma;
}
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}

public int getCiclo() {
    return ciclo;
}
public void setCiclo(int ciclo) {
    this.ciclo = ciclo;
}
}
