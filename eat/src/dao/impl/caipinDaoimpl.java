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
		return null;
	}
	@Override
	public int update(food food) {

		String sql = "UPDATE food SET food_name = ?,food_cuis=?,food_unit=?,food_price=? WHERE food_no = ?";
		return DBUTil.executeUpdate(sql,food.getFoodname(),food.getCuisinesid(),food.getUnit(),food.getPrice(),food.getFoodid());
		
	}

	@Override
	public int delete(int id) {
		String sql = "delete from food Where id=?";
		return DBUTil.executeUpdate(sql,id);
		
	}
	@Override
	public int add(food food) {
		String sql = "insert into food values (?,?,?,?,?)";
		return DBUTil.executeUpdate(sql,food.getFoodid(),food.getFoodname(),food.getCuisinesid(),food.getPrice(),food.getUnit());
	}
	@Override
	public int select0() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
		String sql="select*from food where Foodname=?";
	    try {
	    	conn=DBUTil.getConn();
			pstm = conn.prepareStatement(sql);
			rs=pstm.executeQuery();
			food food=new food();
			food.setFoodid(rs.getString("food_no"));
			food.setFoodname(rs.getString("food_name"));
			food.setCuisinesid(rs.getString("food_cuis"));
			food.setUnit(rs.getString("food_unit"));
			food.setPrice(rs.getString("food_price"));
		} catch (Exception e) {
		  e.printStackTrace();
		}finally {
			DBUTil.close(conn, pstm, rs);
		}
		return 0;
	
	
	}
	

}
