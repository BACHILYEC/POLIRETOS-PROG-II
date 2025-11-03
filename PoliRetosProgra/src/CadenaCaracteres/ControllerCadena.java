package CadenaCaracteres;

import CadenaCaracteres.Ejercicios.*;

public class ControllerCadena extends VariableCadena {
    public void ejecutar() {
        System.out.println("Cadena De Caracteres ");

        // Instancias de cada ejercicio, en el orden que desees
        new ContarVocal().ejecutar();
        new ContarLetra().ejecutar();
        new EliminarVocal().ejecutar();
        new EliminarLetra().ejecutar();
        new InvertirVocalMayus().ejecutar();
        new InvertirLetraMayus().ejecutar();
        new MayusSinJ().ejecutar();
        new AlternarMayusMinus().ejecutar();
        new FromarAnagrama().ejecutar();

        System.out.println("Fin de cadena de caracteres");
    }

    public static void main(String[] args) {
        ControllerCadena controller = new ControllerCadena();
        controller.ejecutar();
    }
}



