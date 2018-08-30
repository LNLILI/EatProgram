package dao;

import java.util.List;
import java.util.Vector;

import entity.Table;

public interface tableDao {

	public Vector selectTable();
	public int addTable(Table table);
	public Vector XL();
}
