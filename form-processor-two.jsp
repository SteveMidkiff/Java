<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>
<html>
    <head>
        <title>Form Processor Two</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>
        <%
            // get parameters from the request object
            String favoriteSport = request.getParameter("favoriteSport");
            String favoriteTeam = request.getParameter("favoriteTeam");
            String favoritePlayer = request.getParameter("favoritePlayer");
            String reasonFavorite = request.getParameter("reasonFavorite");
         %>
         
         <div class="center">
             <h1>Thank you for submitting your favorites info.</h1>
             <h2>This is the info you entered:</h2>
             <table class="center">
                 <tr><th id="th-id1" colspan="2">Information Entered</th></tr>
                 <tr>
                     <td>Favorite Sport:</td>
                     <td><%= favoriteSport %></td>
                 </tr>
                 <tr>
                     <td>Favorite Team:</td>
                     <td><%= favoriteTeam %></td>
                 </tr>
                 <tr>
                     <td>Favorite Player:</td>
                     <td><%= favoritePlayer %></td>
                 </tr>
                 <tr>
                     <td>Why they are your favorite:</td>
                     <td><%= reasonFavorite %></td>
                 </tr>
             </table>
         </div>
    </body>
</html>