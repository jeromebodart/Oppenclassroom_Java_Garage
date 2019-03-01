package com.garage.voitures;

import java.io.Serializable;

public enum Marque implements Serializable {

	RENAULT("Renault"),
	PIGEOT("Pigeot"),
	TROEN("Troen");
	
	private String marque = "";
	
	Marque(String marque){
		this.marque = marque;
	}
	
}
