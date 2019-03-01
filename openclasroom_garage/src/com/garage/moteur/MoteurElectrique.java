package com.garage.moteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String pCylindre, Double pPrix) {
		// TODO Auto-generated constructor stub
		super( pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.ELECTRIQUE);
	}
	
}
