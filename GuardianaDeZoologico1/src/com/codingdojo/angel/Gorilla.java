package com.codingdojo.angel;

public class Gorilla extends Mamifero {
	
	public Gorilla() {
		
	}

	public int arrojarCosas() {
		System.out.println("El gorrila arrojo algo");
		nivelEnergia -= 5;
		return this.mostrarEnergia();
	}
	
	public int comerBananas() {
		System.out.println("El gorrila comio una banana");
		nivelEnergia += 10;
		if(nivelEnergia>100) {
			nivelEnergia = 100;
		}
		return this.mostrarEnergia();
	}
	
	public int trepar() {
		System.out.println("El golila esta trepando");
		nivelEnergia -= 10;
		return this.mostrarEnergia();
		
	}

}
