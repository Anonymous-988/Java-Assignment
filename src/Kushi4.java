//import java.io.*;
//import java.util.Date;
//import javax.servlet.*;
//import javax.servlet.http.*;
//
//public class Kushi4 extends HttpServlet
//{
//    static int i=1;
//    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
//    {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        Date date = new Date();
//        out.println("<h1>"+date+"</h1>");
//        int hour = date.getHours();
//        if(hour<12)
//        {
//            out.println("<h1>Good Morning</h1>");
//        }
//        else if(hour<18)
//        {
//            out.println("<h1>Good Afternoon</h1>");
//        }
//        else
//        {
//            out.println("<h1>Good Night</h1>");
//        }
//    }
//}
