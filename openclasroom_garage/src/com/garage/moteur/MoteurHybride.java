package com.garage.moteur;

public class MoteurHybride extends Moteur {
	
	private TypeMoteur type;

	public MoteurHybride(String pCylindre, Double pPrix) {
		// TODO Auto-generated constructor stub
		super( pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.HYBRIDE);
	}
	
}
