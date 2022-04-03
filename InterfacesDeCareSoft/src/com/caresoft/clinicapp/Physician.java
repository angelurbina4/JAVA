package com.caresoft.clinicapp;

import java.sql.Date;
import java.util.ArrayList;

//... importa definición de clase...
public class Physician extends Usuario implements UsuarioCompatibleConHIPAA {

    // Dentro de la clase:    
    private ArrayList<String> patientNotes;
	
    // PARA HACER: Constructor que tome un ID
    public Physician(Integer id) {
		super(id);
	}
    
    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
    @Override
	public boolean assignPin(int pin) {
		String nuevoPin = Integer.toString(pin);
		if(nuevoPin.length() == 4) {
			System.out.println("Pin SI tiene 4 digitos");
			this.pin = pin;
			return true;
		}
		System.out.println("Pin NO tiene 4 digitos");
		return false;
		
	}

	@Override
	public boolean accessAuthorized(Integer id) {
		if(this.id == id) {
			System.out.println("Pin SI coinciden");
			return true;
		}
		System.out.println("Pin NO coinciden");
		return false;
	}
	
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // PARA HACER: Setters y Getters
    public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	
}
