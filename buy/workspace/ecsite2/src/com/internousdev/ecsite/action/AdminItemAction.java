package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminBuyItemDAO;
import com.internousdev.ecsite.dto.AdminItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminItemAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String deleteFlg;

	private List<AdminItemDTO> adminItemList = new ArrayList<AdminItemDTO>();

	public String execute() throws SQLException{

		if(!session.containsKey("id")){
			return ERROR;
		}


		if(deleteFlg == null){

			String item_id = session.get("id").toString();
			String item_name = session.get("item_name").toString();
			String item_price= session.get("item_price").toString();
			String item_stock= session.get("item_stock").toString();

			adminItemList = AdminBuyItemDAO.getAdminItemInfo(item_id, item_name, item_price, item_stock);
			Iterator<AdminItemDTO> iterator = adminItemList.iterator();


		}

	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
