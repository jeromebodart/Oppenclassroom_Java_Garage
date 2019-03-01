package com.garage.options;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 212.35;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}
	


}
