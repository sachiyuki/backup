package com.internousdev.ecsite.dto;

public class AdminLoginDTO {

	private String adminLoginId;
	private String adminLoginPassword;
	private boolean adminLoginFlg = false;

	public String getAdminLoginId(){
		return adminLoginId;
	}

	public void setAdminLoginId(String adminLoginId){
		this.adminLoginId = adminLoginId;
	}

	public String getAdminLoginPassword(){
		return adminLoginPassword;
	}

	public void setAdminLoginPassword(String adminLoginPassword){
		this.adminLoginPassword = adminLoginPassword;
	}


	public boolean getAdminLoginFlg(){
		return adminLoginFlg;
	}

	public void setAdminLoginFlg(boolean adminLoginFlg){
		this.adminLoginFlg = adminLoginFlg;
	}



}
