package shopdemo.act;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import shopdemo.bean.Item;

public class AddAction extends Action {
	
	@Override
	public String execute(HttpServletRequest request) throws Exception{
		//パラメータ取得
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String artist = request.getParameter("artist");
		String price = request.getParameter("price");
		//商品情報をオブジェクトに登録
		Item item = new Item();
		item.setItemID(Integer.parseInt(id));
		item.setItemName(name);
		item.setItemArtist(artist);
		item.setItemPrice(Integer.parseInt(price));
		//セッション取得
		HttpSession session = request.getSession(true);
		@SuppressWarnings("unchecked")
		ArrayList<Item> cart =(ArrayList<Item>)session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<>();
		}
		//商品情報をカートに追加し、セッションに登録
		cart.add(item);
		session.setAttribute("cart",cart);
		
		return "/top.jsp";
	}
	
	
}
