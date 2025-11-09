package Compilador.ejercicio;

import SerieCaracteres.ciclos.Tool;

public class A03 {
    static final int IH_ER  = -1;
    static final int IH_OK  = 1;
    static final int IH_INC = 0;

    enum IhState {
        Q0, Q1, Q2, Q3, Q4, Q5, QE
    }

    static final int[][] ihMt = {
        // a    /     b     c    EOL
        { 1,   6,   6,   6,  6 },  // Q0
        { 1,   2,   6,   6,  6 },  // Q1
        { 6,   6,   3,   6,  6 },  // Q2
        { 6,   4,   3,   6,  6 },  // Q3
        { 6,   6,   6,   5,  6 },  // Q4
        { 6,   6,   6,   5,  5 },  // Q5
        { 6,   6,   6,   6,  6 },  // QE
    };

    private int ihBuscarColumna(char c) {
        if (c == '\0') return 4;
        switch (c) {
            case 'a': return 0;
            case '/': return 1;
            case 'b': return 2;
            case 'c': return 3;
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
        ihCol = 4; // EOL
        ihEstado = IhState.values()[ihMt[ihEstado.ordinal()][ihCol]];
        return (ihEstado == IhState.Q5);
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
