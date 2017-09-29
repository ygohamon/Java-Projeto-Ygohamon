package br.com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.conexao.ConectionFactory;
import br.com.modelo.Dependente;

public class DependenteDAO {
	public Connection conexao;
	
	public DependenteDAO(){
		this.conexao = ConectionFactory.getConnection();
	}
	
	public void salvar(Dependente dependente) throws SQLException{
		try {
		String sql = "INSERT INTO DEPENDENTE (NOME, MATRICULA, FUNCIONARIO) VALUES (?,?,?)";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setString(1, dependente.getNome());
		stmt.setString(2, dependente.getMatricula());
		stmt.setString(3, dependente.getFuncionario());
		stmt.execute();
		//this.conexao.close();
		} catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	public void procurar (Dependente dependente) throws SQLException{
		
		String sql = "SELECT * FROM DEPENDENTE";
		 this.conexao = ConectionFactory.getConnection();
		 PreparedStatement stmt = this.conexao.prepareStatement(sql);
		 ResultSet rs = stmt.executeQuery();
		 while(rs.next()){
			stmt.setString(1, dependente.getNome());
			stmt.setString(2, dependente.getMatricula());
			stmt.setString(3, dependente.getFuncionario());
		 }
	}
	
	public List<Dependente> listaDependente() throws SQLException{
		List<Dependente> dependente = new ArrayList<>();
		String sql = "SELECT * FROM DEPENDENTE";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		ResultSet res =stmt.executeQuery();
		
		while(res.next()){
			Dependente dp = new Dependente();
			dp.setId(res.getLong("id"));
			dp.setNome(res.getString("nome"));
			dp.setMatricula(res.getString("matricula"));
			dp.setFuncionario(res.getString("funcionario"));
			dependente.add(dp);
		}
		return dependente;
		
	}
	
	public void removerDependente(String matricula) throws SQLException{
		
		String sql = "DELETE FROM DEPENDENTE WHERE MATRICULA=?";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		
		stmt.setString(1, matricula);
		stmt.execute();
		this.conexao.close();
	}

}
