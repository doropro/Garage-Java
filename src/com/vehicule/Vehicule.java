package com.vehicule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.moteur.Moteur;
import com.option.Option;

public class Vehicule implements Serializable   {
     
    private Double prix;
    private String nom;
    private List<Option> options =  new ArrayList<Option>();
    private Marque nomMarque;
    private Moteur moteur;
     
    //Constructeur par default
    public Vehicule(){
        /*this.prix = 0.00;
        this.nom = "Inconnu";
        this.nomMarque = null;
        this.options = new ArrayList<Option>();*/
    }
     
    //Constructeur avec parametres
    public Vehicule(Double pPrix, String pNom,Marque pNomMarque,List<Option> pOptions ){ //List pOption
         
        this.prix = pPrix;
        this.nom = pNom;
        this.nomMarque = pNomMarque;   
        this.options =  new ArrayList<Option>(pOptions);
         
    }
     
    // --------------- Get et Set Methodes --------------- //
     
     
    // ------------------- GET
     
    public Double getPrix(){
        return this.prix;
    }
     
    public Marque getMarque(){
        return this.nomMarque;
    }
     
    public Moteur getMoteur(){
        return this.moteur;
    }
     
    public String getNom(){
        return this.nom;
    }
     
     
    public  List<Option> getOption(){
        return this.options;
    }
     
    // ------------------- SET
     
    public void setMoteur(Moteur pMoteur){
        this.moteur = pMoteur;
    }
     
    public void setMarque(Marque pMarque){
        this.nomMarque = pMarque;
    }
     
    public void setNom(String pNom){
        this.nom = pNom;
    }
     
    public void setPrix(Double pPrix){
        this.prix = pPrix;
    }
     
    // --------------- FIN : Get et Set Methodes --------------- //
     
    // ---------------Methodes de classe  --------------- //
     
    public void addOption(Option opt){
        this.options.add(opt);
    }
     
 
    // je place setPrix ici pour sauvegarder dans la classe le prix total
    // mais cela me parait lourd, comment puis-je faire pour que cela soit mieux  ?
    public Double getPrixTotal(){
        Double t_prixTotal = 0.00d;
        for (int i = 0 ; i < this.getOption().size(); i++){
            t_prixTotal += this.getOption().get(i).getPrix();
        }
        this.setPrix((this.moteur.getPrix() + t_prixTotal));
        return getPrix();
    }
     
    /* On affiche
     *
     * @see java.lang.Object#toString()
     *  On affiche la marque de la voiture + le nom de la voiture
     *  Puis le ToString de la Class Moteur
     *  Puis le toString des options
     */
    public String toString(){
        return  "Voiture " + this.getMarque() + " : " + this.getNom()
                + " Moteur " + this.getMoteur().toString()
                + this.getOption()
                + " Prix total : " + (this.getPrixTotal());
    }
     
    // ---------------FIN : Methodes de classe  --------------- //
     
 
}