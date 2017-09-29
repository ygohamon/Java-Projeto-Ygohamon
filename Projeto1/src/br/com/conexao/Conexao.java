package br.com.conexao;

import java.sql.Connection;

public class Conexao {
	public static void main(String[] args) {
		Connection con = ConectionFactory.getConnection();
		System.out.println("Conectado");
	}
}
