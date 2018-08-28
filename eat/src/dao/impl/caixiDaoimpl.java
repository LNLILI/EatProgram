package dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import dao.caixiDao;
import entity.cuisines;
import entity.food;
import util.DBUTil;

public class caixiDaoimpl implements caixiDao {

	@Override
	public Vector select() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from cuisines";
		Vector rowv = new Vector<>();
		try {
			conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			Vector v;
			while(rs.next()){
				v = new Vector();
				v.add(rs.getString("cuis_no"));
				v.add(rs.getString("cuis_name"));
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
	public int update(cuisines cuisines) {
		String sql = "UPDATE cuisines SET Cuisinesname = ?,Cuisinesid=?WHERE id = ?";
		return DBUTil.executeUpdate(sql,cuisines.getCuisinesname(),cuisines.getCuisinesid());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from food Where id=?";
		return DBUTil.executeUpdate(sql,id);
	}


	@Override
	public int select1() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from cuisines where Cuisinesid=?";
	    try {
	    	conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			cuisines c=new cuisines();
			c.setCuisinesname(rs.getString("Cuisinesname"));
			c.setCuisinesid(rs.getString("Cuisinesid"));
		} catch (Exception e) {
		  e.printStackTrace();
		}finally {
			DBUTil.close(conn, pstm, rs);
		}
		return 0;
	
	}





}
