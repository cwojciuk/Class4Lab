/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorPackageChallenge2;


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
 * @author Chuck Wojciuk
 */
@WebServlet(name = "Challenge2", urlPatterns = { "/calcc2.do" })
public class Challenge2 extends HttpServlet {


    public static final String PAGE = "calculators.jsp";
    private CalculateStrategy cs;
    
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
        double answer = 0;
        String type = "";
        response.setContentType("text/html");
        
        if(action.equals( "rect" )){
            cs = new RectangleAreaService(new Rectangle( Double.parseDouble(request.getParameter("length")), Double.parseDouble(request.getParameter("width")) ) );
            ;
            type = "rect";
        }else if(action.equals("circ")){
            cs = new CircleAreaService( new Circle( Double.parseDouble( request.getParameter( "radius") ) ) );
            
            type = "circ";
        }else if(action.equals("tria")){
            
            if(request.getParameter( "dropdownside" ).equals( "h" )){
                cs = new TriangleService( new Triangle( false, Double.parseDouble(request.getParameter( "s1" ) ), Double.parseDouble(request.getParameter( "s2" ) )) );
                
            }else{
                cs = new TriangleService( new Triangle( true, Double.parseDouble(request.getParameter( "s1" ) ), Double.parseDouble(request.getParameter( "s2" ) )) );
                
            }
            type = "tria";
        }
       
        answer = cs.answer();
        request.setAttribute("answer", answer);
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

