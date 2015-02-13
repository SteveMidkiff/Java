/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

public class Automobile extends Vehicle{
    
    private String vehicleType;
    private String manufacturer;
    private String model;
    private String color;
    private String year;
    
    public Automobile(){
        vehicleType = "";
        manufacturer = "";
        model = "";
        color = "";
        year = "";
    }
    
    public Automobile(String vehicleType, String manufacturer, String model, String color, String year){
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}



