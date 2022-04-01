package com.codingdojo.angel;

public class Gorilla extends Mamifero {
	
	public Gorilla() {
		
	}

	public void arrojarCosas() {
		System.out.println("El gorrila arrojo algo");
		nivelEnergia -= 5;
		this.mostrarEnergia();
	}
	
	public void comerBananas() {
		System.out.println("El gorrila comio una banana");
		nivelEnergia += 10;
		if(nivelEnergia>100) {
			nivelEnergia = 100;
		}
		this.mostrarEnergia();
	}
	
	public void trepar() {
		System.out.println("El golila esta trepando");
		nivelEnergia -= 10;
		this.mostrarEnergia();
		
	}

}
