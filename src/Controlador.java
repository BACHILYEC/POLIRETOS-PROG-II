
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
import Compilador.ejercicio.A01;
import Compilador.ejercicio.A03;
import Compilador.ejercicio.A04;
import Compilador.ejercicio.A05a;
import Compilador.ejercicio.A07;
import Compilador.ejercicio.A02;
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
import pkCicloFiguras.Figura1;
import pkCicloFiguras.Figura10;
import pkCicloFiguras.Figura11;
import pkCicloFiguras.Figura12;
import pkCicloFiguras.Figura13;
import pkCicloFiguras.Figura14;
import pkCicloFiguras.Figura15;
import pkCicloFiguras.Figura16;
import pkCicloFiguras.Figura17;
import pkCicloFiguras.Figura18;
import pkCicloFiguras.Figura19;
import pkCicloFiguras.Figura2;
import pkCicloFiguras.Figura3;
import pkCicloFiguras.Figura4;
import pkCicloFiguras.Figura5;
import pkCicloFiguras.Figura6;
import pkCicloFiguras.Figura7;
import pkCicloFiguras.Figura8;
import pkCicloFiguras.Figura9;

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
        serieFibonacci.g2_imprimirFibonacci();
        serieFibonacci.g2_imprimirFibonacciWhile();
        serieFibonacci.g2_imprimirFibonacciDoWhile();
        System.out.println();
        SerieAlternante serieAlternante = new SerieAlternante(numero1);
        serieAlternante.g2_imprimirAlternante();
        System.out.println();
        serieAlternante.g2_imprimirAlternanteWhile();
        System.out.println();
        serieAlternante.g2_imprimirAlternanteDoWhile();
        System.out.println();
        SerieCombinada serieCombinada = new SerieCombinada(numero1);
        System.out.println();
        serieCombinada.g2_imprimirCombinada();
        serieCombinada.g2_imprimirCombinadaWhile();
        serieCombinada.g2_imprimirCombinadaDoWhile();
        SerieCombinada2 serieCombinada2 = new SerieCombinada2(numero1);
        System.out.println();
        serieCombinada2.g2_imprimirCombinada();
        serieCombinada2.g2_imprimirCombinadaWhile();
        serieCombinada2.g2_imprimirCombinadaDoWhile();
        SeriePrimos seriePrimos = new SeriePrimos(numero1);
        System.out.println();
        seriePrimos.g2_imprimirPrimos();
        seriePrimos.g2_imprimirPrimosWhile();
        seriePrimos.g2_imprimirPrimosDoWhile();
        SerieCuadrados serieCuadrados = new SerieCuadrados(numero1);
        System.out.println();
        serieCuadrados.g2_imprimirCuadrados();
        serieCuadrados.g2_imprimirCuadradosWhile();
        serieCuadrados.g2_imprimirCuadradosDoWhile();
        Serie3 serie3 = new Serie3(numero1);
        System.out.println();
        serie3.g2_imprimirMas3();
        serie3.g2_imprimirMas3While();
        serie3.g2_imprimirMas3DoWhile();
        Serie5 serie5 = new Serie5(numero1);
        System.out.println();
        serie5.g2_imprimirMas5();
        serie5.g2_imprimirMas5While();
        serie5.g2_imprimirMas5DoWhile();
        Potencia2 potenciaUno = new Potencia2(numero1);
        System.out.println();
        potenciaUno.g2_imprimirPotencia();
        potenciaUno.g2_imprimirPotenciaWhile();
        potenciaUno.g2_imprimirPotenciaDoWhile();
        Potencia3 potencia3 = new Potencia3(numero1);
        System.out.println();
        potencia3.g2_imprimirPotencia();
        potencia3.g2_imprimirPotenciaWhile();
        potencia3.g2_imprimirPotenciaDoWhile();
        System.out.println();
        SeriePronic seriePronic = new SeriePronic(numero1);
        System.out.println();
        seriePronic.g2_imprimirPronic();
        seriePronic.g2_imprimirPronicWhile();
        seriePronic.g2_imprimirPronicDoWhile();

        System.out.println("Serie de Caracteres:");
        Tool tool = new Tool();
        setRepeticion(tool.getConsoleNumero("Ingrese el numero de repeticiones (1-10): ", 1, 10)); 

        S1 ejercicio1 = new S1(getRepeticion());
        ejercicio1.g2_crearSerieMasMenosFor();
        ejercicio1.g2_crearSerieMasMenosWhile();
        ejercicio1.g2_crearSerieMasMenosDoWhile();

        System.out.println("Serie Fibonacci con signo: ");
        S2 ejercicio2 = new S2(getRepeticion());
        ejercicio2.g2_crearSerieFibonacciMasFor();
        ejercicio2.g2_crearSerieFibonacciMasWhile();
        ejercicio2.g2_crearSerieFibonacciMasDoWhile();

        System.out.println("Serie de numeros primos con signo: ");
        S3 ejercicio3 = new S3(getRepeticion());
        ejercicio3.g2_crearSeriePrimoFor();
        ejercicio3.g2_crearSeriePrimoWhile();
        ejercicio3.g2_crearSeriePrimoDoWhile();

        System.out.println("Sucesion de signos: ");
        S4 ejercicio4 = new S4(getRepeticion());
        ejercicio4.g2_mostrarSucesionSignoFor();
        ejercicio4.g2_mostrarSucesionSignoWhile();
        ejercicio4.g2_mostrarSucesionSignoDoWhile();

        System.out.println("Sucesion de Slash: ");
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

        System.out.println("Sucesion de Letras con Fibonacci: ");
        S10 ejercicio10 = new S10(getRepeticion());
        ejercicio10.mostrarSucesiondeLetraFibonacciDosFor();
        ejercicio10.mostrarSucesiondeLetraFibonacciDosWhile();
        ejercicio10.mostrarSucesiondeLetraFibonacciDosDoWhile();

        System.out.println("Figuras:");
        System.out.println("");
        System.out.println("--------FIGURAS--------");
        System.out.println("Figuras:");
        System.out.println("");
        System.out.println("--------FIGURAS--------");
        System.out.print("Ingrese el numero de niveles para las figuras: ");
        setNivel(sc.nextInt());
        Figura1 figura01 = new Figura1(getNivel());
        Figura2 figura02 = new Figura2(getNivel());
        Figura3 figura03 = new Figura3(getNivel());
        Figura4 figura04 = new Figura4(getNivel());
        Figura5 figura05 = new Figura5(getNivel());
        Figura6 figura06 = new Figura6(getNivel());
        Figura7 figura07 = new Figura7(getNivel());
        Figura8 figura08 = new Figura8(getNivel());
        Figura9 figura09 = new Figura9(getNivel());
        Figura10 figura010 = new Figura10(getNivel());
        Figura11 figura011 = new Figura11(getNivel());
        Figura12 figura012 = new Figura12(getNivel());
        Figura13 figura013 = new Figura13(getNivel());
        Figura14 figura014 = new Figura14(getNivel());
        Figura15 figura015 = new Figura15(getNivel());
        Figura16 figura016 = new Figura16(getNivel());
        Figura17 figura017 = new Figura17(getNivel());
        Figura18 figura018 = new Figura18(getNivel());
        Figura19 figura019 = new Figura19(getNivel());
        figura01.g2_crearFigura1();
        figura02.g2_crearFigura2();
        figura03.g2_crearFigura3();
        figura04.g2_crearFigura4();
        figura05.g2_crearFigura5();
        figura06.g2_crearFigura6();
        figura07.g2_crearFigura7();
        figura08.g2_crearFigura8();
        figura09.g2_crearFigura9();
        figura010.g2_crearFigura10();
        figura011.g2_crearFigura11();
        figura012.g2_crearFigura12();
        figura013.g2_crearFigura13();
        figura014.g2_crearFigura14();
        figura015.g2_crearFigura15();
        figura016.g2_crearFigura16();
        figura017.g2_crearFigura17();
        figura018.g2_crearFigura18();
        figura019.g2_crearFigura19();


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
        factorial.g2_factorial();
        factorial.g2_mostrarFactorial();
        Suma suma = new Suma(numero1, numero2);
        suma.g2_suma();
        suma.g2_mostrarSuma();
        Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);
        multiplicacion.g2_multiplicacion();
        multiplicacion.g2_mostrarMultiplicacion();
        Potencia potencia = new Potencia(numero1, numero2);
        potencia.g2_potencia();
        potencia.g2_mostrarPotencia();
        ConteoProg conteoProg = new ConteoProg(numero1);
        System.out.print("Conteo Progresivo: ");
        conteoProg.g2_conteoProg();
        ConteoReg conteoReg = new ConteoReg(numero1);
        System.out.print("Conteo Regresivo: ");
        conteoReg.g2_conteoReg();
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
        numerodecimal.g2_decimal();
        A07 validador = new A07();
        validador.ejecutar(sc);

    }
}
