package com.moteur;

public enum TypeMoteur {
     
    DIESEL("Diesel"),
    ESSENCE("Esence"),
    HYBRIDE("Hybride"),
    ELECTRIQUE("Electrique");
     
    private String typeMoteur = "";
     
    TypeMoteur(String pTypeMoteur) {
         
        this.typeMoteur = pTypeMoteur;
         
    }
 
}
