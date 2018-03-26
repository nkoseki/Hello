package sample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		request.setCharacterEncoding("utf-8");
		// formから値を取得
	    String val1 = request.getParameter("param1");
	    
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.print("HelloWorld: ");
		out.println(val1);
		out.println("</html>");
		out.close();
	}
}
