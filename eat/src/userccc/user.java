package userccc;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import util.DBUTil;

public class user {
	public int denglu(usercc user){
		int flag = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from user where use_name = '?' and use_pwd = '?'";
		try {
			conn = (Connection) DBUTil.getConn();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			if (rs.next()) {
				pstm.setString(1, user.getUse_name());
				pstm.setString(2, user.getUse_realname());
				pstm.setString(3, user.getUse_gender());
				pstm.setString(4, user.getUse_pwd());
				pstm.setString(5, user.getUse_reg());
				System.out.println("登陆成功");
							}
			else{
				System.out.println("登录失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUTil.close(conn, pstm, rs);
		}
		return 0;
	}
	public int zhuce(usercc user){
		String sql="INSERT INTO student (use_name,use_realname,use_gender,use_pwd)VALUES('光头强','小臧','男','2018')";
		int a=DBUTil.executeUpdate(sql,user.getUse_name(),user.getUse_realname(),user.getUse_gender(),user.getUse_pwd(),user.getUse_reg());
		return a;
	}
}
