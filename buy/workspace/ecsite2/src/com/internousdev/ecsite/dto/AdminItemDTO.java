package com.internousdev.ecsite.dto;

public class AdminItemDTO {


	public int itemId;
	public String itemName;
	public String itemPrice;
	public String itemStock;
	public String updateDate;


	public String getItemName(){
		return itemName;

	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;

	}

	public int getItemId(){
		return itemId;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public String getUpdateDate(){
		return updateDate;
	}

	public void setUpdateDate(String updateDate){
		this.updateDate = updateDate;
	}

	public AdminItemDTO getAdminItemInfo() {
		return null;
	}


}
