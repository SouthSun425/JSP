package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second6")
public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws  ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      String name=request.getParameter("name");
      String address = (String) request.getAttribute("address");
      out.println("<html><body>");
      out.println("이름: " +name);
      out.println("주소:" + address);
      out.println("<br>");
      out.println("dispatch를 이용한 foward 실습입니다.");
      out.println("</body></html>");
   }
}