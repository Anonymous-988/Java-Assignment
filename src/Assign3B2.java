//import javax.servlet.*;
//import javax.servlet.http.*;
//import java.io.*;
//
//public class Assign3B2 extends HttpServlet
//{
//    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
//    {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        String s=req.getParameter("hobby");
//
//        Cookie c=new Cookie("hobby",s);
//        out.println("<h1.You have selected: "+c.getValue()+"</h1>");
//
//    }
//
//    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
//    {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        String s=req.getParameter("hobby");
//
//        Cookie c=new Cookie("hobby",null);
//        out.println("<h1>Sed Life with no Hobbies</h1>");
//
//    }
//}
