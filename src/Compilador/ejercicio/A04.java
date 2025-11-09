package Compilador.ejercicio;

import SerieCaracteres.ciclos.Tool;

public class A04 {

    static final int IH_ER  = -1;

    enum IhState {
        Q0, Q1, Q2, Q3, Q4, QE
    }

    static final int[][] ihMt = {
        // 1    /   0   EOL
        { 1,   5,   5,  5 },  // Q0
        { 1,   2,   5,  5 },  // Q1
        { 5,   5,   3,  5 },  // Q2
        { 4,   5,   3,  3 },  // Q3 (EOL se queda en Q3)
        { 4,   5,   3,  4 },  // Q4 (EOL se queda en Q4)
        { 5,   5,   5,  5 },  // QE
    };

    private int ihBuscarColumna(char c) {
        if (c == '\0') return 3;
        switch (c) {
            case '1': return 0;
            case '/': return 1;
            case '0': return 2;
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
        // Acepta si termina en Q3 o Q4
        return (ihEstado == IhState.Q3 || ihEstado == IhState.Q4);
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