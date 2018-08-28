package dao;

import java.util.Vector;

import entity.Eat;

public interface NumDao {

	public Vector getAllType();
	
	public int insert(Eat book);
	
	
	public int ret(int id);
}
