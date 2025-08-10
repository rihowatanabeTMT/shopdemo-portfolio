package shopdemo.act;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import shopdemo.bean.User;
import shopdemo.dao.UserDAO;

public class Login {
	public String execute(HttpServletRequest request) throws Exception{
		String id = request.getParameter("mail");
		String password = request.getParameter("password");

		String jsp;
		UserDAO user = new UserDAO();
		User login_user = user.login_user(id,password);
		HttpSession session = request.getSession(true);
		if(login_user !=null){
			session.setAttribute("login_user", login_user);
			jsp ="/top.jsp";
		}else {
			jsp="/login.jsp";
			session.setAttribute("errorMessage", "入力に誤りがあります");
		}
		return jsp;
		
	}
}
