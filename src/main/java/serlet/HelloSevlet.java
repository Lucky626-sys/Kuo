package serlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//表示瀏覽器可以透過http://localhost:8080/JavaWeb/hello 網址執行到此Servlet程式
//@WebServlet(urlPatterns = {"/hello", "/welcome"})

@WebServlet(urlPatterns = "/hello")
public class HelloSevlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//設定回應內容為文字，編碼為UTF-8
		resp.setContentType("text/html; charset=UTF-8");
		//將字串回應給瀏覽器
		resp.getWriter().println("<h1>Hello Lucky!</h1>");
		
	}


	
}
