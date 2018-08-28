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
	private Menu menu;
	/**
	 * 菜品号
	 */
	private food food;
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
	public Menu getMenu() {
		return menu;
	}
	public void setMenuid(Menu menu) {
		this.menu = menu;
	}
	public food getFood() {
		return food;
	}
	public void setFoodid(food food) {
		this.food = food;
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
