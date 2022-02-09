package com.java;

import java.util.Arrays;

public class arreglos {

	public static void main(String[] args) {

		// Arreglo Bidimensional
		String[][] nombres = new String[2][2];
		nombres[0][0] = "Ricardo";
		nombres[0][1] = "Adonai";
		nombres[1][0] = "Alejandro";
		nombres[1][1] = "Juan";

		// ACTIVIDAD

//				IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP
		int fila = nombres.length;
		int col = nombres[0].length;

		// System.out.println("filas: " + fila);
		// System.out.println("columnas: " + col);

		// System.out.println(Arrays.deepToString(nombres));

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" | " + nombres[i][j]);

			}
		System.out.println("|");
		}

	}

}
