package dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		String sql = "UPDATE cuisines SET cuis_name = ?WHERE cuis_no = ?";
		return DBUTil.executeUpdate(sql,cuisines.getCuisinesname(),cuisines.getCuisinesid());
	}

	@Override
	public int delete(String id) {
		String sql = "delete from cuisines Where cuis_no=?";
		return DBUTil.executeUpdate(sql,id);
	}


	@Override
	public Vector select1(String no) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from cuisines where cuis_no=?";
		Vector rowv = new Vector<>();
	    try {
	    	conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, no);
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
	public Vector CX() {
		Vector vallVector = new Vector();
		Connection conn=null;
		try {
			conn = DBUTil.getConn();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql="select * from cuisines ";
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				cuisines c =new cuisines();
				c.setCuisinesid((rs.getString("cuis_no")));
				c.setCuisinesname((rs.getString("cuis_name")));
				
				
				vallVector.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUTil.close(conn, pst, rs);
		}
		return vallVector;
	}






}
