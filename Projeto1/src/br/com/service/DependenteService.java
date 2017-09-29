package br.com.service;

import java.sql.SQLException;
import java.util.List;

import br.com.modelo.Dependente;
import br.com.repository.DependenteDAO;


public class DependenteService {
	private DependenteDAO DependenteDAO;
	private String Matricula;
	
	public DependenteService (){
		this.DependenteDAO = new DependenteDAO();
	}
	
	public void salvar(Dependente dependente) throws SQLException{
		this.DependenteDAO.salvar(dependente);
	}

	public List<Dependente> listDependente() throws SQLException{
		return this.DependenteDAO.listaDependente();	
	}
	
	public void RemoverDependente(Dependente dependente) throws SQLException{
		this.DependenteDAO.removerDependente(Matricula);
	}
}
