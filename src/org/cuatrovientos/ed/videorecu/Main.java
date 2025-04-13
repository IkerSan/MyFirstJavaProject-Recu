package org.cuatrovientos.ed.videorecu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoOperacion;
        double numero1;
        double numero2;
        double resultado;
        
        System.out.println("CALCULADORA SIMPLE");
        
        do {
            System.out.print("Operación (suma/resta/multiplicacion/division): ");
            tipoOperacion = scanner.nextLine().trim().toLowerCase();
        } while (!tipoOperacion.matches("suma|resta|multiplicacion|division"));

        while (true) {
            System.out.print("Introduce el número 1: ");
            try {
                numero1 = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar un número válido");
            }
        }

        while (true) {
            System.out.print("Introduce el número 2: ");
            try {
                numero2 = Double.parseDouble(scanner.nextLine());
                if (tipoOperacion.equals("division") && numero2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar un número válido");
            }
        }

        Calculadora calculadora = new Calculadora();
        resultado = calculadora.calcular(tipoOperacion, numero1, numero2);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}