/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlet;

import ca.sait.services.AccountService;
import ca.servlets.models.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Timle
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = (String) request.getSession().getAttribute("username");
        
        if (username != null) {
            response.sendRedirect("home");
            return;
        }
        
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        AccountService account = new AccountService();
        
        User user = account.Login(username, password);
        
        if (user != null) {
            // User is not null
            // Store the username in session
            
            request.getSession().setAttribute("username", username);
            
            // Redirect to home page
            response.sendRedirect("home");
            return;
            
        } else {
            // User is null
            // Display an error  message in login.jsp
            
            String message = "Username or password is invalid!";
            
            request.setAttribute("message", message);
            
        }
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;
    }

    
    

}
