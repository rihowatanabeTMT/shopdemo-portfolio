package shopdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shopdemo.bean.Item;

public class SearchDAO {
	private Connection connection;
	private PreparedStatement p_statement_selectItems_no_key;
	private PreparedStatement p_statement_selectItems;
	//コンストラクター、データベース接続
	public SearchDAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/latte_station?useSSL=false";
		String user ="root";
		String password ="89Ha40kA@Ko&";
		
		connection = DriverManager.getConnection(url,user,password);
		String sql1 = "SELECT * FROM latte_station.item WHERE genre_id = ?";
		String sql2 = "SELECT * FROM latte_station.item WHERE genre_id = ? and (item_name like ? or artist like ?)";
		
		p_statement_selectItems_no_key=connection.prepareStatement(sql1);
		p_statement_selectItems=connection.prepareStatement(sql2);
		
	}
	//検索メソッド(商品名or著者名)
	public ArrayList<Item> search_table(String key, String genre) throws SQLException{
		ResultSet rs_items = null;
		//検索空欄かどうか。空欄の場合はelse
		if(!key.isEmpty()) {
			p_statement_selectItems.setString(1, genre);
			p_statement_selectItems.setString(2,"%" +key +"%");
			p_statement_selectItems.setString(3,"%" +key +"%");
			rs_items =p_statement_selectItems.executeQuery();
		}else {
			p_statement_selectItems_no_key.setString(1, genre);
			rs_items =p_statement_selectItems_no_key.executeQuery();
			
		}
		//結果をlistに追加
		ArrayList<Item> list = new ArrayList<>();
		 while(rs_items.next()) {
			 Item item = new Item();
			 item.setItemID(rs_items.getInt("item_id"));
			 item.setItemName(rs_items.getString("item_name"));
			 item.setItemArtist(rs_items.getString("artist"));
			 item.setItemPrice(rs_items.getInt("price"));
			 item.setItemImage(rs_items.getString("item_img"));
			 list.add(item);
		 }
		 //データベースの解放
		 if(rs_items != null) {
			 rs_items.close();
		 }
		 if(connection != null) {
			 connection.close();
		 }
		return list;
	}
}
