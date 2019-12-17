package com.option;
import java.io.Serializable;

public class GPS implements Option, Serializable {
	 
    @Override
    public Double getPrix() {
        // TODO Auto-generated method stub
        return 113.5d;
    }
     
    public String toString(){
        return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
    }
 

}
