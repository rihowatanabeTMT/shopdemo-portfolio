package shopdemo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import shopdemo.bean.User;
public class UserDAO {
	private Connection connection;
	private PreparedStatement p_statement_login;

	public UserDAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/latte_station?useSSL=false";
		String user = "root";
		String password = "89Ha40kA@Ko&";

		connection = DriverManager.getConnection(url, user, password);
		String sql = "SELECT * FROM user WHERE mail =?";
		p_statement_login = connection.prepareStatement(sql);

	}

	public User login_user(String mail, String password) throws SQLException {
		User login_user = null;
		ResultSet loginResult=null;

		try {
			p_statement_login.setString(1, mail);
			loginResult = p_statement_login.executeQuery();

			if (loginResult.next()) {
				String hashedPassword = loginResult.getString("password"); // DBに保存されたハッシュ値
	            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	            if (encoder.matches(password, hashedPassword)) {

				login_user = new User();
				login_user.setUserID(loginResult.getInt("user_id"));
				login_user.setUserName(loginResult.getString("user_name"));
				login_user.setPostCode(loginResult.getString("post"));
				login_user.setAddress(loginResult.getString("address"));
				login_user.setPhoneNumber(loginResult.getString("phone"));
				login_user.setMailAddress(loginResult.getString("mail"));
		        }
			} else {

			}
		} finally {
			//データベースの解放
			if (loginResult != null) {
				loginResult.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
		return login_user;

	}
}
