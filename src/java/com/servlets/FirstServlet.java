
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
/**
 *
 * @author Lenovo
 */
public class FirstServlet implements Servlet{
    
    //Life cycle methods:
    
    ServletConfig conf;
    
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("creating objects:......");
    }
    
    
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Servicing.......");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>this is my first output from servlet methord:</h1>");
        out.println("</h1>Today's date and time is: "+new Date().toString()+"<h1>");
    }
    
    public void destroy(){
        System.out.println("going to destroy servlet objects");
    }
    
    //NOn life cycle methords
    
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    public String getServletInfo()
    {
        return "this servlet is created by Aditya";
    }
    
}
