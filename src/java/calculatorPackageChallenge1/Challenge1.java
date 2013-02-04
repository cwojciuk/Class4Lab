/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorPackageChallenge1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cwojciuk
 */
@WebServlet(name = "Challenge1", urlPatterns = {"/calcc1.do"})
public class Challenge1 extends HttpServlet {
public static final String PAGE = "calculators.jsp";
static final double PI = 3.14159265359;
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        double area = 0;
        String type = "";
        response.setContentType("text/html");
        
        if(action.equals( "rect" )){
             double length = Double.parseDouble(request.getParameter("length"));
             double width = Double.parseDouble(request.getParameter("width"));
        
             area = length*width;
             type = "rect";
        }else if(action.equals("circ")){
            double radius = Double.parseDouble(request.getParameter("radius"));
            area = (PI*radius)*Math.exp(2);
            type = "circ";
        }else if(action.equals("tria")){
            double radius = Double.parseDouble(request.getParameter("radius"));
            area = (PI*radius)*Math.exp(2);
            type = "circ";
        }
       
        
        request.setAttribute("area", area);
        request.setAttribute("type", type);
        
        RequestDispatcher view = request.getRequestDispatcher(PAGE);
        view.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
