package dao;

import java.util.List;

import entity.Table;

public interface tableDao {

	public List<Table> selectTable();
	public int addTable(Table table);
	
}
