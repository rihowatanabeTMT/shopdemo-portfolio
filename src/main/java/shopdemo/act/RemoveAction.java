package shopdemo.act;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import shopdemo.bean.Item;

public class RemoveAction extends Action {

	@Override
	public String execute(HttpServletRequest request) throws Exception {
		String jsp;
		
		HttpSession session = request.getSession(false);
		if(session ==null) {
			jsp ="/irregular.jsp";
		}else {
			@SuppressWarnings("unchecked")
			ArrayList<Item> cart = (ArrayList<Item>)session.getAttribute("cart");
			String remove = request.getParameter("remove");
			int numRemove = Integer.parseInt(remove);
			cart.remove(numRemove);
			jsp ="/cart.jsp";
		}
		return jsp;
	}

}
