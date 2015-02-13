package vehicles;
public class Vehicle {
    private String vehicleType;
    private String manufacturer;
    private String model;
    private String color;
    private String year;
    
    public Vehicle(){
        vehicleType = "";
        manufacturer = "";
        model = "";
        color = "";
        year = "";
    }
    
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    
    public String getVehicleType(){
        return vehicleType;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public String getYear(){
        return year;
    }
}


    