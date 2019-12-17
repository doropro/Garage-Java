package com.option;
import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {
	
	@Override
    public Double getPrix() {
     
        return 335.5d;
    }
     
    public String toString(){
        return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
    }
}

