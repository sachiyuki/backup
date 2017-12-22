package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;


public class BuyItemCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "insert into user_buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay, insert_date) values (?,?,?,?,?,?)";

	 /*
	 * @param item_transaction_id
	 * @param user_master_id
	 * @param total_price
	 * @param total_count
	 * @param pay
	 * @throws SQLException
	 */

	public void buyItemeInfo(String item_transaction_id, String user_master_id, String total_price, String total_count, String pay) throws SQLException{
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, total_price);
			preparedStatement.setString(3, total_count);
			preparedStatement.setString(4, user_master_id);
			preparedStatement.setString(5, pay);
			preparedStatement.setString(6, dateUtil.getDate());

			System.out.println("--sqlへ--");
			System.out.println(item_transaction_id);
			System.out.println(user_master_id);
			System.out.println(total_price);
			System.out.println(total_count);
			System.out.println(pay);
			System.out.println("------");

			preparedStatement.execute();

		} catch (Exception e){
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}