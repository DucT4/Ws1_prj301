/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Admin
 */
@WebServlet(name = "mainController", urlPatterns = {"/main"})
public class MainController extends HttpServlet {

    private static final String WELCOME = "login.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = WELCOME;
        try {
            String action = req.getParameter("action");
            switch (action) {
                case "home":
                    url = WELCOME;
                    break;
                default:
                    url = WELCOME;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error at Main Controller:  " + e.getMessage());
        } finally {
            req.getRequestDispatcher(url).forward(req, resp);
    }
}
      
}
