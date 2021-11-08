package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	// Par�mentros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimeZone=true&serverTimeZone=UTC";
	private String user = "root";
	private String password = "root";
	
	
	//M�todo de conex�o
	private Connection conectar() {
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			return conn;
		} catch (Exception e) {
			System.out.println("Erro!" + e.getMessage());
			return null;
		}
		
	}
	
//	public void testarConexao() {
//		try {
//			Connection conn = conectar();
//			System.out.println(conn);
//			conn.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
}
