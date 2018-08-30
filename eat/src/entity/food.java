package entity;

import java.io.Serializable;

public class food implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3363120264501521428L;
	private String foodid;
	private String Foodname;
	private String Cuisinesid;
	private String Unit;
	private String price;
	public String getFoodid() {
		return foodid;
	}
	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return Foodname;
	}
	public void setFoodname(String foodname) {
		Foodname = foodname;
	}
	public String getCuisinesid() {
		return Cuisinesid;
	}
	public void setCuisinesid(String cuisinesid) {
		Cuisinesid = cuisinesid;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  Foodname;
			
	}
	
	}

