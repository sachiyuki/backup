package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private Map<String, Object> session;

	private LoginDAO loginDAO = new LoginDAO();

	private LoginDTO loginDTO = new LoginDTO();

	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute(){
		String result = ERROR;

		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		session.put("login_user_id", loginUserId);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;

			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());

			System.out.println("---LOGIN ACTION");
			System.out.println(buyItemDTO.getId());
			System.out.println(buyItemDTO.getItemName());
			System.out.println(buyItemDTO.getItemPrice());
			System.out.println("---");
			System.out.println(session.get("id"));
			System.out.println(session.get("login_user_id"));
			System.out.println(session.get("total_price"));
			System.out.println("---セッション情報");
			System.out.println(session.get("buyItem_name"));
			System.out.println(session.get("buyItem_price"));
			System.out.println("---");



//			loginDTO.setLoginId(resultSet.getString("login_id"));
//			loginDTO.setLoginPassword(resultSet.getString("login_pass"));
//			loginDTO.setUserName(resultSet.getString("user_name"));


			return result;
		}

		return result;

	}

	public String getLoginUserId(){

		return loginUserId;

	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

}