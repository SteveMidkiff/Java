<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>
<html>
    <head>
        <title>Form Processor One</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>
        <%
            // get parameters from the request object
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String collegeName = request.getParameter("collegeName");
            String phoneNumber = request.getParameter("phoneNumber");
         %>
         
         <div class="center">
             <h1>Thank you for submitting your personal info.</h1>
             <h2>This is the info you entered:</h2>
             <table class="center">
                 <tr><th id="th-id1" colspan="2">Information Entered</th></tr>
                 <tr>
                     <td>First Name:</td>
                     <td><%= firstName %></td>
                 </tr>
                 <tr>
                     <td>Last Name:</td>
                     <td><%= lastName %></td>
                 </tr>
                 <tr>
                     <td>College Name:</td>
                     <td><%= collegeName %></td>
                 </tr>
                 <tr>
                     <td>Phone Number:</td>
                     <td><%= phoneNumber %></td>
                 </tr>
             </table>
         </div>
    </body>
</html>
