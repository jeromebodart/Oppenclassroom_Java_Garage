package com.garage.options;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return 562.9d;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
	}

}
