package com.prl;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTest {

	static final String JDBCDriver = "oracle.jdbc.driver.OracleDriver";
	static final String DBUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "user1";
	static final String PASS = "user1";

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Properties p1 = new Properties();
		try {
			
			Class.forName(JDBCDriver);
			p1.load(new FileReader("DBProperties.properties"));
			conn = DriverManager.getConnection(DBUrl, p1);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from TESTTABLE1");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

		} catch (Exception se) {
			se.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
