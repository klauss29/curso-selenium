package com.java;

public class TiposData {

	public static void main(String[] args) {
		// Datos primitivos (8)
		
		byte var1=1; //numerico entero, va desde -28 a 127 (ya no se usa)
		short var2=1; //numerico entero,(ya no se usa)
		int var3=1; //numerico entero recomendado para automatizar
		long var4=1L; //numerico entero, recomendado cuando son valores muy grandes
		float var5=1.2f; //numericos reales, osea con decimales (se usa poco)
		double var6=1.2;  //numericos reales osea con decimales (recomendado para automatizar)
		char var7='a';//caracter
		boolean var8=true;
		
		//cadena de chars
		String var9="Hola";
		String var10="Clau";
		
		//imprimir en consola
		System.out.println (var9);
		
		//concatenar con +
		System.out.println (var9 +' '+var10);

	}

}
