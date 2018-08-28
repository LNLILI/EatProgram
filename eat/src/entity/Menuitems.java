package entity;

import java.io.Serializable;

public class Menuitems implements Serializable {

	
	/**
	 * 菜品明细表
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 菜单明细编号
	 */
	private String itemsid;
	/**
	 * 菜单号
	 */
	private String menuid;
	/**
	 * 菜品号
	 */
	private String foodid;
	/**
	 * 数量
	 */
	private int amount;
	/**
	 * 总价
	 */
	private String itemsTotalprice;
	
	public String getItemsid() {
		return itemsid;
	}
	public void setItemsid(String itemsid) {
		this.itemsid = itemsid;
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public String getFoodid() {
		return foodid;
	}
	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getItemsTotalprice() {
		return itemsTotalprice;
	}
	public void setItemsTotalprice(String itemsTotalprice) {
		this.itemsTotalprice = itemsTotalprice;
	}
	
	

}
