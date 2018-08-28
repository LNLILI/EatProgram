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
		return DBUTil.executeUpdate(sql1, mi.getMenu().getMenuId(),mi.getFood().getFoodid(),mi.getAmount(),mi.getItemsTotalprice());
	}

	@Override
	public List end() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from menu";
		List list = new ArrayList();
		try {
			conn = DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				Menu  menu = new Menu();
				menu.setMenuId(rs.getString("menuid"));
				menu.setTableId(rs.getString("table"));
				menu.setMenuTime(rs.getString("menutime"));
				menu.setTotalPrice(rs.getFloat("totalprice"));
				menu.setIschecked(rs.getBoolean("ischecked"));
				list.add(menu);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUTil.close(conn, pstm, rs);
		}
		return list;
	}

}
