package data;
import java.io.*;
import vehicles.*;
public class VehicleFile {
    public static void add(Vehicle vehicle, String filePath) throws IOException{
        File file = new File(filePath);
        try (PrintWriter outWriter = new PrintWriter(new FileWriter(file, true))){
            outWriter.println(vehicle.getVehicleType()+ "|" + vehicle.getManufacturer()+
                    "|" + vehicle.getModel() + "|" + vehicle.getColor() + "|" + 
                    vehicle.getYear());
        }
    }
}
