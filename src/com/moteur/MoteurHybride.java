package com.moteur;

public class MoteurHybride extends MoteurEssence {

	public MoteurHybride(String cylindre, Double prixMoteur) {
	    
        super(cylindre, prixMoteur);
        this.setTypeMoteur(TypeMoteur.HYBRIDE);
    }

}
