package mywebapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WebAppServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
     
       String EMAIL = req.getParameter("email");
       String PSWD = req.getParameter("pswd");
       
       if(EMAIL.equalsIgnoreCase("root@gmail.com") && PSWD.equalsIgnoreCase("root")){
        PrintWriter pw = resp.getWriter();
        
        resp.sendRedirect("webAppJsp.jsp");
     
    }else{
           PrintWriter pw = resp.getWriter();
        
        pw.write("<h1>Failed</h1>");
       }
    }
     
       
}
    
    

