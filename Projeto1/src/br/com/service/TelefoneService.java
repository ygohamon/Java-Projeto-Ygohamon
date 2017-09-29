package br.com.service;

import java.sql.SQLException;
import java.util.List;

import br.com.modelo.Telefone;
import br.com.repository.TelefoneDAO;



public class TelefoneService {
	private TelefoneDAO TelefoneDAO;
	private String Numero;
	
	public TelefoneService(){
		this.TelefoneDAO = new TelefoneDAO();
	}
	
	public void salvar(Telefone telefones) throws SQLException{
		this.TelefoneDAO.salvar(telefones);
	}

	public List<Telefone> listTelefone() throws SQLException{
		return this.TelefoneDAO.listaTelefone();	
	}
	
	public void RemoverTelefone(Telefone telefones) throws SQLException{
		this.TelefoneDAO.removerTelefone(Numero);
	}
}
