package dao;

import java.util.List;
import java.util.Vector;

import entity.Menu;
import entity.Menuitems;

public interface menuItemsDao {

	public int add(Menuitems mi,Menu menu);
	public Vector end();

}
