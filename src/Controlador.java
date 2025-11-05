
import java.util.Scanner;

import Arrays.Variablesandy;
import Arrays.ejerciciosandy.CargaNombre;
import Arrays.ejerciciosandy.Coordenadas;
import Arrays.ejerciciosandy.MatrizCuadrado;
import Arrays.ejerciciosandy.MatrizIniciales;
import Arrays.ejerciciosandy.MatrizX;
import CadenaCaracteres.Ejercicios.AlternarMayusMinus;
import CadenaCaracteres.Ejercicios.ContarLetra;
import CadenaCaracteres.Ejercicios.ContarVocal;
import CadenaCaracteres.Ejercicios.EliminarLetra;
import CadenaCaracteres.Ejercicios.EliminarVocal;
import CadenaCaracteres.Ejercicios.FromarAnagrama;
import CadenaCaracteres.Ejercicios.InvertirLetraMayus;
import CadenaCaracteres.Ejercicios.InvertirVocalMayus;
import CadenaCaracteres.Ejercicios.MayusSinJ;
import Compilador.ejercicio.A04;
import Compilador.ejercicio.A01;
import Compilador.ejercicio.A02;
import Compilador.ejercicio.A03;
import Compilador.ejercicio.A05a;
import Compilador.ejercicio.A07;
import Recursividad.ejercicios.ConteoProg;
import Recursividad.ejercicios.ConteoReg;
import Recursividad.ejercicios.Factorial;
import Recursividad.ejercicios.Multiplicacion;
import Recursividad.ejercicios.Potencia;
import Recursividad.ejercicios.Suma;
import SerieCaracteres.ciclos.S1;
import SerieCaracteres.ciclos.S10;
import SerieCaracteres.ciclos.S2;
import SerieCaracteres.ciclos.S3;
import SerieCaracteres.ciclos.S4;
import SerieCaracteres.ciclos.S5;
import SerieCaracteres.ciclos.S6;
import SerieCaracteres.ciclos.S7;
import SerieCaracteres.ciclos.S8;
import SerieCaracteres.ciclos.S9;
import SerieCaracteres.ciclos.Tool;
import SerieNumerica.ejercicio.Potencia2;
import SerieNumerica.ejercicio.Potencia3;
import SerieNumerica.ejercicio.Serie3;
import SerieNumerica.ejercicio.Serie5;
import SerieNumerica.ejercicio.SerieAlternante;
import SerieNumerica.ejercicio.SerieCombinada;
import SerieNumerica.ejercicio.SerieCombinada2;
import SerieNumerica.ejercicio.SerieCuadrados;
import SerieNumerica.ejercicio.SerieFibonacci;
import SerieNumerica.ejercicio.SeriePrimos;
import SerieNumerica.ejercicio.SeriePronic;
import pkCargaSimulador.Carga;
import pkCicloFiguras.Figura;

public class Controlador extends Variables {

    public Controlador() {
        super();
    }

    public Controlador(short numero) {
        super(numero);
    }

    public Controlador(int repeticion) {
        super(repeticion);
    }

    public Controlador(int numero, int ciclo) {
        super(numero, ciclo);
    }

    Scanner sc = new Scanner(System.in);

    public void mostrarPortada() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";

        System.out.println(ANSI_RED + "===========================================");
        System.out.println("         Escuela Politecnica Nacional      ");
        System.out.println("===========================================" + ANSI_RESET);

        System.out.println(ANSI_BLUE + "              Programacion II              " + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLUE + "Adrian Muñoz");
        System.out.println("Mathias Bucheli");
        System.out.println("Angela Cevallos");
        System.out.println("Heidy Cruz");
        System.out.println("Ismael Heredia" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_RED + "               PoliRetos                   ");
        System.out.println("===========================================" + ANSI_RESET);
    }

    public void Ejercicio() throws InterruptedException {
        System.out.println("Inicio de Poliretos");
        System.out.println("Series Numericas");
        System.out.println("Ingrese un numero:");
        int numero1 = sc.nextInt();
        SerieFibonacci serieFibonacci = new SerieFibonacci(numero1);
        serieFibonacci.imprimirFibonacci();
        serieFibonacci.imprimirFibonacciWhile();
        serieFibonacci.imprimirFibonacciDoWhile();
        System.out.println();
        SerieAlternante serieAlternante = new SerieAlternante(numero1);
        serieAlternante.imprimirAlternante();
        System.out.println();
        serieAlternante.imprimirAlternanteWhile();
        System.out.println();
        serieAlternante.imprimirAlternanteDoWhile();
        System.out.println();
        SerieCombinada serieCombinada = new SerieCombinada(numero1);
        System.out.println();
        serieCombinada.imprimirCombinada();
        serieCombinada.imprimirCombinadaWhile();
        serieCombinada.imprimirCombinadaDoWhile();
        SerieCombinada2 serieCombinada2 = new SerieCombinada2(numero1);
        System.out.println();
        serieCombinada2.imprimirCombinada();
        serieCombinada2.imprimirCombinadaWhile();
        serieCombinada2.imprimirCombinadaDoWhile();
        SeriePrimos seriePrimos = new SeriePrimos(numero1);
        System.out.println();
        seriePrimos.imprimirPrimos();
        seriePrimos.imprimirPrimosWhile();
        seriePrimos.imprimirPrimosDoWhile();
        SerieCuadrados serieCuadrados = new SerieCuadrados(numero1);
        System.out.println();
        serieCuadrados.imprimirCuadrados();
        serieCuadrados.imprimirCuadradosWhile();
        serieCuadrados.imprimirCuadradosDoWhile();
        Serie3 serie3 = new Serie3(numero1);
        System.out.println();
        serie3.imprimirMas3();
        serie3.imprimirMas3While();
        serie3.imprimirMas3DoWhile();
        Serie5 serie5 = new Serie5(numero1);
        System.out.println();
        serie5.imprimirMas5();
        serie5.imprimirMas5While();
        serie5.imprimirMas5DoWhile();
        Potencia2 potenciaUno = new Potencia2(numero1);
        System.out.println();
        potenciaUno.imprimirPotencia();
        potenciaUno.imprimirPotenciaWhile();
        potenciaUno.imprimirPotenciaDoWhile();
        Potencia3 potencia3 = new Potencia3(numero1);
        System.out.println();
        potencia3.imprimirPotencia();
        potencia3.imprimirPotenciaWhile();
        potencia3.imprimirPotenciaDoWhile();
        System.out.println();
        SeriePronic seriePronic = new SeriePronic(numero1);
        System.out.println();
        seriePronic.imprimirPronic();
        seriePronic.imprimirPronicWhile();
        seriePronic.imprimirPronicDoWhile();

        System.out.println("Serie de Caracteres:");
        setRepeticion(Tool.leerEnteroPositivo("Ingrese un número entero positivo: "));

        S1 ejercicio1 = new S1(getRepeticion());
        ejercicio1.g2_crearSerieMasMenosFor();
        ejercicio1.g2_crearSerieMasMenosWhile();
        ejercicio1.g2_crearSerieMasMenosDoWhile();

        System.out.println("Serie Fibonacci con signo + :");
        S2 ejercicio2 = new S2(getRepeticion());
        ejercicio2.g2_crearSerieFibonacciMasFor();
        ejercicio2.g2_crearSerieFibonacciMasWhile();
        ejercicio2.g2_crearSerieFibonacciMasDoWhile();

        System.out.println("Serie de números primos con signo +: ");
        S3 ejercicio3 = new S3(getRepeticion());
        ejercicio3.g2_crearSeriePrimoFor();
        ejercicio3.g2_crearSeriePrimoWhile();
        ejercicio3.g2_crearSeriePrimoDoWhile();

        System.out.println("Sucesion de signos: ");
        S4 ejercicio4 = new S4(getRepeticion());
        ejercicio4.g2_mostrarSucesionSignoFor();
        ejercicio4.g2_mostrarSucesionSignoWhile();
        ejercicio4.g2_mostrarSucesionSignoDoWhile();

        System.out.println("Sucesión de Slash: ");
        S5 ejercicio5 = new S5(getRepeticion());
        ejercicio5.g2_serieSlashFor();
        ejercicio5.g2_serieSlashWhile();
        ejercicio5.g2_serieSlashDoWhile();

        System.out.println("Serie de letras del alfabeto: ");
        S6 ejercicio6 = new S6(getRepeticion());
        ejercicio6.g2_mostrarLetraFor();
        ejercicio6.g2_mostrarLetraWhile();
        ejercicio6.g2_mostrarLetraDoWhile();

        System.out.println("Serie de Letras y Signos: ");
        S7 ejercicio7 = new S7(getRepeticion());
        ejercicio7.g2_mostrarLetraSignoFor();
        ejercicio7.g2_mostrarLetraSignoWhile();
        ejercicio7.g2_mostrarLetraSignoDoWhile();

        System.out.println("Sucesion de Letras con multiplos de dos: ");
        S8 ejercicio8 = new S8(getRepeticion());
        ejercicio8.g2_mostrarMultiplodeDosLetraFor();
        ejercicio8.g2_mostrarMultiplodeDosLetraWhile();
        ejercicio8.g2_mostrarMultiplodeDosLetraDoWhile();

        System.out.println("Sucesion de Letras en grupos Impares: ");
        S9 ejercicio9 = new S9(getRepeticion());
        ejercicio9.mostrarSucesionLetrasImparesFor();
        ejercicio9.mostrarSucesionLetrasImparesWhile();
        ejercicio9.mostrarSucesionLetrasImparesDoWhile();

        System.out.println("Sucesion de Letros con Fibonacci: ");
        S10 ejercicio10 = new S10(getRepeticion());
        ejercicio10.mostrarSucesiondeLetraFibonacciDosFor();
        ejercicio10.mostrarSucesiondeLetraFibonacciDosWhile();
        ejercicio10.mostrarSucesiondeLetraFibonacciDosDoWhile();

        System.out.println("Figuras:");
        System.out.println("");
        System.out.println("--------FIGURAS--------");
        Figura figura = new Figura(numero1, 5);
        System.out.println("Figura 1: ");
        figura.g2_crearFigura1();
        System.out.println("Figura 2: ");
        figura.g2_crearFigura2();
        System.out.println("Figura 3: ");
        figura.g2_crearFigura3();
        System.out.println("Figura 4: ");
        figura.g2_crearFigura4();
        System.out.println("Figura 5: ");
        figura.g2_crearFigura5();
        System.out.println("Figura 6: ");
        figura.g2_crearFigura6();
        System.out.println("Figura 7: ");
        figura.g2_crearFigura7();
        System.out.println("Figura 8: ");
        figura.g2_crearFigura8();
        System.out.println("Figura 9: ");
        figura.g2_crearFigura9();
        System.out.println("Figura 10: ");
        figura.g2_crearFigura10();
        System.out.println("Figura 11: ");
        figura.g2_crearFigura11();
        System.out.println("Figura 12: ");
        figura.g2_crearFigura12();
        System.out.println("Figura 13: ");
        figura.g2_crearFigura13();
        System.out.println("Figura 14: ");
        figura.g2_crearFigura14();
        System.out.println("Figura 15: ");
        figura.g2_crearFigura15();
        System.out.println("Figura 16: ");
        figura.g2_crearFigura16();
        System.out.println("Figura 17: ");
        figura.g2_crearFigura17();
        System.out.println("Figura 18: ");
        figura.g2_crearFigura18();
        System.out.println("Figura 19: ");
        figura.g2_crearFigura19();
        System.out.println("Cadenas de Caracteres:");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String texto = sc.nextLine();

        System.out.println("Cadena de Caracteres");

        AlternarMayusMinus alt = new AlternarMayusMinus();
        ContarLetra contarL = new ContarLetra();
        ContarVocal contarV = new ContarVocal();
        EliminarLetra elimL = new EliminarLetra();
        EliminarVocal elimV = new EliminarVocal();
        InvertirLetraMayus invL = new InvertirLetraMayus();
        InvertirVocalMayus invV = new InvertirVocalMayus();
        MayusSinJ mayusJ = new MayusSinJ();
        FromarAnagrama ana = new FromarAnagrama();

        System.out.println("AlternarMayusMinus:");
        System.out.println("   Con for:      " + alt.usandoFor(texto));
        System.out.println("   Con while:    " + alt.usandoWhile(texto));
        System.out.println("   Con do-while: " + alt.usandoDoWhile(texto));
        System.out.println();

        System.out.println("ContarLetra:");
        System.out.println("   Con for:      " + contarL.usandoFor(texto));
        System.out.println("   Con while:    " + contarL.usandoWhile(texto));
        System.out.println("   Con do-while: " + contarL.usandoDoWhile(texto));
        System.out.println();

        System.out.println("ContarVocal:");
        System.out.println("   Con for:      " + contarV.usandoFor(texto));
        System.out.println("   Con while:    " + contarV.usandoWhile(texto));
        System.out.println("   Con do-while: " + contarV.usandoDoWhile(texto));
        System.out.println();

        System.out.println("EliminarLetra:");
        System.out.println("   Con for:      " + elimL.usandoFor(texto));
        System.out.println("   Con while:    " + elimL.usandoWhile(texto));
        System.out.println("   Con do-while: " + elimL.usandoDoWhile(texto));
        System.out.println();

        System.out.println("EliminarVocal:");
        System.out.println("   Con for:      " + elimV.usandoFor(texto));
        System.out.println("   Con while:    " + elimV.usandoWhile(texto));
        System.out.println("   Con do-while: " + elimV.usandoDoWhile(texto));
        System.out.println();

        System.out.println("InvertirLetraMayus:");
        System.out.println("   Con for:      " + invL.usandoFor(texto));
        System.out.println("   Con while:    " + invL.usandoWhile(texto));
        System.out.println("   Con do-while: " + invL.usandoDoWhile(texto));
        System.out.println();

        System.out.println("InvertirVocalMayus:");
        System.out.println("   Con for:      " + invV.usandoFor(texto));
        System.out.println("   Con while:    " + invV.usandoWhile(texto));
        System.out.println("   Con do-while: " + invV.usandoDoWhile(texto));
        System.out.println();

        System.out.println("MayusSinJ:");
        System.out.println("   Con for:      " + mayusJ.usandoFor(texto));
        System.out.println("   Con while:    " + mayusJ.usandoWhile(texto));
        System.out.println("   Con do-while: " + mayusJ.usandoDoWhile(texto));
        System.out.println();

        System.out.println("FormarAnagrama:");
        System.out.println("   Con for:      " + ana.usandoFor(texto));
        System.out.println("   Con while:    " + ana.usandoWhile(texto));
        System.out.println("   Con do-while: " + ana.usandoDoWhile(texto));
        System.out.println();

        System.out.println("Arrays:");
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

        System.out.println("Loadings:");

        System.out.println("");
        System.out.println("--------CARGAS--------");
        Carga carga = new Carga(10);
        System.out.println("Carga 1: ");
        carga.g2_cargar1();
        System.out.println("\nCarga 2: ");
        carga.g2_cargar2('#');
        System.out.println("\nCarga 3: ");
        carga.g2_cargar3('-');
        System.out.println("\nCarga 4: ");
        carga.g2_cargar4();
        System.out.println("\nCarga 5: ");
        carga.g2_cargar5();
        System.out.println("\nCarga 6: ");
        carga.g2_cargar6();
        System.out.println("\nCarga 8: ");
        carga.g2_cargar8();
        System.out.println("\nCarga 7: ");
        carga.g2_cargar7();
        System.out.println("\nCarga 10: ");
        carga.g2_cargar10();
        System.out.println("\nCarga 11: ");
        carga.g2_cargar11();
        System.out.println("\nCarga 12: ");
        carga.g2_cargar12();
        System.out.println("Recursividad:");

        System.out.println("Ingrese el primer numero:");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();
        Factorial factorial = new Factorial(numero1);
        factorial.factorial();
        factorial.mostrarFactorial();
        Suma suma = new Suma(numero1, numero2);
        suma.suma();
        suma.mostrarSuma();
        Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);
        multiplicacion.multiplicacion();
        multiplicacion.mostrarMultiplicacion();
        Potencia potencia = new Potencia(numero1, numero2);
        potencia.potencia();
        potencia.mostrarPotencia();
        ConteoProg conteoProg = new ConteoProg(numero1);
        System.out.print("Conteo Progresivo: ");
        conteoProg.conteoProg();
        ConteoReg conteoReg = new ConteoReg(numero1);
        System.out.print("Conteo Regresivo: ");
        conteoReg.conteoReg();
        System.out.println();

        System.out.println("Grafos y Automatas:");
        
        System.out.println("Automata para validar: a*b+c");
        A01 automata01 = new A01();
        automata01.ejecutarValidacion();
        System.out.println();

        System.out.println("Automata para validar: ab+ca");
        A02 automata2 = new A02();
        automata2.ejecutarValidacion();
        System.out.println();

        System.out.println("Automata para validar: a+/b+/c+");
        System.out.println();
        A03 automata = new A03();
        automata.ejecutarValidacion();

        System.out.println("Automata para validar: 1+/0+1*");
        System.out.println();
        A04 automata02 = new A04();
        automata02.ejecutarValidacion();
        A05a numerodecimal = new A05a();
        numerodecimal.decimal();
        A07 validador = new A07();
        validador.ejecutar(sc);

    }
}
