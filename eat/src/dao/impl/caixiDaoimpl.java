package dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.caixiDao;
import entity.cuisines;
import entity.food;
import util.DBUTil;

public class caixiDaoimpl implements caixiDao {

	@Override
	public List select() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from food";
		try {
			conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			List list=new ArrayList<>();
			while(rs.next()){
				cuisines c=new cuisines();
				c.setCuisinesname(rs.getString("Cuisinesname"));
				c.setCuisinesid(rs.getString("Cuisinesid"));				
				list.add(c);
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUTil.close(conn, pstm, rs);
		}
		return null;
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
