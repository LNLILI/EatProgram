package dao.impl;


import java.beans.FeatureDescriptor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import dao.caipinDao;
import entity.Table;
import entity.food;
import util.DBUTil;

public class caipinDaoimpl implements caipinDao {

	@Override
	public Vector select() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from food";
		Vector rowv=new Vector<>();
		try {
			conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			Vector v;
			while(rs.next()){
				v = new Vector();
				v.add(rs.getString("food_no"));
				v.add(rs.getString("food_name"));
				v.add(rs.getString("food_cuis"));
				v.add(rs.getString("food_unit"));
				v.add(rs.getFloat("food_price"));
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
	public int update(food food) {

		String sql = "UPDATE food SET food_name = ?,food_cuis=?,food_unit=?,food_price=? WHERE food_no = ?";
		return DBUTil.executeUpdate(sql,food.getFoodname(),food.getCuisinesid(),food.getUnit(),food.getPrice(),food.getFoodid());
		
	}

	@Override
	public int delete(String id) {
		String sql = "delete from food Where food_no =?";
		return DBUTil.executeUpdate(sql,id);
		
	}
	@Override
	public int add(food food) {
		String sql = "insert into food values (?,?,?,?,?)";
		return DBUTil.executeUpdate(sql,food.getFoodid(),food.getFoodname(),food.getCuisinesid(),food.getPrice(),food.getUnit());
	}
	@Override
	public Vector select0(String name) {
		System.out.println("###"+name);
		Vector rowv = new Vector<>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from food where food_name = ?";
		System.out.println(sql);
	    try {
	    	conn = DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			rs = pstm.executeQuery();
			Vector v;
			System.out.println(rs.getRow());
			while(rs.next()){
			v = new Vector();
			v.add(rs.getString("food_no"));
			v.add(rs.getString("food_name"));
			v.add(rs.getString("food_cuis"));
			v.add(rs.getString("food_unit"));
			v.add(rs.getFloat("food_price"));
			rowv.add(v);
			}
			System.out.println(rowv.size());
		} catch (Exception e) {
		  e.printStackTrace();
		}finally {
			DBUTil.close(conn, pstm, rs);
		}
		return rowv;
	
	
	}
	@Override
	public Vector ROU() {
		Vector vallVector = new Vector();
		Connection conn=null;
		try {
			conn = DBUTil.getConn();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql="select * from food ";
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				food f =new food();
				f.setFoodid((rs.getString("food_no")));
				f.setFoodname((rs.getString("food_name")));
				f.setCuisinesid((rs.getString("food_cuis")));
				f.setUnit((rs.getString("food_unit")));
				f.setPrice((rs.getString("food_price")));
				
				vallVector.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUTil.close(conn, pst, rs);
		}
		return vallVector;
	}
}
