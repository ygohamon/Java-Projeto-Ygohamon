package br.com.service;

import java.sql.SQLException;
import java.util.List;

import br.com.modelo.Funcionario;
import br.com.repository.FuncionarioDAO;

public class FuncionarioService {
	private FuncionarioDAO FuncionarioDAO;
	private String matricula;
	
	public FuncionarioService (){
		this.FuncionarioDAO = new FuncionarioDAO();
	}
	
	public void salvar(Funcionario funcionario) throws SQLException{
		this.FuncionarioDAO.salvar(funcionario);
	}

	public List<Funcionario> listFuncionarios() throws SQLException{
		return this.FuncionarioDAO.listaFuncionario();	
	}
	
	public void RemoverFuncionario(Funcionario fucionario) throws SQLException{
		this.FuncionarioDAO.removerFuncionario(matricula);
	}

}
