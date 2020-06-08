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
import java.util.Arrays;

public class Container {
    private final int MAXIMUM_WEIGHT;
    private ArrayList<Suitcase> containerContent = new ArrayList();
    
    public Container(int maximumWeight){
        this.MAXIMUM_WEIGHT = maximumWeight;
    }
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = containerWeight();
        int maxContainerWeight = this.MAXIMUM_WEIGHT;
        
        if (currentWeight + suitcase.totalWeight() > MAXIMUM_WEIGHT){
            
        } else {
            this.containerContent.add(suitcase);           
        }
    }
    public String toString(){
        int[] contentArray = containerContents();
        
        return "" + contentArray[0] + " suitcases (" + contentArray[1] + " kg)";
    }
    public int[] containerContents(){
        int numberOfSuitcases = 0;
        int totalWeight = 0;
        for (Suitcase suitcase : containerContent) {
            numberOfSuitcases ++;
            totalWeight += suitcase.totalWeight();
        }
        int[] content = {numberOfSuitcases, totalWeight};
        return content;
    }
    public int containerWeight(){
        int [] containerArray = containerContents();
        int containerTotalWeight = containerArray[1];
        return containerTotalWeight;
    }
    public void printThings(){
        for (Suitcase suitcase : containerContent) {
            suitcase.printThings();
        }
    }
}
