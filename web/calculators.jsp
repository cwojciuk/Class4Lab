<%-- 
    Document   : calculators
    Created on : Jan 31, 2013, 2:09:01 PM
    Author     : cwojciuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <div>
            <h1 style="color: darkblue">Calculators!</h1>
            <table height ="20%">
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td><form name="arearectcalc" method="POST" action="calcc1.do?action=rect">
                            <table class="tableCalcs">
                                <tr>
                                    <th colspan="2" style="text-align: left;">Area: Rectangle</th>
                                </tr>
                                <tr>
                                    
                                    <td colspan="2" class="resultArea">
                                        
                                        <%
                                            if(request.getAttribute("area")!=null && request.getAttribute("type")=="rect"){
                                                double area = (Double)request.getAttribute("area");
                                                
                                                out.print("<h3>" + area + "</h3>");
                                            }
                                            
                                        %>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Length</td>
                                    <td>Width</td>
                                </tr>
                                <tr>
                                    <td><input type="text" name="length"></td>
                                    <td><input type="text" name="width"></td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center;"><input type="submit" value="Get Rectangle Area" name="arearectsub"></td>
                                </tr>
                                
                            </table>
                            
                            
                        </form></td>
                        <td><form name="areacirccalc" method="POST" action="calcc1.do?action=circ">
                                <table class="tableCalcs">
                                <tr>
                                    <th colspan="2" style="text-align: left;">Area: Circle</th>
                                </tr>
                                <tr>
                                    
                                    <td colspan="2" class="resultArea">
                                        
                                        <%
                                            if(request.getAttribute("area")!=null && request.getAttribute("type")=="circ"){
                                                double area = (Double)request.getAttribute("area");
                                                out.print("<h3>" + area + "</h3>");
                                            }
                                            
                                        %>
                                    </td>
                                </tr>
                                <tr>
                                    <td>PI</td>
                                    <td>Radius</td>
                                </tr>
                                <tr>
                                    <td>PI = 3.14159265359</td>
                                    <td><input type="text" name="radius"></td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center;"><input type="submit" value="Get Rectangle Area" name="arearectsub"></td>
                                </tr>
                                
                            </table>
                            </form></td>
                    <td></td>
                </tr>
            </table>
        </div>
    </body>
</html>
