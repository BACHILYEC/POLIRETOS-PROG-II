package Arrays.ejerciciosandy;

import Arrays.Variablesandy;

public class g2_MatrizX {

    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatos();

        formarX_For(datos.nombre, datos.apellido);
        formarX_While(datos.nombre, datos.apellido);
        formarX_DoWhile(datos.nombre, datos.apellido);
    }

    //CODIGO CON FOR
    public static void formarX_For(String nombre, String apellido) {
                System.out.println("\n-FOR");
        int n = Math.max(nombre.length(), apellido.length());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i && i < nombre.length()) {
                    System.out.print(nombre.charAt(i) + " ");
                } else if (j == n - i - 1 && i < apellido.length()) {
                    System.out.print(apellido.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //CODIGO CON WHILE
    public static void formarX_While(String nombre, String apellido) {
                System.out.println("\n-WHILE");
        int n = Math.max(nombre.length(), apellido.length());
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                if (j == i && i < nombre.length()) {
                    System.out.print(nombre.charAt(i) + " ");
                } else if (j == n - i - 1 && i < apellido.length()) {
                    System.out.print(apellido.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //CODIGO CON DO...WHILE
    public static void formarX_DoWhile(String nombre, String apellido) {
                System.out.println("\n-DO...WHILE");
        int n = Math.max(nombre.length(), apellido.length());
        int i = 0;

        do {
            int j = 0;
            do {
                if (j == i && i < nombre.length()) {
                    System.out.print(nombre.charAt(i) + " ");
                } else if (j == n - i - 1 && i < apellido.length()) {
                    System.out.print(apellido.charAt(i) + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < n);
            System.out.println();
            i++;
        } while (i < n);
    }
}
