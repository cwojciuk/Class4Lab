<%-- 
    Document   : calculators2
    Created on : Feb 4, 2013, 7:55:14 PM
    Author     : Chuck Wojciuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <script src="Class4Lab4JS.js"></script>
    </head>
    <body>
        
        <div>
            <h1 style="color: darkblue">Calculators! Second Challenge.</h1>
            <table height ="20%">
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td><form name="arearectcalc" method="POST" action="calcc2.do?action=rect">
                            <table class="tableCalcs">
                                <tr>
                                    <th colspan="2" style="text-align: left;">Area: Rectangle</th>
                                </tr>
                                <tr>
                                    
                                    <td colspan="2" class="resultArea">
                                        
                                        <%
                                            if(request.getAttribute("answer")!=null && request.getAttribute("type")=="rect"){
                                                double area = (Double)request.getAttribute("answer");
                                                
                                                out.print("<h3>" + area + "</h3>");
                                            }
                                            
                                        %>
                                    </td>
                                </tr>
                                <tr>
                                    <td><input type="text" name ="length" value="Length" id="Length" onmouseover="cleartext(id)" onblur="readdtext(id)"></td>
                                    <td><input type="text" name ="width" value="Width" id="Width" onmouseover="cleartext(id)" onblur="readdtext(id)"></td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center;"><input type="submit" value="Get Rectangle Area" name="arearectsub"></td>
                                </tr>
                                
                            </table>
                            
                            
                        </form></td>
                        <td><form name="areacirccalc" method="POST" action="calcc2.do?action=circ">
                                <table class="tableCalcs">
                                <tr>
                                    <th colspan="2" style="text-align: left;">Area: Circle</th>
                                </tr>
                                <tr>
                                    
                                    <td colspan="2" class="resultArea">
                                        
                                        <%
                                            if(request.getAttribute("answer")!=null && request.getAttribute("type")=="circ"){
                                                double area = (Double)request.getAttribute("answer");
                                                out.print("<h3>" + area + "</h3>");
                                            }
                                            
                                        %>
                                    </td>
                                </tr>
                                <tr>
                                    <td>PI = 3.14159265359</td>
                                    <td><input type="text" name="radius" id="Radius" class="textDefault" value="Radius" onmouseover="cleartext(id)" onblur="readdtext(id)"></td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center;"><input type="submit" value="Get Circle Area" name="areacircsub"></td>
                                </tr>
                                
                            </table>
                            </form>
                        </td>
                        <td>
                            <form name="areatriacalc" method="POST" action="calcc2.do?action=tria">
                                <table class="tableCalcs">
                                    <tr>
                                        <th colspan="2" style="text-align: left;">Area: Right Triangle</th>
                                    </tr>
                                    
                                    <tr>

                                        <td colspan="2" class="resultArea">

                                            <%
                                                if(request.getAttribute("answer")!=null && request.getAttribute("type")=="tria"){
                                                    double side = (Double)request.getAttribute("answer");
                                                    out.print("<h3>" + side + "</h3>");
                                                }

                                            %>
                                        </td>
                                    </tr>
                                    
                                    <tr>
                                        <td><input type="text" name="s1" id="Side A" value="Side A" onmouseover="cleartext(id)" onblur="readdtext(id)"></td>
                                        <td style="border-width: 1px; border-style: solid; "><input type="text" name="s2" id="Side B or C" value="Side B or C" onmouseover="cleartext(id)" onblur="readdtext(id)">
                                            
                                            <select id="sddm" name="dropdownside">
                                                <option value="h">Hypotenuse</option>
                                                <option value="s">Side</option>
                                            </select>
                                        </td>
                                    </tr>
                                    
                                    <tr>
                                        <td colspan="2" style="text-align: center;"><input type="submit" value="Get Triangle Side" name="findsidesub"></td>
                                    </tr>
                                
                                </table>
                            </form>
                        </td>
                </tr>
            </table>
            
        </div>
    </body>
</html>
