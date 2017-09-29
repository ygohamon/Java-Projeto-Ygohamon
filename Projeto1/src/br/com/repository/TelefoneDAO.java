package br.com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.conexao.ConectionFactory;
import br.com.modelo.Telefone;


public class TelefoneDAO {
public Connection conexao;
	
	public TelefoneDAO(){
		this.conexao = ConectionFactory.getConnection();
	}
	
	public void salvar(Telefone telefones) throws SQLException{
		
		String sql = "INSERT INTO TELEFONE (DDD, NUMERO) VALUES (?,?)";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setString(1, telefones.getDdd());
		stmt.setString(2, telefones.getNumero());
		stmt.execute();
		//this.conexao.close();
	}
	
	public List<Telefone> listaTelefone() throws SQLException{
		List<Telefone> telefones = new ArrayList<>();
		String sql = "SELECT * FROM TELEFONES";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		ResultSet res =stmt.executeQuery();
		
		while(res.next()){
			Telefone t = new Telefone();
			t.setId(res.getLong("id"));
			t.setDdd(res.getString("DDD"));
			t.setNumero(res.getString("numero"));
			telefones.add(t);
		}
		return telefones;
		
	}
	
	public void removerTelefone(String numero) throws SQLException{
		
		String sql = "DELETE FROM TELEFONE WHERE NUMERO=?";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		
		stmt.setString(1, numero);
		stmt.execute();
		this.conexao.close();
	}
}
