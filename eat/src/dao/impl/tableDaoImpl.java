package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import dao.tableDao;
import entity.Table;
import util.DBUTil;

public class tableDaoImpl implements tableDao{

	@Override
	public Vector selectTable() {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from tables";
		Vector rowv = new Vector<>();
		try {
			conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			Vector v;
			while(rs.next()){
				v = new Vector();
				v.add(rs.getString("table_no"));
				v.add(rs.getString("table_num"));
				rowv.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUTil.close(conn, pstm, rs);
		}
		return rowv;
	}

	@Override
	public int addTable(Table table) {
		String sql = "insert into tables values(?,?)";
		
		return DBUTil.executeUpdate(sql, table.getTableid(),table.getSeatnym());
		
	}
	
	

}
