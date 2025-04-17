package serlet;

import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class QueryParamServlet {

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
//		
//		String name = req.getParameter("name");
//		
//		if(name==null || name.isEmpty()) {
//			name = "訪客";
//		}
//		
//		resp.setContentType(name);
//		resp.getWriter().println("<h1>Hi," + name + "!</h1>");
//	}
}
