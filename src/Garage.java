import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.vehicule.Vehicule;



public class Garage{
	
    List<Vehicule> ListVoiture = new ArrayList<Vehicule>();
    ObjectOutputStream oos;
    FileOutputStream fichier = null;
    ObjectInputStream ois = null;
    Vehicule Voiture = null;
    FileInputStream fichier1;
     
    public Garage(){
        
    }
     
    public void addVoiture(Vehicule voit)
    {
        ListVoiture.add(voit);
         
        try
        {
        	oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                      new FileOutputStream(
                        new File("garage.txt"))));
        	//Chaque objet est écrit dans le fichier
            oos.writeObject(voit);
             
            //Fermeture du flux !
            oos.close();
        
          //Récupération des données !
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                      new FileInputStream(
                        new File("garage.txt"))));
        
            try {
                System.out.println(((Vehicule)ois.readObject()).toString());  
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
             
            //Fermeture du flux !
            ois.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
     
    public String toString(){
        String listeVoitures = "";   
        listeVoitures += "***************************\n";
        listeVoitures += "*  Garage OpenClassrooms  *\n";
        listeVoitures += "***************************\n";
        return listeVoitures;
    }
}