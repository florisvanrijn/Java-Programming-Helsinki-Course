/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florisvanrijn1
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dict = new HashMap<String, String>();
    
    public String translate(String word){
        if(this.dict.get(word) != null){
            return this.dict.get(word);
        } else{
            return null;
        }
    }
    public void add(String word, String translation){
        this.dict.put(word, translation);
    }
    
    public int amountOfWords(){
        int numberOfWords = 0;
        for(String key: this.dict.keySet()){
            numberOfWords++;
        }
        return numberOfWords;
    }
    public ArrayList<String> translationList(){
        ArrayList<String> keyValues = new ArrayList<String>();        
        for (String key : this.dict.keySet()) {
            String sleutel = key;
            String val = dict.get(key);
            keyValues.add(key + " = " + val);
        }
        return keyValues;
    }
}
