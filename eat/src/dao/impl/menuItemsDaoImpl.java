package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import dao.menuItemsDao;
import entity.Menuitems;
import entity.Menu;
import util.DBUTil;

public class menuItemsDaoImpl implements menuItemsDao {

	@Override
	public int add(Menuitems mi,Menu menu) {
		
		String sql = "insert into menu values(null,?,?,?,?)";
		String sql1 = "insert into menuitems values(null,?,?,?,?)";
		DBUTil.executeUpdate(sql,menu.getTableId(),menu.getMenuTime(),menu.getTotalPrice(),false);
		return DBUTil.executeUpdate(sql1, mi.getMenu().getMenuId(),mi.getFoodName(),mi.getAmount(),mi.getItemsTotalprice());
	}

	@Override
	public Vector end() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from menu";
		Vector rowv = new Vector();
		try {
			conn = DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			Vector v = null;
			while(rs.next()){
				v = new Vector();
				v.add(rs.getString("menu_no"));
				v.add(rs.getString("menu_tableid"));
				v.add(rs.getString("menu_time"));
				v.add(rs.getFloat("menu_total"));
				if(rs.getString("menu_ischecked").equals(0)){
					v.add("“—Ω·’À");
				}else{
					v.add("Œ¥Ω·’À");
				}
				rowv.add(v);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUTil.close(conn, pstm, rs);
		}
		return rowv;
	}



}
