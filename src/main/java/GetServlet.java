

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGet
 */
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<h1>This is the servlet title</h1>");
		out.println("<head><title>Servlet testing the doGet method</title></head>");
		out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
	    out.println("<p>Protocol: " + request.getProtocol() + "</p>");
	    out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
	    out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
	    out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
		out.println("<body>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
