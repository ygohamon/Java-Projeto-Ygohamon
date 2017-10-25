package br.com.modelo;

import java.sql.Date;

public class Produto {

	public long id;
	public String Nome;
	public String Descricao;
	public Categoria Categoria;
	public Date DataTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Categoria getCategoria() {
		return Categoria;
	}
	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	public Date getDataTime() {
		return DataTime;
	}
	public void setDataTime(Date dataTime) {
		DataTime = dataTime;
	}
	
	
}
