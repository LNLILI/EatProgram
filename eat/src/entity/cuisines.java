package entity;

import java.io.Serializable;

public class cuisines  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Cuisinesid;
	private String Cuisinesname;
	public String getCuisinesid() {
		return Cuisinesid;
	}
	public void setCuisinesid(String cuisinesid) {
		Cuisinesid = cuisinesid;
	}
	public String getCuisinesname() {
		return Cuisinesname;
	}
	public void setCuisinesname(String cuisinesname) {
		Cuisinesname = cuisinesname;
	}
	@Override
	public String toString() {
		return Cuisinesname ;
	}
	
}
