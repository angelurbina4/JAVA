package com.codingdojo.angel;

public class Murcielago extends Mamifero {

	public Murcielago() {
		super(300);
	}
	
	
	public void volar() {
		System.out.println("Fiiizlrsrs");
		nivelEnergia -= 50;
		this.mostrarEnergia();
	}
	
	public void comerHumanos() {
		System.out.println("Oh no un super murcieasdkks asdkas fisdo  AIUUDAAdsdjasjd...");
		nivelEnergia += 25;
		this.mostrarEnergia();
	}
	
	public void atacarPueblo() {
		System.out.println("AUXILIOOO SE QUEMA MI CASAAA... NOOOOO...");
		nivelEnergia -= 100;
		this.mostrarEnergia();
	}
	
	
}
