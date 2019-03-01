package com.garage.moteur;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String pCylindre, Double pPrix) {
		// TODO Auto-generated constructor stub
		super( pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.DIESEL);
	}
	
}
