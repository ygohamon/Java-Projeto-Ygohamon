package br.com.modelo;

public class Fornecedor {

	public long id;
	public String CNPJ;
	public Endereco Endereco;
	public Telefone Telefone;
	public Email Email;
	public Produto Produto;
	public String Nome;
	public String RSocial;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public Endereco getEndereco() {
		return Endereco;
	}
	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	public Telefone getTelefone() {
		return Telefone;
	}
	public void setTelefone(Telefone telefone) {
		Telefone = telefone;
	}
	public Email getEmail() {
		return Email;
	}
	public void setEmail(Email email) {
		Email = email;
	}
	public Produto getProduto() {
		return Produto;
	}
	public void setProduto(Produto produto) {
		Produto = produto;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getRSocial() {
		return RSocial;
	}
	public void setRSocial(String rSocial) {
		RSocial = rSocial;
	}
	
	
}
