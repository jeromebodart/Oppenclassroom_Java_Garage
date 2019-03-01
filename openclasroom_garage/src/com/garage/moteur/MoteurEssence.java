package com.garage.moteur;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String pCylindre, Double pPrix) {
		// TODO Auto-generated constructor stub
		super( pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.ESSENCE);
	}
	
}
