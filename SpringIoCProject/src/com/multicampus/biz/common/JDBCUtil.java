package com.multicampus.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	// Connection ����
	public static Connection getConnection() {
		try {
			// 1. ����̹� ��ü �޸� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection ȹ��
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			return DriverManager.getConnection(url, "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// Connection ����
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		// 6. ���� ����
		try {
			if(rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs = null;
		}
		
		try {
			if(stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt = null;
		}
		
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
	
	// Connection ����
	public static void close(Statement stmt, Connection conn) {
		// 6. ���� ����
		try {
			if(stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt = null;
		}
		
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
	}
}
