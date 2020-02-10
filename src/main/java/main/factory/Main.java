/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pocetak");
       
        Car fiat = new Car();
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color = "black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model: "+ fiat.model);
        System.out.println("Build Year: "+ fiat.buildYear);
        System.out.println("Color: "+ fiat.color);
        System.out.println("Consumption: "+ fiat.consumption);
        System.out.println("Max Speed: "+ fiat.maxSpeed);
        System.out.println("Current Fuel: "+ fiat.currentFuel);
        System.out.println("Max Fuel: "+ fiat.maxFuel);
        
        System.out.println("");
        
        Car ford = new Car(); 
        ford.model = "Mustang GT";
        ford.buildYear = 2016;
        ford.color = "Black with red stripes";
        ford.consumption = 20;
        ford.maxSpeed = 280;
        ford.currentFuel = 50;
        ford.maxFuel = 100;
        
        System.out.println("Model: "+ ford.model);
        System.out.println("Build Year: "+ ford.buildYear);
        System.out.println("Color: "+ ford.color);
        System.out.println("Consumption: "+ ford.consumption);
        System.out.println("Max Speed: "+ ford.maxSpeed);
        System.out.println("Current Fuel: "+ ford.currentFuel);
        System.out.println("Max Fuel: "+ ford.maxFuel);
               
        
        
                
    }
    
}
