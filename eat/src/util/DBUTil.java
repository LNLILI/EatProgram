package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUTil {

	public static final String URL = "jdbc:mysql:///canyin";
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "1234";
	
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 获取连接
	public static Connection getConn()throws SQLException{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
	// 通用的增删改
	public static int executeUpdate(String sql,Object ... params){
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = getConn();
			pstm = conn.prepareStatement(sql);
			if (params!=null) {
				for (int i = 0; i < params.length; i++) {
					pstm.setObject(i+1, params[i]);
				}
			}
			return pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close(conn, pstm);
		}
		return 0;
		
	}
	
	// 关闭连接
	public static void close(Connection conn,Statement state){
		if (state!=null) {
			try {
				state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	// 关闭连接
		public static void close(Connection conn,Statement state,ResultSet rs){
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (state!=null) {
				try {
					state.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
}
