
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
//		String userName = request.getParameter("userName");
//		String userPwd = request.getParameter("userPwd");
//		if("tristan".equals(userName)
//				 && "123456".equals(userPwd)){
//			HttpSession session = request.getSession();
//			session.setAttribute("loginName", userName);
//			response.sendRedirect(request.getContextPath()+"/IndexServlet");
//			
//		}else{
//		
//			response.sendRedirect(request.getContextPath()+"/fail.html");
		
//		}
		response.getWriter().write("i am coming");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		response.getWriter().write("i am coming");
	}

}
