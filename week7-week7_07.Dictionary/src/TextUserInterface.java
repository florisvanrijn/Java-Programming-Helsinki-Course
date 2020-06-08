/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florisvanrijn1
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void add(){
        System.out.print("In Finnish: ");
        String finnishWord = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        this.dictionary.add(finnishWord, translation);
    }
    public void translate(){
        System.out.print("Give a word: ");
        String wordToBeTranslated = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(wordToBeTranslated));
    }
    public void start(){
        System.out.println("Statement: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");   
        while (true) {            
            System.out.print("Statement: ");
            String input = this.reader.nextLine();
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(input.equals("add")){
                add();
            } else if(input.equals("translate")){
                translate();
            }
            else{
                System.out.println("Unknown statement");
            }
            
        }
 
    }
}
