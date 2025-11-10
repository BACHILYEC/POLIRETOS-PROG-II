package Arrays.ejerciciosandy;

import Arrays.Variablesandy;

public class g2_CargaNombre {

    public void ejecutar() {
        Variablesandy datos = new Variablesandy();
        datos.pedirDatos(); // Pide palabras y porcentajes

        //CODIGO CON FOR
        System.out.println("-FOR\n");
        for (int i = 0; i < datos.palabras.length; i++) {
            imprimirBarra(datos, i);
        }
        System.out.println();

        //CODIGO CON WHILE
        System.out.println("-WHILE\n");
        int i = 0;
        while (i < datos.palabras.length) {
            imprimirBarra(datos, i);
            i++;
        }
        System.out.println();

        //CODIGO CON DO...WHILE
        System.out.println("-DO WHILE\n");
        i = 0;
        do {
            imprimirBarra(datos, i);
            i++;
        } while (i < datos.palabras.length);
        System.out.println();
    }

    // 🔹 Método auxiliar reutilizable
    private void imprimirBarra(Variablesandy datos, int i) {
        int longitudBarra = (int) Math.round((datos.porcentaje[i] / 100.0) * 12);
        int longitudNombre = (int) Math.round((datos.porcentaje[i] / 100.0) * datos.palabras[i].length());

        if (longitudBarra < 1 && datos.porcentaje[i] > 0) longitudBarra = 1;
        if (longitudNombre < 1 && datos.porcentaje[i] > 0) longitudNombre = 1;

        String barra = "=".repeat(longitudBarra);
        String parte = datos.palabras[i].substring(0, longitudNombre);

        System.out.printf("$$%-12s>$$ %3d%% %s%n", barra, datos.porcentaje[i], parte);
    }
}

