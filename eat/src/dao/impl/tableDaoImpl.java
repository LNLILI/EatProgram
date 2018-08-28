package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import dao.tableDao;
import entity.Table;
import util.DBUTil;

public class tableDaoImpl implements tableDao{

	@Override
	public List<Table> selectTable() {
		
		return null;
	}

	@Override
	public int addTable(Table table) {
		String sql = "insert into table values(?,?)";
		
		return DBUTil.executeUpdate(sql, table.getTableid(),table.getSeatnym());
		
	}
	
	

}
