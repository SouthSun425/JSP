package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Date d = new Date();
		// Cookie 객체를 생성한 후 cookieTest 이름으로 한글 정보를 인코딩하여 쿠키에 저장.
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP Programing.", "UTF-8"));
		// 유효시간 설정 24시간
		c.setMaxAge(24*60*60);
		// 생성된 쿠키를 브라우저로 전송
		response.addCookie(c);
		
		out.print("현재시간 : " + d);
		out.print("문자열을 Cookie에 저장합니다.");
	}
	
}
