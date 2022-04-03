package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;


//... importa definición de clase...
public class UsuarioAdmin extends Usuario implements UsuarioCompatibleConHIPAA, AdminCompatibleConHIPAA{
	
	// Dentro de la clase:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
	//Constructor
    public UsuarioAdmin(Integer id, String role) {
		super(id);
		this.role = role;
	}
	
	//Metodos interfaces
	
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}

	@Override
	public boolean assignPin(int pin) {
		String nuevoPin = Integer.toString(pin);
		if (nuevoPin.length() >= 6) {
			System.out.println("Pin tiene 6 o MAS digitos");
			this.pin = pin;
			return true;
		}else {
			System.out.println("Pin tiene MENOS de 6 digitos");
			return false;
		}
		
	}

	@Override
	public boolean accessAuthorized(Integer id) {
		if(this.id == id) {
			System.out.println("Pin SI coinciden");
			return true;
		}else {
			this.authIncident();
			return false;
		}
		
	}
	
	public void newIncident(String notes) {
        String report = String.format(
            "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
	
	public void authIncident() {
        String report = String.format(
            "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n", 
            new Date(), this.id, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents.add(report);
    }

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
	
	
	
	
}
