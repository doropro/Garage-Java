package com.option;
import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
 
    @Override
    public Double getPrix() {
     
        return 113.5d;
    }
     
    public String toString(){
        return this.getClass().getSimpleName() + " (" + this.getPrix() + "€)";
    }
}