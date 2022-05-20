package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			//1. JDBC Driver 로딩 (JDBC Class 로딩: class load)
			Class.forName("org.mariadb.jdbc.Driver");
			
			//2. 연결하기 
			String url = "jdbc:mysql://192.168.10.33:3306/webdb?charset=utf8";
			connection = DriverManager.getConnection(url,"webdb","webdb");
			
			System.out.println("Connection");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패:" + e);
		} catch (SQLException e) {
			System.out.println("연결실패" + e);
			e.printStackTrace();
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
