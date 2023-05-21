<%-- 
    Document   : index
    Created on : 19 may. 2023, 10:45:31
    Author     : RSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tres en rayas</title>
        <style>
            td{
                border: black solid 2px;
            }
            .pequeña { 
                width: 50px;
                height: 50px;
            }
        </style>
    </head>
    <body>
        <h1>Juego del tres en rayas</h1>
        <br>
        <%
            String[][] pos = new String[3][3];
            
            for (int i = 0; i < 3; i++){
              for (int j = 0; j < 3; j++){
                pos[i][j] ="nada";
              }
            }
            
            int o = 0;
            do {
                int i = (int)(Math.random() * 3);
                int j = (int)(Math.random() * 3);
                if (pos[i][j].equals("nada")) {
                  pos[i][j] = "cir";
                  o++;
                }
            }while (o < 3);
            
            int x = 0;
            do {
                int i = (int)(Math.random() * 3);
                int j = (int)(Math.random() * 3);
                if (pos[i][j].equals("nada")) {
                  pos[i][j] = "cruz";
                  x++;
                }
            }while (x < 3);   
        %>
        
        <table>
            <%
                for (int i = 0; i < 3; i++){
                %>
                <tr>
                    <%
                        for (int j= 0; j < 3; j++) {
                        %>
                        <td>
                            <img src="<%= pos[i][j]%>.png" class="pequeña">
                        </td>
                        <%
                        }
                }
            %>

        </table>
            
    </body>
</html>
