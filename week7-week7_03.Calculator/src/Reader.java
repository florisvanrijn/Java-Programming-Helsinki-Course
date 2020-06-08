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

public class Reader {
    
    private Scanner reader = new Scanner(System.in);
    
    public String readString(){
        String stringReader = reader.nextLine();
        return stringReader;
    }
    public int readInteger(){
        int intReader = Integer.parseInt(reader.nextLine());
        return intReader;
    }
}
