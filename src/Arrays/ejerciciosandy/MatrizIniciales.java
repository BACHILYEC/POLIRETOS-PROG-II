package Arrays.ejerciciosandy;

import Arrays.Variablesandy;

public class MatrizIniciales {
    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatos();
        String iniciales = String.join("", datos.obtenerIniciales());

        System.out.println("\nIniciales: " + iniciales + "\n");

        System.out.println("-FOR");
        dibujarConFor(datos, iniciales);

        System.out.println("\n-WHILE");
        dibujarConWhile(datos, iniciales);

        System.out.println("\n-DO WHILE");
        dibujarConDoWhile(datos, iniciales);
    }

    // ======================================
    // MÉTODO CON FOR
    // ======================================
    public static void dibujarConFor(Variablesandy d, String iniciales) {
        for (int i = 0; i < d.tamaño; i++) {
            for (int k = 0; k < iniciales.length(); k++) {
                char letra = iniciales.charAt(k);
                for (int j = 0; j < d.tamaño; j++) {
                    if (dibujarLetra(letra, i, j, d.tamaño))
                        System.out.print(d.caracter + " ");
                    else
                        System.out.print("  ");
                }
                System.out.print("   "); // espacio entre letras
            }
            System.out.println();
        }
    }

    // ======================================
    // MÉTODO CON WHILE
    // ======================================
    public static void dibujarConWhile(Variablesandy d, String iniciales) {
        int i = 0;
        while (i < d.tamaño) {
            int k = 0;
            while (k < iniciales.length()) {
                char letra = iniciales.charAt(k);
                int j = 0;
                while (j < d.tamaño) {
                    if (dibujarLetra(letra, i, j, d.tamaño))
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
    }

    // ======================================
    // MÉTODO CON DO WHILE
    // ======================================
    public static void dibujarConDoWhile(Variablesandy d, String iniciales) {
        int i = 0;
        do {
            int k = 0;
            do {
                char letra = iniciales.charAt(k);
                int j = 0;
                do {
                    if (dibujarLetra(letra, i, j, d.tamaño))
                        System.out.print(d.caracter + " ");
                    else
                        System.out.print("  ");
                    j++;
                } while (j < d.tamaño);
                System.out.print("   ");
                k++;
            } while (k < iniciales.length());
            System.out.println();
            i++;
        } while (i < d.tamaño);
    }

    // ======================================
    // FUNCIÓN DE DIBUJO PARA TODAS LAS LETRAS A–Z
    // ======================================
    private static boolean dibujarLetra(char letra, int fila, int col, int n) {
        letra = Character.toUpperCase(letra);
        int mid = n / 2;

        switch (letra) {
            case 'A': return fila == 0 || fila == mid || col == 0 || col == n - 1;
            case 'B': return col == 0 || fila == 0 || fila == mid || fila == n - 1 || (col == n - 1 && (fila < mid || fila > mid));
            case 'C': return fila == 0 || fila == n - 1 || col == 0;
            case 'D': return col == 0 || fila == 0 || fila == n - 1 || col == n - 1;
            case 'E': return fila == 0 || fila == n - 1 || fila == mid || col == 0;
            case 'F': return fila == 0 || fila == mid || col == 0;
            case 'G': return fila == 0 || fila == n - 1 || col == 0 || (col == n - 1 && fila >= mid) || (fila == mid && col >= mid);
            case 'H': return col == 0 || col == n - 1 || fila == mid;
            case 'I': return fila == 0 || fila == n - 1 || col == mid;
            case 'J': return fila == 0 || col == mid || (fila == n - 1 && col <= mid);
            case 'K': return col == 0 || fila + col == mid || fila - col == mid;
            case 'L': return col == 0 || fila == n - 1;
            case 'M': return col == 0 || col == n - 1 || (fila == col && fila <= mid) || (fila + col == n - 1 && fila <= mid);
            case 'N': return col == 0 || col == n - 1 || fila == col;
            case 'O': return fila == 0 || fila == n - 1 || col == 0 || col == n - 1;
            case 'P': return col == 0 || fila == 0 || fila == mid || (col == n - 1 && fila < mid);
            case 'Q': return fila == 0 || fila == n - 1 || col == 0 || col == n - 1 || (fila == col && fila >= mid);
            case 'R': return col == 0 || fila == 0 || fila == mid || (col == n - 1 && fila < mid) || fila - col == mid;
            case 'S': return fila == 0 || fila == mid || fila == n - 1 || (col == 0 && fila < mid) || (col == n - 1 && fila > mid);
            case 'T': return fila == 0 || col == mid;
            case 'U': return col == 0 || col == n - 1 || fila == n - 1;
            case 'V': return (col == fila && fila >= mid) || (col + fila == n - 1 && fila >= mid);
            case 'W': return col == 0 || col == n - 1 || (fila + col == n - 1 && fila >= mid) || (fila == col && fila >= mid);
            case 'X': return fila == col || fila + col == n - 1;
            case 'Y': return (fila == col && fila < mid) || (fila + col == n - 1 && fila < mid) || (col == mid && fila >= mid);
            case 'Z': return fila == 0 || fila == n - 1 || fila + col == n - 1;
            default:  return true;
        }
    }
}

