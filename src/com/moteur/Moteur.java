package com.moteur;
import java.io.Serializable;

public abstract class Moteur implements Serializable {
    
    private TypeMoteur type;
    private String cylindre;
    private Double prix;
     
     
    public Moteur(){
        this.type = null;
        this.cylindre = "Inconnu";
        this.prix = 0.00;
    }
     
    public Moteur( String pCylindre, Double pPrix){
        this.cylindre = pCylindre;
        this.prix = pPrix;
    }
     
    public String toString(){
        return this.getType() + " " + this.getCylindre() + " (" + this.getPrix()  + "€) " ;
    }
     
    public void setTypeMoteur(TypeMoteur pType){
        this.type = pType;
    }
     
    public TypeMoteur getType(){
        return type;
    }
     
    public String getCylindre(){
        return this.cylindre;
    }
     
     
    public Double getPrix(){
        return this.prix;
    }
 
}