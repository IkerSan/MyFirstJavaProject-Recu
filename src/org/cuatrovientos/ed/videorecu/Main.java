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
		
		System.out.println("CALCULADORA SIMPLE");
		System.out.println("¿Qué tipo de operación quieres realizar?");
		System.out.print("Suma / Resta / Multiplicacion / Division: ");
		
		tipoOperacion = scanner.nextLine();
		
		System.out.print("Introduce el número 1: ");
		
		numero1 = scanner.nextDouble();
		
		System.out.print("Introduce el número 2: ");
		
		numero2 = scanner.nextDouble();
		
		Calculadora operacion = new Calculadora();
		resultado = operacion.calcular(tipoOperacion, numero1, numero2);
		
		System.out.print("Resultado: " + resultado);
	}

}
