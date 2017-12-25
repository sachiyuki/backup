package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.AdminBuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class AdminBuyItemDAO {


	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private AdminBuyItemDTO adminBuyItemDTO = new AdminBuyItemDTO();

	public AdminBuyItemDTO getAdminItemInfo(){
		String sql = "select id, item_name, item_price, item_stock from item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				adminBuyItemDTO.setItemId(resultSet.getInt("item_id"));
				adminBuyItemDTO.setItemName(resultSet.getString("item_name"));
				adminBuyItemDTO.setItemPrice(resultSet.getString("item_price"));
				adminBuyItemDTO.setItemStock(resultSet.getString("item_stock"));


				if(!(resultSet.getString("admin_id").equals(null))){
					adminLoginDTO.setAdminLoginFlg(true);
				}

//				System.out.println(ItemId);
//				System.out.println(ItemName);
//				System.out.println(ItemPrice);
//				System.out.println(ItemStock);


			}

		} catch(Exception e){
			e.printStackTrace();
		}

		return adminBuyItemDTO;

	}

	public AdminBuyItemDTO getAdminBuyItemDTO(){
		return adminBuyItemDTO;
	}


}
