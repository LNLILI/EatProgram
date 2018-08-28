package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import dao.menuItemsDao;
import entity.Menuitems;
import util.DBUTil;

public class menuItemsDaoImpl implements menuItemsDao {

	@Override
	public int add(Menuitems mi,String fn) {
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select foodid from foodname = ?";
		String sss = null;
		try {
			conn = DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			rs.next();
			sss=rs.getString("foodid");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUTil.close(conn, pstm, rs);
		}
		String sql1 = "insert into menuitems values(?,?,?,?,?)";
		return DBUTil.executeUpdate(sql1, mi.getItemsid(),mi.getMenuid(),sss,mi.getAmount(),mi.getItemsTotalprice());
	}

	@Override
	public int end() {
		// TODO Auto-generated method stub
		return 0;
	}

}
