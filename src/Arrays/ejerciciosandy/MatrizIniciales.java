package Arrays.ejerciciosandy;

import Arrays.Variablesandy;

public class MatrizIniciales {

    // ========================= MÉTODO CON FOR =========================
    public static void dibujarConFor(Variablesandy d, String iniciales) {
        System.out.println("-FOR\n");
        for (int i = 0; i < d.tamanio; i++) {
            for (int k = 0; k < iniciales.length(); k++) {
                char letra = iniciales.charAt(k);
                for (int j = 0; j < d.tamanio; j++) {
                    if (dibujarLetra(letra, i, j, d.tamanio))
                        System.out.print(d.caracter + " ");
                    else
                        System.out.print("  ");
                }
                System.out.print("   "); // espacio entre letras
            }
            System.out.println();
        }
        System.out.println();
    }

    // ========================= MÉTODO CON WHILE =========================
    public static void dibujarConWhile(Variablesandy d, String iniciales) {
        System.out.println("-WHILE\n");
        int i = 0;
        while (i < d.tamanio) {
            int k = 0;
            while (k < iniciales.length()) {
                char letra = iniciales.charAt(k);
                int j = 0;
                while (j < d.tamanio) {
                    if (dibujarLetra(letra, i, j, d.tamanio))
                        System.out.print(d.caracter + " ");
                    else
                        System.out.print("  ");
                    j++;
                }
                System.out.print("   ");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    // ========================= MÉTODO CON DO WHILE =========================
    public static void dibujarConDoWhile(Variablesandy d, String iniciales) {
        System.out.println("-DO WHILE\n");
        int i = 0;
        do {
            int k = 0;
            do {
                char letra = iniciales.charAt(k);
                int j = 0;
                do {
                    if (dibujarLetra(letra, i, j, d.tamanio))
                        System.out.print(d.caracter + " ");
                    else
                        System.out.print("  ");
                    j++;
                } while (j < d.tamanio);
                System.out.print("   ");
                k++;
            } while (k < iniciales.length());
            System.out.println();
            i++;
        } while (i < d.tamanio);
        System.out.println();
    }

    // ========================= FUNCIÓN DE DIBUJO DE LETRAS =========================
    private static boolean dibujarLetra(char letra, int fila, int col, int n) {
        letra = Character.toUpperCase(letra);
        int mid = n / 2;

        return switch (letra) {
            case 'A' -> fila == 0 || fila == mid || col == 0 || col == n - 1;
            case 'B' -> col == 0 || fila == 0 || fila == mid || fila == n - 1 ||
                        (col == n - 1 && (fila < mid || fila > mid));
            case 'C' -> fila == 0 || fila == n - 1 || col == 0;
            case 'D' -> col == 0 || fila == 0 || fila == n - 1 || col == n - 1;
            case 'E' -> fila == 0 || fila == n - 1 || fila == mid || col == 0;
            case 'F' -> fila == 0 || fila == mid || col == 0;
            case 'G' -> fila == 0 || fila == n - 1 || col == 0 ||
                        (col == n - 1 && fila >= mid) || (fila == mid && col >= mid);
            case 'H' -> col == 0 || col == n - 1 || fila == mid;
            case 'I' -> fila == 0 || fila == n - 1 || col == mid;
            case 'J' -> fila == 0 || col == mid || (fila == n - 1 && col <= mid);
            case 'K' -> col == 0 || fila + col == mid || fila - col == mid;
            case 'L' -> col == 0 || fila == n - 1;
            case 'M' -> col == 0 || col == n - 1 ||
                        (fila == col && fila <= mid) || (fila + col == n - 1 && fila <= mid);
            case 'N' -> col == 0 || col == n - 1 || fila == col;
            case 'O' -> fila == 0 || fila == n - 1 || col == 0 || col == n - 1;
            case 'P' -> col == 0 || fila == 0 || fila == mid || (col == n - 1 && fila < mid);
            case 'Q' -> fila == 0 || fila == n - 1 || col == 0 || col == n - 1 ||
                        (fila == col && fila >= mid);
            case 'R' -> col == 0 || fila == 0 || fila == mid ||
                        (col == n - 1 && fila < mid) || fila - col == mid;
            case 'S' -> fila == 0 || fila == mid || fila == n - 1 ||
                        (col == 0 && fila < mid) || (col == n - 1 && fila > mid);
            case 'T' -> fila == 0 || col == mid;
            case 'U' -> col == 0 || col == n - 1 || fila == n - 1;
            case 'V' -> (col == fila && fila >= mid) || (col + fila == n - 1 && fila >= mid);
            case 'W' -> col == 0 || col == n - 1 ||
                        (fila + col == n - 1 && fila >= mid) || (fila == col && fila >= mid);
            case 'X' -> fila == col || fila + col == n - 1;
            case 'Y' -> (fila == col && fila < mid) ||
                        (fila + col == n - 1 && fila < mid) || (col == mid && fila >= mid);
            case 'Z' -> fila == 0 || fila == n - 1 || fila + col == n - 1;
            default -> false;
        };
    }
}


