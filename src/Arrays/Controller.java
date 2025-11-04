package Arrays;

import Arrays.ejerciciosandy.*;

public class Controller {

    public static void main(String[] args) {
        Variablesandy datos = new Variablesandy();

        System.out.println("\nA01-Carga Nombre");
        CargaNombre programa = new CargaNombre();
        programa.ejecutar();

        System.out.println("\nA02-Matriz Iniciales");
        datos.pedirDatitos();

        String[] inicialesArray = datos.obtenerIniciales();
        String iniciales = String.join("", inicialesArray);

        MatrizIniciales.dibujarConFor(datos, iniciales);
        MatrizIniciales.dibujarConWhile(datos, iniciales);
        MatrizIniciales.dibujarConDoWhile(datos, iniciales);
    

        System.out.println("\nA03-Coordenadas");
        Coordenadas coordenadas = new Coordenadas();
        coordenadas.ejecutar();

        System.out.println("\nA04-Matriz X");
        MatrizX.formarX_For(datos.nombre, datos.apellido);
        MatrizX.formarX_While(datos.nombre, datos.apellido);
        MatrizX.formarX_DoWhile(datos.nombre, datos.apellido);

        System.out.println("\nA05-Matriz Cuadrada");
        MatrizCuadrado.matrizAleatoria_For(datos.nombreCompleto, datos.tamanio);
        MatrizCuadrado.matrizAleatoria_While(datos.nombreCompleto, datos.tamanio);
        MatrizCuadrado.matrizAleatoria_DoWhile(datos.nombreCompleto, datos.tamanio);
    }
}

