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

public class Suitcase {
    private final int MAXIMUM_WEIGHT;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase(int maxweight){
     this.MAXIMUM_WEIGHT = maxweight;
    }
    public void addThing(Thing thing){
        int suitcaseWeight = totalWeight();
        if (suitcaseWeight + thing.getWeight() > MAXIMUM_WEIGHT){
            
        } else {
            this.things.add(thing);           
        }

    }
    public String toString(){
        int totalWeight = 0;
        int totalItems = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
            totalItems++;
        }
        if(totalItems == 0){
            return "empty (" + totalWeight + " kg)";
        } else if (totalItems == 1){
            return totalItems + " thing (" + totalWeight + " kg)";
        } else{
            return totalItems + " things (" + totalWeight + " kg)";    
        }
        
    }
    public int totalWeight(){
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    public void printThings(){
        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i));
        }
    }
    public Thing heaviestThing(){
        Thing heaviest = new Thing("heaviest", 0);
        if(things.isEmpty()){
            return null;
        }
        for (Thing thing : things) {
            if(thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
        }
        return heaviest;
    }
}
