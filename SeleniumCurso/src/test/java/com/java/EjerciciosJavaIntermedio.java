package com.java;

public class EjerciciosJavaIntermedio {

	public static boolean bisiesto(int anio) {

		if (anio % 4 == 0) {
			if (anio % 100 == 0) {
				if (anio % 400 == 0) {
					System.out.println("El año es Bisiesto");
					return true;
				} else {
					System.out.println("El año no es Bisiesto");
					return false;
				}

			} else {
				System.out.println("El año es Bisiesto");
				return true;
			}

		} else {
			System.out.println("El año no es Bisiesto");
			return false;
		}
	}

	public static double area(double radio) {
		double area;

		if (radio < 0) {
			area = -1;
			return area;
		} else {
			double pi = 3.141592;
			area = pi * radio * radio;
			return area;

		}

	}

	public static double areaRectangulo(double x, double y) {
		double areaRect;

		if (x < 0 || y < 0) {
			areaRect = -1;

		} else {
			areaRect = x * y;

		}

		return areaRect;
	}

	// punto1
	public static double getBucketCount(double ancho, double altura, double areaPerBucket, double extraBuckets) {
		double cubosComprar = 0;

		if (ancho < 0 || altura < 0 || areaPerBucket < 0 || extraBuckets < 0) {
			cubosComprar = -1;
			return cubosComprar;
		} else {
			double area = ancho * altura;
			double cubosNecesaria = area / areaPerBucket;
			cubosComprar = (cubosNecesaria - extraBuckets);
			cubosComprar = Math.ceil(cubosComprar);
			int cubos = (int) cubosComprar;
			return cubos;
		}

	}

	// punto2
	public static double getBucketCount(double ancho, double alto, double areaCubo) {
		double cubosComprar = 0;

		if (ancho < 0 || alto < 0 || areaCubo < 0) {

			cubosComprar = -1;
			return cubosComprar;
		} else {
			double area = ancho * alto;
			cubosComprar = (area / areaCubo);
			cubosComprar = Math.ceil(cubosComprar);
			int cubos = (int) cubosComprar;
			return cubos;
		}

	}

	// punto 3
	public static double getBucketCount(double area, double areaPerBucket) {
		double cubosComprar = 0;

		if (area < 0 || cubosComprar < 0) {

			cubosComprar = -1;
			return cubosComprar;
		} else {
			cubosComprar = (area / areaPerBucket);

			cubosComprar = Math.round(cubosComprar);

			int cubos = (int) cubosComprar;
			return cubos;

		}

	}

}
