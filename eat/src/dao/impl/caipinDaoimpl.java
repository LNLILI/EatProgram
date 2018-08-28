package dao.impl;


import java.beans.FeatureDescriptor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.caipinDao;
import entity.food;
import util.DBUTil;

public class caipinDaoimpl implements caipinDao {

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
				food food=new food();
				food.setFoodname(rs.getString("Foodname"));
				food.setCuisinesid(rs.getString("Cuisinesid"));
				food.setUnit(rs.getString("Unit"));
				food.setPrice(rs.getString("price"));
				list.add(food);
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
	public int update(food food) {

		String sql = "UPDATE food SET Foodname = ?,Cuisinesid=?,Unit=?,price=?WHERE id = ?";
		return DBUTil.executeUpdate(sql,food.getFoodname(),food.getCuisinesid(),food.getUnit(),food.getPrice());
		
	}

	@Override
	public int delete(int id) {
		String sql = "delete from food Where id=?";
		return DBUTil.executeUpdate(sql,id);
		
	}
	@Override
	public int add(food food) {
		String sql = "insert into food values (?,?,?,?,?)";
		return DBUTil.executeUpdate(sql,food.getFoodname(),food.getCuisinesid(),food.getUnit(),food.getPrice());
		
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
			food.setFoodid(rs.getString("Foodid"));
			food.setFoodname(rs.getString("Foodname"));
			food.setCuisinesid(rs.getString("Cuisinesid"));
			food.setUnit(rs.getString("Unit"));
			food.setPrice(rs.getString("price"));
		} catch (Exception e) {
		  e.printStackTrace();
		}finally {
			DBUTil.close(conn, pstm, rs);
		}
		return 0;
	
	
	}
	

}
