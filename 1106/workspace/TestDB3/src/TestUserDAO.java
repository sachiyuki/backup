import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {

	String name="";
	String password="";

	/**
	 *
	 * 名前とパスワードで出力
	 */

	public void select(String name, String password){

		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql="select * from test_table where user_name=? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}












	/**
	 * 全データ出力
	 */


	public void selectAll(){
		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql = "select * from test_table";


		try{

		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs. next()){
			System.out.println(rs.getString("user_name"));
			System.out.println(rs.getString("password"));
		}

		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}


	}









/**
 * 名前で出力
 */



	public void selectByName(String name){
		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql="select * from test_table where user_name=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}

	}











/**
 * パスワードで出力
 */



	public void selectByPassword(String password){

		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql="select * from test_table where password=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, password);
			ResultSet rs = ps.executeQuery();
			if(rs. next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}


	}






	/**
	 * 書き換える
	 */


	public void updateUserName(String oldName, String newName){

		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql="update test_table set user_name=? where user_name=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setString(2, oldName);
			int i = ps.executeUpdate();
			if(i>0){
				System.out.println(i + "件更新しました。");
			}else{
				System.out.println("該当するデータがありません。");
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}


	}







	/**
	 * ユーザーを追加する
	 */


	public void insert(int id, String name, String password){
		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql = "insert into test_table values(?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, password);

			int i = ps.executeUpdate();
			if(i>0){
				System.out.println(i + "件が登録されました。");
			}

		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}














	/**
	 * データを削除する
	 */



	public void delete(String name){

		DBconnector db = new DBconnector();
		Connection con = db.getConnection();

		String sql="delete from test_table where user_name=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			int i = ps.executeUpdate();
			if (i>0){
				System.out.println(i + "件削除しました。");
			}
		} catch (SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}




	}











































}