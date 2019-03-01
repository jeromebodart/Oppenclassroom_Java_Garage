package com.garage.options;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 29.9d;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}

}
