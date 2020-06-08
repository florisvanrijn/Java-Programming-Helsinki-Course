
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florisvanrijn1
 */
import java.util.ArrayList;

public class Airplanes {
    private ArrayList<Airplane> listOfPlanes = new ArrayList<Airplane>();
        
    public void add(Airplane plane){
        this.listOfPlanes.add(plane);
    }
    public void printPlane(){
        for (Airplane plane : listOfPlanes) {
            System.out.println(plane);
        }
    }
    public void printSpecificPlane(String planeID){
        for (Airplane plane : listOfPlanes) {
            if(plane.getID().contains(planeID)){
                System.out.println(plane);
            }
        }
    }
    public Airplane getPlane(String planeID){
       for (Airplane plane : listOfPlanes) {
            if(plane.getID().contains(planeID)){
                return plane;
            } 
       } return null;
    }
    public boolean containsPlane(String planeID){
        for (Airplane plane : listOfPlanes) {
            if(plane.getID().contains(planeID)){
                return true;
            } else {
            return false;
        }
    }    
        return false;
    }
}
