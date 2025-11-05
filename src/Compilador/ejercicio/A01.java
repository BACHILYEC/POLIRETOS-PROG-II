package Compilador.ejercicio;

public class A01 {
    
static final int IH_ER  = -1;

    enum IhState {
        Q0, Q1, Q2, QE
    }

    static final int[][] ihMt = {
        // a    b    c   EOL
        { 0,   1,   3,   3 },  // Q0
        { 3,   1,   2,   3 },  // Q1
        { 3,   3,   3,   2 },  // Q2
        { 3,   3,   3,   3 },  // QE
    };

    private int ihBuscarColumna(char c) {
        if (c == '\0') return 3;
        switch (c) {
            case 'a': return 0;
            case 'b': return 1;
            case 'c': return 2;
            default:  return IH_ER;
        }
    }

    public boolean validarCadena(String cadena) {
        IhState ihEstado = IhState.Q0;
        int ihCol;
        for (int j = 0; j < cadena.length(); j++) {
            ihCol = ihBuscarColumna(cadena.charAt(j));
            if (ihCol == IH_ER) return false;
            ihEstado = IhState.values()[ihMt[ihEstado.ordinal()][ihCol]];
            if (ihEstado == IhState.QE) return false;
        }
        ihCol = 3; // EOL
        ihEstado = IhState.values()[ihMt[ihEstado.ordinal()][ihCol]];
        return (ihEstado == IhState.Q2);
    }

    public void ejecutarValidacion() {
        String cadena = SerieCaracteres.ciclos.Tool.leerCadena("Ingrese la cadena a validar: ");
        boolean esValida = validarCadena(cadena);
        if (esValida) {
            System.out.println("Cadena valida");
        } else {
            System.out.println("Cadena invalida");
        }
    }
}
