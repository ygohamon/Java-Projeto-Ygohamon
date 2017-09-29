package br.com.service;

import java.sql.SQLException;
import java.util.List;

import br.com.modelo.Departamento;
import br.com.repository.DepartamentoDAO;


public class DepartamentoService {
	
		private DepartamentoDAO DepartamentoDAO;
		private String numero;
		
		public DepartamentoService (){
			this.DepartamentoDAO = new DepartamentoDAO();
		}
		
		public void salvar(Departamento departamento) throws SQLException{
			this.DepartamentoDAO.salvar(departamento);
		}

		public List<Departamento> listDepartamento() throws SQLException{
			return this.DepartamentoDAO.listaDepartamento();	
		}
		
		public void RemoverDepartamento(Departamento departamento) throws SQLException{
			this.DepartamentoDAO.removerDepartamento(numero);
		}



}
