package Arrays;

import Arrays.ejerciciosandy.*;

public class Controller {

    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();

        System.out.println("\nA01-Carga Nombre");
        g2_CargaNombre programa = new g2_CargaNombre();
        programa.ejecutar();

        System.out.println("\nA02-Matriz Iniciales");
        datos.pedirDatitos();

        String[] inicialesArray = datos.obtenerIniciales();
        String iniciales = String.join("", inicialesArray);

        g2_MatrizIniciales.dibujarConFor(datos, iniciales);
        g2_MatrizIniciales.dibujarConWhile(datos, iniciales);
        g2_MatrizIniciales.dibujarConDoWhile(datos, iniciales);
    

        System.out.println("\nA03-Coordenadas");
        g2_Coordenada g2_Coordenada = new g2_Coordenada();
        g2_Coordenada.ejecutar();

        System.out.println("\nA04-Matriz X");
        g2_MatrizX.formarX_For(datos.nombre, datos.apellido);
        g2_MatrizX.formarX_While(datos.nombre, datos.apellido);
        g2_MatrizX.formarX_DoWhile(datos.nombre, datos.apellido);

        System.out.println("\nA05-Matriz Cuadrada");
        g2_MatrizCuadrado.matrizAleatoria_For(datos.nombreCompleto, datos.tamanio);
        g2_MatrizCuadrado.matrizAleatoria_While(datos.nombreCompleto, datos.tamanio);
        g2_MatrizCuadrado.matrizAleatoria_DoWhile(datos.nombreCompleto, datos.tamanio);
    }
}

