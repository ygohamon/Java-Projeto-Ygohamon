package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectionFactory {
	public static Connection getConnection() {
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		return DriverManager.getConnection("jdbc:mysql://localhost/acme","root","asdqwezxc7");
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
}
