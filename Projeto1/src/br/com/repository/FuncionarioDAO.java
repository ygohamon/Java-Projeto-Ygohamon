package br.com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.conexao.ConectionFactory;
import br.com.modelo.Funcionario;

public class FuncionarioDAO {
	public Connection conexao;
	
	public FuncionarioDAO(){
		this.conexao = ConectionFactory.getConnection();
	}
	
	public void salvar(Funcionario funcionario) throws SQLException{
		
		String sql = "INSERT INTO FUNCIONARIO (NOME, SALARIO, MATRICULA, EMAIL, DEPARTAMENTO, CARGO, TELEFONE) VALUES (?,?,?,?,?,?,?)";
		try {
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		stmt.setString(1, funcionario.getNome());
		stmt.setDouble(2, funcionario.getSalario());
		stmt.setString(3, funcionario.getMatricula());
		stmt.setString(4, funcionario.getEmail());
		stmt.setString(5, funcionario.getDepartamento());
		stmt.setString(6, funcionario.getCargo());
		stmt.setString(7, funcionario.getTelefones());
		stmt.execute();
		stmt.close();
		//this.conexao.close();
		} catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public void procurar (Funcionario funcionario) throws SQLException{
		
		String sql = "SELECT * FROM FUNCIONARIO";
		 this.conexao = ConectionFactory.getConnection();
		 PreparedStatement stmt = this.conexao.prepareStatement(sql);
		 ResultSet rs = stmt.executeQuery();
		 while(rs.next()){
			stmt.setString(1, funcionario.getNome());
			stmt.setDouble(2, funcionario.getSalario());
			stmt.setString(3, funcionario.getMatricula());
			stmt.setString(4, funcionario.getEmail());
			stmt.setString(5, funcionario.getDepartamento());
			stmt.setString(6, funcionario.getCargo());
			stmt.setString(7, funcionario.getTelefones());
		 }
				 
		 rs.close();
		 stmt.close();
		 conexao.close();
	}
	
	public List<Funcionario> listaFuncionario() throws SQLException{
		List<Funcionario> funcionarios = new ArrayList<>();
		String sql = "SELECT * FROM FUNCIONARIO";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		ResultSet res =stmt.executeQuery();
		
		while(res.next()){
			Funcionario f = new Funcionario();
			f.setId(res.getLong("id"));
			f.setNome(res.getString("nome"));
			f.setSalario(res.getDouble("salario"));
			f.setMatricula(res.getString("matricula"));
			f.setEmail(res.getString("email"));
			f.setDepartamento(res.getString("departamento"));
			f.setCargo(res.getString("cargo"));
			f.setTelefones(res.getString("telefone"));
			funcionarios.add(f);
		}
		return funcionarios;
		
	}
	
	
	
	public void removerFuncionario(String matricula) throws SQLException{
		
		String sql = "DELETE FROM FUNCIONARIO WHERE MATRICULA=?";
		PreparedStatement stmt = this.conexao.prepareStatement(sql);
		
		stmt.setString(1, matricula);
		stmt.execute();
		this.conexao.close();
	}
	
}
