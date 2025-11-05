package Compilador.ejercicio;

import java.util.Scanner;

public class numerodecimal {
  private String numeroDecimal;

  public numerodecimal(String numeroDecimal) {
    this.numeroDecimal = numeroDecimal;
  }

  Scanner sc = new Scanner(System.in);

  public void decimal() {
    System.out.print("Ingrese un numero decimal: ");
    numeroDecimal = sc.nextLine();
    Boolean esnumero = true;
    int punto = 0;
    for (int j = 0; j < numeroDecimal.length(); j++) {
      char caracter = numeroDecimal.charAt(j);
      if (caracter == '.') {
        punto++;
      }

      else if (!(Character.isDigit(caracter))) {
        esnumero = false;
        break;

      }

    }
    if (punto == 1 && esnumero) {
      System.out.println("Es decimal");
    } else
      System.out.println("No es decimal");
  }
}
