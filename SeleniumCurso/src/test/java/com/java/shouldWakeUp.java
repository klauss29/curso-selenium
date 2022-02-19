package com.java;

public class shouldWakeUp {

	public static void main(String[] args) {
		
		boolean ladrando=true;
		int hourOfDay=23;
		
		if (hourOfDay>=0 && hourOfDay<=23){
				
		 if(ladrando=true && hourOfDay<8 || hourOfDay>22) {
				System.out.println("Es hora de despertar");
		 }
				else {
					System.out.println("Siga durmiendo");
				}
		}
		else
			 System.out.println("No es una hora válida");
		 
		}
		



}
