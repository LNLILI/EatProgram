package dao;



import java.util.List;

import entity.cuisines;
import entity.food;

public interface caixiDao {
	public List select();
	  public int update(cuisines cuisines);
	  public int delete(int id);
	  public int select1();
}
