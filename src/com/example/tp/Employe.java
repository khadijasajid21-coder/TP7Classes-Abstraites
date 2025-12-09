package com.example.tp;

public abstract class Employe {
	protected String nom, prenom;

	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double calculerSalaire();

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + " salaire :" + calculerSalaire() + "]";
	}

}