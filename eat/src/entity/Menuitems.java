package entity;

import java.io.Serializable;

public class Menuitems implements Serializable {

	
	/**
	 * ��Ʒ��ϸ��
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �˵���ϸ���
	 */
	private String itemsid;
	/**
	 * �˵���
	 */
	private Menu menu;
	/**
	 * ��Ʒ��
	 */
	private food food;
	/**
	 * ����
	 */
	private int amount;
	/**
	 * �ܼ�
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
