package com.example.tp;

public class Entreprise {
	private Employe[] employes;
	private int nb;

	public Entreprise() {
		this.employes = new Employe[4];
		this.nb = 0;
	}

	public Entreprise[] entreprise = new Entreprise[4];

	public void ajouterEmploye(Employe e) {
		if (nb == employes.length) {
			Employe[] emp = new Employe[employes.length * 2];
			System.arraycopy(employes, 0, emp, 0, employes.length);
			employes = emp;
		}
		employes[nb++] = e;
	}

	public void afficherPaie() {
		System.out.println("Bultin de paie ");
		for (int i = 0; i < nb; i++) {
			System.out.println(employes[i]);
		}
		System.out.println("Masse salariale totale : " + String.format("%.2f", masseSalariale()) + "€");
	}

	public double masseSalariale() {

		double somme = 0;
		for (int i = 0; i < nb; i++) {
			somme += employes[i].calculerSalaire();
		}
		return somme;
	}

}
