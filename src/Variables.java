
public abstract class Variables {

    private int numero1;

    private int numero;

    private int numero3;

    private int numero2;

    private int ciclo;

    private int suma;

    private int aux;

    private int aux2;

    private int largo;

    private int ancho;

    private int tiempo;

    private int repeticion;

    private int aux3;

    private String texto;

    private int contador;

    private int nivel;

    
    public Variables() {
        this.aux3 = 0;
        this.texto = "";
        this.contador = 0;
    }
    
    public Variables(short numero) {
        setNumero(numero);
    }
    
    public Variables(int numero, int numero2) {
        setNumero(numero);
        setNumero2(numero2);
    }
    
    public Variables(int repeticion) {
        setRepeticion(repeticion);
    }
    
    public Variables(int numero1, int numero2, int numero3) {
        
        setNumero2(numero2);
        setNumero3(numero3);
    }
    
    public int getAux3() {
        return aux3;
    }
    
    public void setAux3(int aux3) {
        this.aux3 = aux3;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public int getContador() {
        return contador;
    }
    
    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }
    
    public int getRepeticion() {
        return repeticion;
    }

    public int getNumero1() {
        return numero1;
    }
    
    public int getNumero3() {
        return numero3;
    }
    
    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
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
    
    public int getLargo() {
        return largo;
    }
    
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public int getAncho() {
        return ancho;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
