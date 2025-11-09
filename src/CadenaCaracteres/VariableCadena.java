package CadenaCaracteres;

public abstract class VariableCadena {
    private int aux;
    private String texto;
    private int contador;

    public VariableCadena() {
        this.aux = 0;
        this.texto = "";
        this.contador = 0;
    }

    public int getAux() { return aux; }
    public void setAux(int aux) { this.aux = aux; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public int getContador() { return contador; }
    public void setContador(int contador) { this.contador = contador; }
}

