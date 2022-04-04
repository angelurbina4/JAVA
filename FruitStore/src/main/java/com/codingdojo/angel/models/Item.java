package com.codingdojo.angel.models;

public class Item {
	
	// VARIABLES MIEMBRO
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
	 
	}

    // Como siempre, ¡no te olvides de generar Getters y Setters!

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
    
    
    
    
    
    
}
