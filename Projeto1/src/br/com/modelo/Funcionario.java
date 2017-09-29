package br.com.modelo;

public class Funcionario {
	private long id;
	public String cargo;
	public String departamento;
	public String Nome;
	public String matricula;
	private double Salario;
	public String email;
	public String telefones;
	
	
public String getCargo() {
		return cargo;
	}
public void setCargo(String cargo) {
		this.cargo = cargo;
	}
public String getDepartamento() {
		return departamento;
	}
public void setDepartamento(String string) {
		this.departamento = string;
	}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	this.Nome = nome;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public double getSalario() {
	return Salario;
}
public void setSalario(double salario) {
	Salario = salario;
}
public String getEmail() {
	return email;
}
public void setEmail(String string) {
	this.email = string;
}
public String getTelefones() {
	return telefones;
}
public void setTelefones(String string) {
	this.telefones = string;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

}
