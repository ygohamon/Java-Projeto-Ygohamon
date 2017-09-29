package br.com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.conexao.ConectionFactory;
import br.com.modelo.Departamento;

public class DepartamentoDAO {
public Connection conexao;
	
	public DepartamentoDAO(){
		this.conexao = ConectionFactory.getConnection();
	}
	
	public void salvar(Departamento departamento) throws SQLException{
		try {
		String sql = "INSERT INTO DEPARTAMENTO (NOME, NUMERO) VALUES (?,?)";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setString(1, departamento.getNome());
		stmt.setString(2, departamento.getNumero());
		stmt.execute();
		//this.conexao.close();
		} catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	public void procurar (Departamento departamento) throws SQLException{
		
		String sql = "SELECT * FROM DEPARTAMENTO";
		 this.conexao = ConectionFactory.getConnection();
		 PreparedStatement stmt = this.conexao.prepareStatement(sql);
		 ResultSet rs = stmt.executeQuery();
		 while(rs.next()){
			stmt.setString(1, departamento.getNome());
			stmt.setString(2, departamento.getNumero());
		 }
	}
	public List<Departamento> listaDepartamento() throws SQLException{
		List<Departamento> departamentos = new ArrayList<>();
		String sql = "SELECT * FROM DEPARTAMENTO";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		ResultSet res =stmt.executeQuery();
		
		while(res.next()){
			Departamento d = new Departamento();
			d.setId(res.getLong("id"));
			d.setNome(res.getString("nome"));
			d.setNumero(res.getString("numero"));
			departamentos.add(d);
		}
		return departamentos;
		
	}
	
	public void removerDepartamento(String numero) throws SQLException{
		
		String sql = "DELETE FROM DEPARTAMENTO WHERE NUMERO=?";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		
		stmt.setString(1, numero);
		stmt.execute();
		this.conexao.close();
	}
}
