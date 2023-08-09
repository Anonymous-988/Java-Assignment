//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//public class Assign3A2 extends HttpServlet
//{
//    static int i=1;
//    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
//    {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        String k=String.valueOf(i);
//        Cookie c=new Cookie("visit",k);
//        response.addCookie(c);
//        int j=Integer.parseInt(c.getValue());
//        if(j==1)
//        {
//            out.println("<h1>Welcome to web page </h1>");
//        }
//        else        {
//            out.println("<h1>You are visited at "+i+" times</h1>");
//        }
//        i++;
//    }
//}
