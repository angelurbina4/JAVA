package com.codingdojo.angel;

public class Mamifero {
	
	protected int nivelEnergia = 100;
	
	public Mamifero() {
		
	}
	
	public Mamifero(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}


	public int getNivelEnergia() {
		return nivelEnergia;
		
	}
	
	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}
	
	public void mostrarEnergia() {
		System.out.println("El nivel de energia es: "+nivelEnergia);
	}
	
	
	
	

}
