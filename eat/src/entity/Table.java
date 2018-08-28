package entity;

import java.io.Serializable;

public class Table implements Serializable{

	
	/**
	 * 餐台
	 */
	private static final long serialVersionUID = -2746790575244560817L;
	/**
	 * 餐台号
	 */	
	private String  tableid;
	/**
	 * 座位数
	 */
	private int seatnym;
	
	public String getTableid() {
		return tableid;
	}
	public void setTableid(String tableid) {
		this.tableid = tableid;
	}
	public int getSeatnym() {
		return seatnym;
	}
	public void setSeatnym(int seatnym) {
		this.seatnym = seatnym;
	}
	
	
}
