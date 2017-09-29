package br.com.service;

import java.sql.SQLException;
import java.util.List;

import br.com.modelo.Email;
import br.com.repository.EmailDAO;



public class EmailService {
	
	private EmailDAO EmailDAO;
	private String Descrição;
	
	public EmailService (){
		this.EmailDAO = new EmailDAO();
	}
	
	public void salvar(Email email) throws SQLException{
		this.EmailDAO.salvar(email);
	}

	public List<Email> listEmail() throws SQLException{
		return this.EmailDAO.listaEmail();	
	}
	
	public void RemoverEmail(Email email) throws SQLException{
		this.EmailDAO.removerEmail(Descrição);
	}
}
