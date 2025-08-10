package shopdemo.act;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import shopdemo.bean.Item;
import shopdemo.dao.SearchDAO;

public class SearchAction extends Action {
	//データベースで検索
	@Override
	public String execute(HttpServletRequest request) throws Exception {
		String keyword = request.getParameter("keyword");
		String genre= request.getParameter("genre");
		SearchDAO search = new SearchDAO();
		ArrayList<Item> table_items =search.search_table(keyword, genre);
		//セッションの接続、結果のtabel_itemsの値を登録
		HttpSession session = request.getSession();
		session.setAttribute("table_items", table_items);
		//該当商品ない場合
		if(table_items.isEmpty() ) {
			request.setAttribute("no_item", "");
			request.setAttribute("message", "該当する商品はありません");
		}
		
		return "/top.jsp";
	}

}
