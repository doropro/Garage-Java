package com.moteur;

public class MoteurEssence extends Moteur{

	public MoteurEssence(String cylindre, Double prixMoteur) {
	    
        super(cylindre, prixMoteur);
        this.setTypeMoteur(TypeMoteur.ESSENCE);
    }
}

