package Arrays.ejerciciosandy;

import Arrays.Variablesandy;

//Codigo utilizando for
public class CargaNombre {
    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatos();

                System.out.printf("-FOR");

        for (int i = 0; i < datos.palabras.length; i++) {
            int longitudBarra = (int) Math.round((datos.porcentaje[i] / 100.0) * 12);
            int longitudNombre = (int) Math.round((datos.porcentaje[i] / 100.0) * datos.palabras[i].length());

            if (longitudBarra < 1 && datos.porcentaje[i] > 0) longitudBarra = 1;
            if (longitudNombre < 1 && datos.porcentaje[i] > 0) longitudNombre = 1;

            String barra = "=".repeat(longitudBarra);
            String parte = datos.palabras[i].substring(0, longitudNombre);

            System.out.printf("$$%-12s>$$ %3d%% %s%n", barra, datos.porcentaje[i], parte);
        }
            System.out.printf("\n");


//Codigo utilizando while

        int i = 0;
                System.out.printf("-WHILE");

        while (i < datos.palabras.length) {
            int longitudBarra = (int) Math.round((datos.porcentaje[i] / 100.0) * 12);
            int longitudNombre = (int) Math.round((datos.porcentaje[i] / 100.0) * datos.palabras[i].length());

            if (longitudBarra < 1 && datos.porcentaje[i] > 0) longitudBarra = 1;
            if (longitudNombre < 1 && datos.porcentaje[i] > 0) longitudNombre = 1;

            String barra = "=".repeat(longitudBarra);
            String parte = datos.palabras[i].substring(0, longitudNombre);

            System.out.printf("$$%-12s>$$ %3d%% %s%n", barra, datos.porcentaje[i], parte);

            i++;
        }
            System.out.printf("\n");

        //Codigo utilizando do...while
        i=0;
        System.out.printf("-DO WHILE");
        do {
            int longitudBarra = (int) Math.round((datos.porcentaje[i] / 100.0) * 12);
            int longitudNombre = (int) Math.round((datos.porcentaje[i] / 100.0) * datos.palabras[i].length());

            if (longitudBarra < 1 && datos.porcentaje[i] > 0) longitudBarra = 1;
            if (longitudNombre < 1 && datos.porcentaje[i] > 0) longitudNombre = 1;

            String barra = "=".repeat(longitudBarra);
            String parte = datos.palabras[i].substring(0, longitudNombre);

            System.out.printf("$$%-12s>$$ %3d%% %s%n", barra, datos.porcentaje[i], parte);

            i++;
        } while (i < datos.palabras.length);
    }
}
