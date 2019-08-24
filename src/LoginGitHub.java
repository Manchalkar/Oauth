

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginGitHub
 */

public class LoginGitHub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginGitHub() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.print("Hello in oAuth");
		String clientId=new String("3369ff10afed971ae463");
		String url="https://github.com/login/oauth/authorize?client_id="+clientId;
		   
		
		// Website you wish to allow to connect
		response.setHeader("Access-Control-Allow-Origin", "*");

	    // Request methods you wish to allow
	    response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, PATCH, DELETE");

	    // Request headers you wish to allow
	    response.setHeader("Access-Control-Allow-Headers", "X-Requested-With,content-type");

	    // Set to true if you need the website to include cookies in the requests sent
	    response.setHeader("Access-Control-Allow-Credentials", "true");

	    response.sendRedirect(url);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
