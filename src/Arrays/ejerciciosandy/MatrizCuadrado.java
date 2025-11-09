<<<<<<< HEAD
package Arrays.ejerciciosandy;

import Arrays.Variablesandy;
import java.util.Random;

public class MatrizCuadrado {

    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatos();

        // Llamar a las tres versiones
        matrizAleatoria_For(datos.nombreCompleto, datos.tamanio);
        matrizAleatoria_While(datos.nombreCompleto, datos.tamanio);
        matrizAleatoria_DoWhile(datos.nombreCompleto, datos.tamanio);
    }

    //CÓDIGO CON FOR
    public static void matrizAleatoria_For(String nombreCompleto, int tamanio) {
        System.out.println("\n-FOR\n");
        String texto = nombreCompleto.replaceAll("\\s+", "");
        int n = tamanio;
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // Inicializar la matriz con espacios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Llenar con letras aleatorias del nombre
        for (int i = 0; i < texto.length(); i++) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] != ' ')
                matriz[x][y] = '*';
            else
                matriz[x][y] = texto.charAt(i % texto.length());

            mostrarMatriz(matriz, i + 1);
            esperar();
        }
    }

    //CÓDIGO CON WHILE
    public static void matrizAleatoria_While(String nombreCompleto, int tamanio) {
        System.out.println("\n-WHILE\n");
        String texto = nombreCompleto.replaceAll("\\s+", "");
        int n = tamanio;
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        i = 0;
        while (i < texto.length()) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] != ' ')
                matriz[x][y] = '*';
            else
                matriz[x][y] = texto.charAt(i % texto.length());

            mostrarMatriz(matriz, i + 1);
            esperar();
            i++;
        }
    }

    //CÓDIGO CON DO...WHILE
    public static void matrizAleatoria_DoWhile(String nombreCompleto, int tamanio) {
        System.out.println("\n-DO...WHILE\n");
        String texto = nombreCompleto.replaceAll("\\s+", "");
        int n = tamanio;
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        i = 0;
        do {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] != ' ')
                matriz[x][y] = '*';
            else
                matriz[x][y] = texto.charAt(i % texto.length());

            mostrarMatriz(matriz, i + 1);
            esperar();
            i++;
        } while (i < texto.length());
    }

    //MÉTODOS AUXILIARES
    private static void mostrarMatriz(char[][] matriz, int paso) {
        System.out.println("\nPaso " + paso + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void esperar() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
=======
package Arrays.ejerciciosandy;

import Arrays.Variablesandy;
import java.util.Random;

public class MatrizCuadrado {

    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatos();

        // Llamar a las tres versiones
        matrizAleatoria_For(datos.nombreCompleto, datos.tamanio);
        matrizAleatoria_While(datos.nombreCompleto, datos.tamanio);
        matrizAleatoria_DoWhile(datos.nombreCompleto, datos.tamanio);
    }

    //CÓDIGO CON FOR
    public static void matrizAleatoria_For(String nombreCompleto, int tamanio) {
        System.out.println("\n-FOR\n");
        String texto = nombreCompleto.replaceAll("\\s+", "");
        int n = tamanio;
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        // Inicializar la matriz con espacios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Llenar con letras aleatorias del nombre
        for (int i = 0; i < texto.length(); i++) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] != ' ')
                matriz[x][y] = '*';
            else
                matriz[x][y] = texto.charAt(i % texto.length());

            mostrarMatriz(matriz, i + 1);
            esperar();
        }
    }

    //CÓDIGO CON WHILE
    public static void matrizAleatoria_While(String nombreCompleto, int tamanio) {
        System.out.println("\n-WHILE\n");
        String texto = nombreCompleto.replaceAll("\\s+", "");
        int n = tamanio;
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        i = 0;
        while (i < texto.length()) {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] != ' ')
                matriz[x][y] = '*';
            else
                matriz[x][y] = texto.charAt(i % texto.length());

            mostrarMatriz(matriz, i + 1);
            esperar();
            i++;
        }
    }

    //CÓDIGO CON DO...WHILE
    public static void matrizAleatoria_DoWhile(String nombreCompleto, int tamanio) {
        System.out.println("\n-DO...WHILE\n");
        String texto = nombreCompleto.replaceAll("\\s+", "");
        int n = tamanio;
        char[][] matriz = new char[n][n];
        Random rand = new Random();

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        i = 0;
        do {
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] != ' ')
                matriz[x][y] = '*';
            else
                matriz[x][y] = texto.charAt(i % texto.length());

            mostrarMatriz(matriz, i + 1);
            esperar();
            i++;
        } while (i < texto.length());
    }

    //MÉTODOS AUXILIARES
    private static void mostrarMatriz(char[][] matriz, int paso) {
        System.out.println("\nPaso " + paso + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void esperar() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
>>>>>>> main
