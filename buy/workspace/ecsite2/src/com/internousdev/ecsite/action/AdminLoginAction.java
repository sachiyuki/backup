package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminItemDAO;
import com.internousdev.ecsite.dao.AdminLoginDAO;
import com.internousdev.ecsite.dto.AdminItemDTO;
import com.internousdev.ecsite.dto.AdminLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport implements SessionAware {

	private AdminLoginDTO adminLoginDTO = new AdminLoginDTO();
	private AdminItemDTO adminItemDTO = new AdminItemDTO();

	private String adminId;
	private String adminPassword;
	private Map<String, Object> session;


	private int itemId;
	private String itemName;
	private String itemPrice;


	public String execute(){
		AdminLoginDAO adminLoginDAO = new AdminLoginDAO();

		AdminItemDAO adminItemDAO = new AdminItemDAO();

		String result = ERROR;
		System.out.println(adminId);
		System.out.println(adminPassword);

		adminLoginDTO = adminLoginDAO.getAdminInfo(adminId, adminPassword);

		if(adminLoginDTO.getAdminLoginFlg()){
			result=SUCCESS;

			adminItemDTO = adminItemDAO.getAdminItemInfo();
		}


		adminItemDTO = adminItemDAO.getAdminItemInfo();

//		if(((AdminLoginDTO)session.get("adminUser")).getAdminLoginFlg()){
//			result = SUCCESS;
//
//			adminItemDTO = adminItemDAO.getAdminItemInfo();
//			session.put("id",adminItemDTO.getId());
//			session.put("adminItem_name", adminItemDTO.getItemName());
//			session.put("adminItem_price", adminItemDTO.getItemPrice());
//
//
//
//			return result;
//		}

		return result;

	}

	public String getAdminId(){
		return adminId;
	}

	public void setAdminId(String adminId){
		this.adminId = adminId;
	}

	public String getAdminPassword(){
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword){
		this.adminPassword = adminPassword;
	}







	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Map<String, Object> getSession() {
		return session;
	}




}
