package com.java;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un n�mero y muestra si es positivo o negativo
		// y si es par o impar
		Scanner Numero = new Scanner(System.in); // Creaci�n de un objeto Scanner
		System.out.println("Digite el numero");
		double num = Numero.nextDouble();

		// double num=5.5;
		if (num > 0) {
			System.out.println("El n�mero digitado es positivo");
		}

		else {
			System.out.println("El n�mero digitado es negativo");
		}

		if (num % 2 == 0) {
			System.out.println("El n�mero digitado es par");
		} else {
			System.out.println("El n�mero digitado es impar");
		}

	}
}
