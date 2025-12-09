package com.example.tp;

public class EmployeSalaire extends Employe {
	protected double salaireMensuel;
	
	

	public EmployeSalaire(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaireMensuel = salaire;
	}

	@Override 
	public double calculerSalaire() {
		return salaireMensuel;
	}
	
}
