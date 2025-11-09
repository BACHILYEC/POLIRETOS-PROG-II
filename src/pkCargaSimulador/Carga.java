<<<<<<< HEAD
package pkCargaSimulador;

import java.util.Random;
import java.util.Scanner;

import Recursividad.Variables;


public class Carga extends Variables{

    java.util.Random random = new java.util.Random();

    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String azul = "\u001B[34m";
    public static final String blanco = "\u001B[97m";

    public Carga(){
        super();
    }

    public Carga(int tiempo){
        super(tiempo);
        this.setTiempo(tiempo);
    }

    public void g2_cargar1() throws InterruptedException {
        String v[][] = new String[1][5];
        int acum = 0;
        for(int i=0; i<1; i++){
            for(int j=0; j<5; j++){
                v[i][j] = "_";
                if(acum==25){
                    v[i][j] = "\\";
                }
                if(acum==50){
                    v[i][j] = "|";
                }
                if(acum==75){
                    v[i][j] = "/";
                }
                if(acum==100){
                    v[i][j] = "_";
                }
                System.out.print("\r"); 
                System.out.print(v[i][j] + " " + acum + "%");
                Thread.sleep(getTiempo());
                acum = acum + 25;
            }
        }
        
    }

    public void g2_cargar2(char caracter) throws InterruptedException {
    
        for(int i=0; i<=20; i++){
            int porcentaje = (i*4)+20;
            System.out.print("\r");
            System.out.print("[");
            for(int j=0; j<20; j++){
                if(j < i){
                    System.out.print(caracter);
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.print("]" + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
        
    }

    public void g2_cargar3(char caracter) throws InterruptedException {
    
        for(int i=0; i<=20; i++){
            int porcentaje = (i*4)+20;
            System.out.print("\r");
            System.out.print("[");
                for(int j=0; j<10; j++){
                    if(j == i){
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");      
                    }
                }
                if(porcentaje >= 54){
                    System.out.print("\r");
                    System.out.print("[");
                    for(int j=20; j>=11; j--){
                    if(j == i){
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");      
                    }
                    }
                }
            System.out.print("]" + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
        
    }

    public void g2_cargar4() throws InterruptedException {
    
        for (int i = 0; i <= 100; i += 10) {
            String animacion = (i / 10) % 2 == 0 ? "o0o" : "0o0";

            System.out.print("\r" + animacion + " " + i + "%");
            Thread.sleep(300);
        }
        System.out.println();
    }

    public void g2_cargar5() throws InterruptedException {
    
        for (int i = 0; i <= 100; i += 5) {
            int progreso = i * 20/ 100;
            String barra = "[";

            for (int j = 0; j < 20; j++) {
                if (j < progreso) {
                    barra = barra + "=";
                } else if (j == progreso) {
                    if ((i / 5) % 2 == 0) {
                        barra = barra + ">";
                    } else {
                        barra = barra + ">";
                    }
                } else {
                    barra = barra + " ";
                }
            }

            barra = barra + "] " + i + "%";

            System.out.print("\r" + barra);
            Thread.sleep(300);
        }
    }

    public void g2_cargar6() throws InterruptedException {
        for(int i = 0; i <= 20; i++) {
            int porcentaje = (i * 4) + 20;
            System.out.print("\r[");
            if(i <= 10) {
            for(int j=0; j<10; j++) {
                if(j == i) {
                    System.out.print("<=>");
                } else {
                    System.out.print("   ");
                }
            }
            } else {
            for(int j=0; j<10; j++) {
                if(j == (20 - i)) {
                    System.out.print("<=>");
                } else {
                    System.out.print("   ");
                }
            }
            }
            System.out.print("] " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
    }

    public void g2_cargar7() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
        int porcentaje = i * 5;
        System.out.print("\r[");
        char[] rot = {'_','\\', '|', '/', '_'};
        char punta = rot[i % rot.length];
            for (int j = 0; j < 20; j++) {
                if (j < i) {
                    System.out.print("="); 
                } else if (j == i) {
                    System.out.print(punta); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
    }

    public void g2_cargar8() throws InterruptedException {
        System.out.print("Ingresar nombre y apellido: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int longitud = nombre.length();
        for (int i = 0; i <= longitud; i++) {
            int porcentaje = (i * 100) / longitud;

            System.out.print("\r[");
            for (int j = 0; j < longitud; j++) {
                if (j < i) {
                    System.out.print(nombre.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
    }

    public void g2_cargar9() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar nombre completo: ");
        String nombre = sc.nextLine();
        int longitud = nombre.length();
        for (int i = 0; i < longitud; i++) {
            int porcentaje = (i + 1) * 100 / longitud;
            System.out.println(nombre.charAt(i) + "   " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println("");
    }

    public void g2_cargar10() throws InterruptedException {
        int archivoRandom = random.nextInt(10,101);

        System.out.println("cargando archivo de " + archivoRandom + " kB: ");
        System.out.print("[");
        for (int cargado = 0; cargado <= archivoRandom; cargado++) {
        Thread.sleep(100);
        int porcentaje = (int) ((cargado * 100.0) / archivoRandom);
        String color = verde;
        if (porcentaje < 80){
            color = amarillo;
        }
        if (porcentaje < 50){
                color = azul;
        }
        String barra = "=".repeat(porcentaje / 5);
        System.out.print("\r" + color + "[" + barra + "> " + porcentaje + "%]");
        }
        System.out.println("");
    }

    public void g2_cargar11() throws InterruptedException {
        int niveles = 50; // cantidad de señales
        int anchoTotal = 25; // ancho para centrar visualmente


        for (int nivel = 1; nivel <= niveles; nivel++) {
            int longitud = random.nextInt(0, 11);
            Thread.sleep(100);
            String color = verde;
            if (longitud < 7) {
                color = amarillo;
            }
            if (longitud < 4) {
                color = azul;
            }
            String parte = "";
            for (int i = 0; i < longitud; i++) {
                parte += "-";
            }
            String figura = color + parte + "|" + parte;
            int espacios = (anchoTotal - figura.length()) / 2;
            String padding = "";
            for (int i = 0; i < espacios; i++) {
                padding += " ";
            }
            System.out.println(padding + figura);
            System.out.println(blanco);
        }
        System.out.println();

    }

    public void g2_cargar12() throws InterruptedException{
       for(int i = 0; i <= 20; i++) {
        int porcentaje = (i * 4) + 20;
        System.out.print("\r");
        if(i <= 10) {
            for(int j=0; j<10; j++) {
                if(j == i) {
                    System.out.print("oo-"+"\\"+"(>_<)"+"/-oo");
                } else {
                    System.out.print("   ");
                }
            }
        } else {
            for(int j=0; j<10; j++) {
                if(j == (20 - i)) {
                    System.out.print("oo-"+"\\"+"(>_<)"+"/-oo");
                } else {
                    System.out.print("   ");
                }
        }
    }
        Thread.sleep(getTiempo());
        }
        System.out.println();
    }

}



=======
package pkCargaSimulador;

import java.util.Random;
import java.util.Scanner;

import Recursividad.Variables;


public class Carga extends Variables{

    java.util.Random random = new java.util.Random();

    public static final String verde = "\u001B[32m";
    public static final String amarillo = "\u001B[33m";
    public static final String azul = "\u001B[34m";
    public static final String blanco = "\u001B[97m";

    public Carga(){
        super();
    }

    public Carga(int tiempo){
        super(tiempo);
        this.setTiempo(tiempo);
    }

    public void g2_cargar1() throws InterruptedException {
        String v[][] = new String[1][5];
        int acum = 0;
        for(int i=0; i<1; i++){
            for(int j=0; j<5; j++){
                v[i][j] = "_";
                if(acum==25){
                    v[i][j] = "\\";
                }
                if(acum==50){
                    v[i][j] = "|";
                }
                if(acum==75){
                    v[i][j] = "/";
                }
                if(acum==100){
                    v[i][j] = "_";
                }
                System.out.print("\r"); 
                System.out.print(v[i][j] + " " + acum + "%");
                Thread.sleep(getTiempo());
                acum = acum + 25;
            }
        }
        
    }

    public void g2_cargar2(char caracter) throws InterruptedException {
    
        for(int i=0; i<=20; i++){
            int porcentaje = (i*4)+20;
            System.out.print("\r");
            System.out.print("[");
            for(int j=0; j<20; j++){
                if(j < i){
                    System.out.print(caracter);
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.print("]" + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
        
    }

    public void g2_cargar3(char caracter) throws InterruptedException {
    
        for(int i=0; i<=20; i++){
            int porcentaje = (i*4)+20;
            System.out.print("\r");
            System.out.print("[");
                for(int j=0; j<10; j++){
                    if(j == i){
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");      
                    }
                }
                if(porcentaje >= 54){
                    System.out.print("\r");
                    System.out.print("[");
                    for(int j=20; j>=11; j--){
                    if(j == i){
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");      
                    }
                    }
                }
            System.out.print("]" + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
        
    }

    public void g2_cargar4() throws InterruptedException {
    
        for (int i = 0; i <= 100; i += 10) {
            String animacion = (i / 10) % 2 == 0 ? "o0o" : "0o0";

            System.out.print("\r" + animacion + " " + i + "%");
            Thread.sleep(300);
        }
        System.out.println();
    }

    public void g2_cargar5() throws InterruptedException {
    
        for (int i = 0; i <= 100; i += 5) {
            int progreso = i * 20/ 100;
            String barra = "[";

            for (int j = 0; j < 20; j++) {
                if (j < progreso) {
                    barra = barra + "=";
                } else if (j == progreso) {
                    if ((i / 5) % 2 == 0) {
                        barra = barra + ">";
                    } else {
                        barra = barra + ">";
                    }
                } else {
                    barra = barra + " ";
                }
            }

            barra = barra + "] " + i + "%";

            System.out.print("\r" + barra);
            Thread.sleep(300);
        }
    }

    public void g2_cargar6() throws InterruptedException {
        for(int i = 0; i <= 20; i++) {
            int porcentaje = (i * 4) + 20;
            System.out.print("\r[");
            if(i <= 10) {
            for(int j=0; j<10; j++) {
                if(j == i) {
                    System.out.print("<=>");
                } else {
                    System.out.print("   ");
                }
            }
            } else {
            for(int j=0; j<10; j++) {
                if(j == (20 - i)) {
                    System.out.print("<=>");
                } else {
                    System.out.print("   ");
                }
            }
            }
            System.out.print("] " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
    }

    public void g2_cargar7() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
        int porcentaje = i * 5;
        System.out.print("\r[");
        char[] rot = {'_','\\', '|', '/', '_'};
        char punta = rot[i % rot.length];
            for (int j = 0; j < 20; j++) {
                if (j < i) {
                    System.out.print("="); 
                } else if (j == i) {
                    System.out.print(punta); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println();
    }

    public void g2_cargar8() throws InterruptedException {
        System.out.print("Ingresar nombre y apellido: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int longitud = nombre.length();
        for (int i = 0; i <= longitud; i++) {
            int porcentaje = (i * 100) / longitud;

            System.out.print("\r[");
            for (int j = 0; j < longitud; j++) {
                if (j < i) {
                    System.out.print(nombre.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
    }

    public void g2_cargar9() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar nombre completo: ");
        String nombre = sc.nextLine();
        int longitud = nombre.length();
        for (int i = 0; i < longitud; i++) {
            int porcentaje = (i + 1) * 100 / longitud;
            System.out.println(nombre.charAt(i) + "   " + porcentaje + "%");
            Thread.sleep(getTiempo());
        }
        System.out.println("");
    }

    public void g2_cargar10() throws InterruptedException {
        int archivoRandom = random.nextInt(10,101);

        System.out.println("cargando archivo de " + archivoRandom + " kB: ");
        System.out.print("[");
        for (int cargado = 0; cargado <= archivoRandom; cargado++) {
        Thread.sleep(100);
        int porcentaje = (int) ((cargado * 100.0) / archivoRandom);
        String color = verde;
        if (porcentaje < 80){
            color = amarillo;
        }
        if (porcentaje < 50){
                color = azul;
        }
        String barra = "=".repeat(porcentaje / 5);
        System.out.print("\r" + color + "[" + barra + "> " + porcentaje + "%]");
        }
        System.out.println("");
    }

    public void g2_cargar11() throws InterruptedException {
        int niveles = 50; // cantidad de señales
        int anchoTotal = 25; // ancho para centrar visualmente


        for (int nivel = 1; nivel <= niveles; nivel++) {
            int longitud = random.nextInt(0, 11);
            Thread.sleep(100);
            String color = verde;
            if (longitud < 7) {
                color = amarillo;
            }
            if (longitud < 4) {
                color = azul;
            }
            String parte = "";
            for (int i = 0; i < longitud; i++) {
                parte += "-";
            }
            String figura = color + parte + "|" + parte;
            int espacios = (anchoTotal - figura.length()) / 2;
            String padding = "";
            for (int i = 0; i < espacios; i++) {
                padding += " ";
            }
            System.out.println(padding + figura);
            System.out.println(blanco);
        }
        System.out.println();

    }

    public void g2_cargar12() throws InterruptedException{
       for(int i = 0; i <= 20; i++) {
        int porcentaje = (i * 4) + 20;
        System.out.print("\r");
        if(i <= 10) {
            for(int j=0; j<10; j++) {
                if(j == i) {
                    System.out.print("oo-"+"\\"+"(>_<)"+"/-oo");
                } else {
                    System.out.print("   ");
                }
            }
        } else {
            for(int j=0; j<10; j++) {
                if(j == (20 - i)) {
                    System.out.print("oo-"+"\\"+"(>_<)"+"/-oo");
                } else {
                    System.out.print("   ");
                }
        }
    }
        Thread.sleep(getTiempo());
        }
        System.out.println();
    }

}



>>>>>>> main
