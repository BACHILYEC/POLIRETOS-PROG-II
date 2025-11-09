package Arrays.ejerciciosandy;

import Arrays.Variablesandy;

public class Coordenadas {

    public void ejecutar() {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatosGrafica();

        System.out.println("-FOR\n");
        graficarFor(datos.nombre, datos.puntos);

        System.out.println("-WHILE\n");
        graficarWhile(datos.nombre, datos.puntos);

        System.out.println("-DO...WHILE\n");
        graficarDoWhile(datos.nombre, datos.puntos);
    }

    //CÓDIGO CON FOR
    public static void graficarFor(String nombre, int puntos) {
        int maxY = 2 * puntos;

        for (int y = maxY; y > 0; y--) {
            System.out.printf("%2d | ", y);
            for (int x = 1; x <= puntos; x++) {
                if (2 * x == y) {
                    System.out.print(nombre.charAt(x - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.print("  0 +");
        for (int i = 0; i < puntos * 2; i++) {
            System.out.print("-");
        }
        System.out.println("→ x");
    }

    //CÓDIGO CON WHILE
    public static void graficarWhile(String nombre, int puntos) {
        int maxY = 2 * puntos;
        int y = maxY;

        while (y > 0) {
            System.out.printf("%2d | ", y);
            int x = 1;
            while (x <= puntos) {
                if (2 * x == y) {
                    System.out.print(nombre.charAt(x - 1) + " ");
                } else {
                    System.out.print("  ");
                }
                x++;
            }
            System.out.println();
            y--;
        }

        System.out.print("  0 +");
        int i = 0;
        while (i < puntos * 2) {
            System.out.print("-");
            i++;
        }
        System.out.println("→ x");
    }

    //CÓDIGO CON DO...WHILE
    public static void graficarDoWhile(String nombre, int puntos) {
        int maxY = 2 * puntos;
        int y = maxY;

        do {
            if (y > 0) {
                System.out.printf("%2d | ", y);
                int x = 1;
                do {
                    if (2 * x == y) {
                        System.out.print(nombre.charAt(x - 1) + " ");
                    } else {
                        System.out.print("  ");
                    }
                    x++;
                } while (x <= puntos);
                System.out.println();
            }
            y--;
        } while (y >= 0);

        System.out.print("  0 +");
        int i = 0;
        do {
            System.out.print("-");
            i++;
        } while (i < puntos * 2);
        System.out.println("→ x");
    }
}
