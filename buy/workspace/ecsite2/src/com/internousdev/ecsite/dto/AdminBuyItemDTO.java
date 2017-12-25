package com.internousdev.ecsite.dto;

public class AdminBuyItemDTO {

	public int itemId;
	public String itemName;
	public String itemPrice;
	public String itemStock;

	public int getItemId(){
		return itemId;
	}

	public void setItemId(int itemId) {
		// TODO 自動生成されたメソッド・スタブ
		this.itemId = itemId;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName) {
		// TODO 自動生成されたメソッド・スタブ
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		// TODO 自動生成されたメソッド・スタブ
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		// TODO 自動生成されたメソッド・スタブ
		this.itemStock = itemStock;
	}


}
