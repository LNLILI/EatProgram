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
	private String menuid;
	/**
	 * ��Ʒ��
	 */
	private String foodid;
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
