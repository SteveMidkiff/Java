
package vehicles;

public class Aircraft extends Vehicle{
    
    private String vehicleType;
    private String manufacturer;
    private String model;
    private String color;
    private String year;
    
    public Aircraft(){
        vehicleType = "";
        manufacturer = "";
        model = "";
        color = "";
        year = "";
    }
    
    public Aircraft(String vehicleType, String manufacturer, String model, String color, String year){
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.year = year;
    }

}