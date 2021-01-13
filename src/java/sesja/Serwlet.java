/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesja;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "Serwlet", urlPatterns = {"/Serwlet"})
public class Serwlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">");
            out.println("<title>Servlet</title>");
            out.println("</head>");
            out.println("<body style=\"background-color:#e6f2ff;\">");
//            out.println("<h1> Serwlet został uruchomiony na  " + request.getContextPath() + "</h1>");
//            out.println("<hr/>");
            out.println("<p class=\"fs-1 fw-bolder\">Witaj Oliwia!</p>");
            Sesja s = new Sesja();
            s.setLogin("oliwia");
            s.setImie(" Oliwia ");
            s.setNazwisko(" Wielgus ");
            s.setZalogowano(" Zalogowano ");
            s.setNip(" 0123456789 ");
            out.println("<hr/>" + s.info(s));
            out.println("</body>");
            out.println("</html>");
            String _username = request.getParameter("username");
            String _password = request.getParameter("password");
            if (_username.equals("oliwia") && _password.equals("12345")) {
                response.sendRedirect("podstrona.html");
            } else {
                out.println("Błędny login lub hasło");
                response.sendRedirect("index.html");

            }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }
}

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
/*@Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold> }*/
