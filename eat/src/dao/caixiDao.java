package dao;



import java.util.List;
import java.util.Vector;

import entity.cuisines;
import entity.food;

public interface caixiDao {
	public Vector select();
	  public int update(cuisines cuisines);
	  public int delete(int id);
	  public int select1();
}
