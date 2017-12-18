

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 * <p>MySQLに接続するためのユーティリティクラスです。<br>
 * ルートアカウントにてDBに接続されます。,</p>
 */


public class DBconnector {
	/**
	 * JDBCドライバー名
	 */
		private static String driverName = "com.mysql.jdbc.Driver";


	/**
	 * データベース接続URL
	 */
		private static String URL = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	/**
	 * データベース接続ユーザー名
	 */
		private static String user="root";

	/**
	 * データベース接続パスワード
	 */
		private static String password="mysql";

		public Connection getConnection(){
			Connection con =null;
			try{
				Class.forName(driverName);
				con=DriverManager.getConnection(URL,user,password);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch (SQLException e){
				e.printStackTrace();
			}
			return con;

		}
}
