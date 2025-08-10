package shopdemo.act;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import shopdemo.bean.Item;

public class CheckAction extends Action {

	@Override
	public String execute(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession(false);
		String jsp;
		if(session == null) {
			jsp ="irregular_error.jsp";
		}else {
			@SuppressWarnings("unchecked")
			ArrayList<Item> cart = (ArrayList<Item>)session.getAttribute("cart");
			if(cart == null || cart.size()==0) {
				jsp = "/error.jsp";
			}else {
				jsp ="/cart.jsp";
			}
		}
		return jsp;
	}

}
