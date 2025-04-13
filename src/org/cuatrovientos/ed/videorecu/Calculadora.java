package org.cuatrovientos.ed.videorecu;

public class Calculadora {
	
	public double calcular(String operacion, double num1, double num2) {
        switch (operacion.toLowerCase()) {
            case "suma":
                return num1 + num2;
            case "resta":
                return num1 - num2;
            case "multiplicacion":
                return num1 * num2;
            case "division":
                return num1 / num2;
            default:
                throw new IllegalArgumentException(operacion + "no es válido");
        }
	}
}
