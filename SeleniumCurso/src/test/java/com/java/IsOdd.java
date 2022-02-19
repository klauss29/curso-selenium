package com.java;

public class IsOdd {
	
	public static void main(String[] args) {

		/*pruebas:
		 * (1, 100)debe devolver 2500
		 * (-1, 100) debería devolver -1
		 * (100, 100) debe devolver 0
		 * (13, 13)debe devolver 13
		 * (100, -100)debería devolver -1
		 * (100, 1000) debe devolver 247500
		 */
	int suma=sumOdd (100,100);	
		System.out.println("La suma es: "+suma);
	
	
		
	}
	
	public static boolean isOdd (int numero) {

		//numero = 5;
		if (numero > 0) {
			if (numero % 2 != 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;

		}
		
	}

	public static int sumOdd(int inicio, int fin) {

		// rango de numeros-
		int suma=0;
		IsOdd sum=new IsOdd();

		if (fin >= inicio && inicio > 0 && fin > 0) {
			for (int x = inicio; x <= fin; x++) {
				if (sum.isOdd(x)) {
					suma=suma+x;
					
				}
			}
		}
		else {
				suma= -1;
		} 
		return suma;

			}

}
