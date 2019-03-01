package com.garage.options;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 347.3d;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}

}
