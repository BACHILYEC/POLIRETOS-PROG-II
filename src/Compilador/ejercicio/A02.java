package Compilador.ejercicio;

public class A02 {
    static final int IH_ER  = -1;

    enum IhState {
        Q0, Q1, Q2, Q3, QF, QE
    }

    static final int[][] ihMt = {
        // a    b    c   EOL
        { 1,   5,   5,   5 },  // Q0: espera 'a'
        { 5,   1,   2,   5 },  // Q1: después de 'a', espera uno o más 'b'
        { 3,   5,   5,   5 },  // Q2: después de al menos un 'b', espera 'c'
        { 5,   5,   5,   4 },  // Q3: después de 'c', espera 'a' final y EOL
        { 5,   5,   5,   4 },  // QF: aceptación
        { 5,   5,   5,   5 },  // QE: error
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
        return (ihEstado == IhState.QF);
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
