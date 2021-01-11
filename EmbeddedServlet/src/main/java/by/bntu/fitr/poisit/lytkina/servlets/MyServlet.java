package by.bntu.fitr.poisit.lytkina.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", "Hello from my Servlet!");
        String email = getServletConfig().getInitParameter("adminEmail");
        req.setAttribute("email", email);

        String bossEmail = getServletContext().getInitParameter("bossEmail");
        req.setAttribute("bossEmail", bossEmail);

        RequestDispatcher view = req.getRequestDispatcher("/home.jsp");
        view.forward(req, resp);
    }
}
