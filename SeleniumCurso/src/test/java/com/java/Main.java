package com.java;

public class Main {

	public static void main(String[] args) {

		EjerciciosJavaIntermedio anio = new EjerciciosJavaIntermedio();
		anio.bisiesto(2020);

		EjerciciosJavaIntermedio areaCirculo = new EjerciciosJavaIntermedio();
		double area = areaCirculo.area(-5);

		if (area == -1) {
			System.out.println("Valor no válido");
		} else {
			System.out.println("El area del circulo es: " + area);
		}

		EjerciciosJavaIntermedio areaRec = new EjerciciosJavaIntermedio();
		double areaRe = areaRec.areaRectangulo(5, -4);

		if (areaRe == -1) {
			System.out.println("Valor no válido");
		} else {
			System.out.println("El area del rectangulo es: " + areaRe);
		}

		EjerciciosJavaIntermedio bob = new EjerciciosJavaIntermedio();
		double cubos = bob.getBucketCount(3.4, 1.5);

		if (cubos == -1) {
			System.out.println("Valor no válido");
		} else {
			System.out.println("Los cubos de pintura que Bob debe comprar son " + cubos);
		}

	}

}
