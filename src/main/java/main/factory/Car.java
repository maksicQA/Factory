/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author Nenad
 */
 public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
    
    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel= 0;
        this.currentFuel = 0;
        this.consumption = 0;               
    }
    
    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor,int customMaxFuel) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxSpeed = customMaxSpeed;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
    }
    
      
    public Car(String customModel, int customBuildYear, int customMaxSpeed, String customColor,int customMaxFuel, int customCurrentFuel, int customConsumption) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.maxSpeed = customMaxSpeed;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
    }
    
    public String getModel() {
        return this.model ;
    }
    
    public void setModel(String customModel) {        
        this.model = customModel;
    }
    
    
           
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear) {
        this.buildYear = customBuildYear;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor (String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel() {
        return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getCurrentFuel() {
        return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption() {
        return this.consumption;
    }
    
    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
    public String getVehicleType() {
        return this.vehicleType;
    }
    
    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina Proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Maksimalna Brzina: " + this.getMaxSpeed());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara: " + this.getMaxFuel ()); 
        System.out.println("");       
    }
    
    public void travel(int distanceTraveled) {
        // kolicina goriva da se smanji za kolicinu potrosenog
        // kilometraza treba da se uveca
        // za domaci napraviti atribut kilometraza {mileage} 1.
        // get i set metode za njega
        // prosiriti jedan od konstruktora sa navedenim atributom
        
        
        // atribut za stanje motor, on ^ off
        
        
    }


}   

