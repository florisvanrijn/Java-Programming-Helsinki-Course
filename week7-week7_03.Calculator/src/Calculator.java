/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florisvanrijn1
 */
public class Calculator {
    private Reader reader;
    private int stats;
    public Calculator(){
        this.reader = new Reader(); 
        this.stats = 0;
    }
    public void start(){
        while (true) {            
            System.out.println("command: ");
            String command = this.reader.readString();
            if (command.equals("end")){
                break;
            }
            if (command.equals("sum")){
                sum();
                stats++;
            }
            if (command.equals("difference")){
                difference();
                stats++;
            }
            if (command.equals("product")){
                product();
                stats++;
            }
        }
        statistics();
    }
    
    private void sum(){
            int value1 = userInput();
            int value2 = userInput2();
            System.out.println("sum of the values " + (value1 + value2));
    }
    private void difference(){
        int value1 = userInput();
        int value2 = userInput2();
        System.out.println("difference of the values " + (value1 - value2));
    }
    private void product(){
        int value1 = userInput();
        int value2 = userInput2();
        System.out.println("product of the values " + (value1 * value2));
    }
    private void statistics(){
        System.out.println("Calculations done " + this.stats);
    }
    private int userInput(){
            System.out.println("value1: ");
            int value1 = this.reader.readInteger(); 
            return value1;
    }
    private int userInput2(){
            System.out.println("value2: ");
            int value2 = this.reader.readInteger();
            return value2;
    }    
}
