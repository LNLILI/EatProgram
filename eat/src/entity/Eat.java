package entity;

import java.io.Serializable;

public class Eat implements Serializable{

	private static final long serialVersionUID = -7246458141385026112L;
	
	private String foodNo;
	private String foodName;
	private String foodCuis;
	private String foodUnit;
	private float price;
	
	
	public String getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(String foodNo) {
		this.foodNo = foodNo;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodCuis() {
		return foodCuis;
	}
	public void setFoodCuis(String foodCuis) {
		this.foodCuis = foodCuis;
	}
	public String getFoodUnit() {
		return foodUnit;
	}
	public void setFoodUnit(String foodUnit) {
		this.foodUnit = foodUnit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	
}