package org.cuatrovientos.ed.videorecu;
import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tipoOperacion;
		Double numero1;
		Double numero2;
		Double resultado;
		boolean entradaValida;
		
		System.out.print("CALCULADORA SIMPLE");
		do {
            System.out.print("Operación (Suma/Resta/Multiplicacion/Division): ");
            tipoOperacion = scanner.nextLine().trim().toLowerCase();
            entradaValida = tipoOperacion.matches("suma|resta|multiplicacion|division");
            if (!entradaValida) {
                System.out.println("Operación no válida");
            }
        } while (!entradaValida);

        do {
            System.out.print("Introduce el número 1: ");
            try {
                numero1 = Double.parseDouble(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ser un número válido.");
                entradaValida = false;
            }
        } while (!entradaValida);

        do {
            System.out.print("Introduce el número 2: ");
            try {
                numero2 = Double.parseDouble(scanner.nextLine());
                if (tipoOperacion.equals("division") && numero2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    entradaValida = false;
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ser un número válido.");
                entradaValida = false;
            }
        } while (!entradaValida);
	}

}
