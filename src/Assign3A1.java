//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//public class Assign3A1 extends HttpServlet implements Servlet
//{
//    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
//    {
//        res.setContentType("text/html");
//        PrintWriter out =res.getWriter();
//        out.println("<html><body><h2>Information about Http Request</h2>");
//        out.println("<br>Server Name: "+req.getServerName());
//        out.println("<br>Server Port: "+req.getServerPort());
//        out.println("<br>Ip Address: "+req.getRemoteAddr());
//        out.println("<br>Server Path: "+req.getServletPath());
//        out.println("<br>Client Browser: "+req.getHeader("User-Agent"));
//        out.println("</body></html>");
//        out.close();
//    }
//}
