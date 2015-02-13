<!DOCTYPE html>
<%@ page import="vehicles.*, data.*, java.io.*,java.util.*" %>
<html>
    <head>
        <title>Form Processing with Classes</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>
        <%
            // get parameters from the request object
            String vehicleType = request.getParameter("vehicleType");
            String manufacturer = request.getParameter("manufacturer");
            String model = request.getParameter("model");
            String color = request.getParameter("color");
            String year = request.getParameter("year");
            
            ServletContext sc = this.getServletContext();
            String filePath = sc.getRealPath("/WEB-INF/vehicleInfo.txt");
            
            Vehicle vehicle;
            
            if(vehicleType == "Aircraft")
                vehicle = new Aircraft(vehicleType, manufacturer, model, color, year);
            else
                vehicle = new Automobile(vehicleType, manufacturer, model, color, year);
            VehicleFile.add(vehicle, filePath);
         %>
         
         <div class="center">
             <h1>The Vehicle Information Submission Page!</h1>
             <h2>This is the info you entered:</h2>
             <table class="center">
                 <tr><th id="th-id1" colspan="2">Information Entered</th></tr>
                 <tr>
                     <td>Vehicle Type:</td>
                     <td><%= vehicle.getVehicleType() %></td>
                 </tr>
                 <tr>
                     <td>Manufacturer:</td>
                     <td><%= vehicle.getManufacturer() %></td>
                 </tr>
                 <tr>
                     <td>Model:</td>
                     <td><%= vehicle.getModel() %></td>
                 </tr>
                 <tr>
                     <td>Color:</td>
                     <td><%= vehicle.getColor() %></td>
                 </tr>
                 <tr>
                     <td>Year:</td>
                     <td><%= vehicle.getYear() %></td>
                 </tr>
             </table>
         </div>
    </body>
</html>
