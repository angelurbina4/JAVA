package com.codingdojo.angel;

public class Aplicacion {

	public static void main(String[] args) {

			
	Gorilla gorilla1 = new Gorilla();
	
	gorilla1.mostrarEnergia();
	
	gorilla1.arrojarCosas();
	gorilla1.arrojarCosas();
	gorilla1.arrojarCosas();
	
	gorilla1.comerBananas();
	gorilla1.comerBananas();
	
	gorilla1.trepar();
	
	System.out.println("---------------------------");
	
	Murcielago murcielago1 = new Murcielago();
		
	murcielago1.mostrarEnergia();
	
	murcielago1.atacarPueblo();
	murcielago1.atacarPueblo();
	murcielago1.atacarPueblo();
	
	murcielago1.comerHumanos();
	murcielago1.comerHumanos();
	
	murcielago1.volar();
	
	
	
	}

}
