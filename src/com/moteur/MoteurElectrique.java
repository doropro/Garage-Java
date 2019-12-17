package com.moteur;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique(String cylindre, Double prixMoteur) {
	    
        super(cylindre, prixMoteur);
        this.setTypeMoteur(TypeMoteur.ELECTRIQUE);
    }
}
