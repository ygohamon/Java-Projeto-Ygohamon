package br.com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.conexao.ConectionFactory;
import br.com.modelo.Email;

public class EmailDAO {
		public Connection conexao;
			
			public EmailDAO(){
				this.conexao = ConectionFactory.getConnection();
			}
			
			public void salvar(Email email) throws SQLException{
				
				String sql = "INSERT INTO EMAIL (DESCRICAO) VALUES (?)";
				PreparedStatement stmt = this.conexao.prepareStatement(sql);
				stmt.setString(1, email.getDescrição());
				stmt.execute();
				//this.conexao.close();
			}
			
			public List<Email> listaEmail() throws SQLException{
				List<Email> emails = new ArrayList<>();
				String sql = "SELECT * FROM EMAIL";
				PreparedStatement stmt = this.conexao.prepareStatement(sql);
				ResultSet res =stmt.executeQuery();
				
				while(res.next()){
					Email e = new Email();
					e.setId(res.getLong("id"));
					e.setDescrição(res.getString("Descrição"));
					emails.add(e);
				}
				return emails;
				
			}
			
			public void removerEmail(String Descrição) throws SQLException{
				
				String sql = "DELETE FROM EMAIL WHERE DESCRICAO=?";
				PreparedStatement stmt = this.conexao.prepareStatement(sql);
				
				stmt.setString(1, Descrição);
				stmt.execute();
				this.conexao.close();
			}
		}


