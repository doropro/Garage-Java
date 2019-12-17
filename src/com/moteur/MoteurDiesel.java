package com.moteur;

public class MoteurDiesel extends Moteur {
 
    public MoteurDiesel(String pCylindre, Double pPrix) {
       
        super( pCylindre, pPrix);
        this.setTypeMoteur(TypeMoteur.DIESEL);
    }
     
}
