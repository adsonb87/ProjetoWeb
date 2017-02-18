package br.projetoweb.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
//	public static Connection getConnection() throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.jdbc.Driver");
//		return DriverManager.getConnection("jdbc:mysql://localhost/projetoweb", "root","");
//	}
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/bancoaluno","postgres","9548");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Não foi possivel conectar " + e.getMessage());
		}
		
		return con;
	}
	
//	public static Connection getConnection() throws SQLException, ClassNotFoundException{
//		Class.forName("com.mysql.jdbc.Driver");
//		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bancoaluno", "postgres", "9548");
//		
//	}
	
	
}
