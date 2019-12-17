package com.vehicule;
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
