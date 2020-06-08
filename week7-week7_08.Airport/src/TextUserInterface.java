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
import java.util.ArrayList;

public class TextUserInterface {
    private Airplanes listOfPlanes = new Airplanes();
    private ArrayList<Airplane> differentPlanes = new ArrayList<Airplane>();
    private ArrayList<String> planeAndFlight = new ArrayList<String>();
        
    public void start(Scanner reader){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        
        while (true) {            
            //input for flight and plane information to the system
            printAirportPanel();
            String input = reader.nextLine();
            
            //add airplane
            if(input.equals("1")){
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());
                Airplane plane = new Airplane(planeID, planeCapacity);
                differentPlanes.add(plane);
                listOfPlanes.add(plane);
                
            } else if (input.equals("2")){
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departureCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationCode = reader.nextLine();
                //Find airplane
                String flightString = "(" + departureCode + "-" + destinationCode + ")";
                for (Airplane plane : differentPlanes) {
                    if(plane.getID().contains(planeID)){
                    Airplane hashMapPlane = listOfPlanes.getPlane(planeID);
                    String planeCode = hashMapPlane.toString();
                    String planeArrayListAddition = planeCode + " " + flightString;
                    planeAndFlight.add(planeArrayListAddition);                     
                    }
                }
            } else if (input.equals("x")){
                break;
            }
        }
        while (true) {            
            //flight service. Prints planes, prints flights and prints airplane info
            printFlightService();
            String input = reader.nextLine();
            
            if(input.equals("1")){
                //airplanes method that returns all objects
                listOfPlanes.printPlane();
            }
            else if(input.equals("2")){
              for(String planeAndFlight : planeAndFlight){
                  System.out.println(planeAndFlight);
              }
            } 
            else if(input.equals("3")){
                
                System.out.println("Give plane ID: ");
                String planeIDForPrint = reader.nextLine();
                //use differentPlanes and maybe for loop
                listOfPlanes.printSpecificPlane(planeIDForPrint);
            }
            else if(input.equals("x")){
                break;
            }
        }
    }
    
    public void printFlightService(){
            System.out.println("Flight service");
            System.out.println("--------------------");
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");            
            System.out.print(">");
    }
    public void printAirportPanel(){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print(">");        
    }
}
