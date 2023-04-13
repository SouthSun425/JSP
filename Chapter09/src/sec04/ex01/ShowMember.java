package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowMember
 */
@WebServlet("/show")
public class ShowMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String id ="", pwd="" ;
        Boolean isLogon=false;
        HttpSession session =  request.getSession(false);			

        if( session != null){
	    isLogon=(Boolean)session.getAttribute("isLogon");
	    
	    // isLogon이 true상태이면 로그인 상태이다.
           if(isLogon==true){ 
        	// 로그인 아이디와 비밀번호를 가지고 옴
	        id = (String)session.getAttribute("login.id");
	        pwd = (String)session.getAttribute("login.pwd");
	        // 로그인 정보를 화면에 보여줌
   	        out.print("<html><body>");
	        out.print("아이디: " + id+"<br>");
	        out.print("비밀번호: " + pwd+"<br>");
	        out.print("</body></html>");
	    }else{ // 로그인 상태가 아니면 로그인 창으로 이동
	       response.sendRedirect("login4.html");
	    }
         }else{// 세션이 생성되지 않았으면 로그인 창으로 이동
            response.sendRedirect("login4.html");
        }
     }
}