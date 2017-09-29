package br.com.principal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.modelo.Departamento;
import br.com.modelo.Dependente;
import br.com.modelo.Funcionario;
import br.com.service.DepartamentoService;
import br.com.service.DependenteService;
import br.com.service.FuncionarioService;

public class Principal {
	public static void main(String[] args) throws SQLException {
		
		Funcionario funcionario1 = new Funcionario();
		FuncionarioService fs = new FuncionarioService();
		funcionario1.setNome("Ygo");
		funcionario1.setSalario(2500);
		funcionario1.setMatricula("123123123");
		funcionario1.setEmail("asd@gmail.com");
		funcionario1.setDepartamento("02");
		funcionario1.setCargo("Junior");
		funcionario1.setTelefones("83983335555");
		fs.salvar(funcionario1);
		
		System.out.println("Funcionario salvo");
		List<Funcionario> listaDoBD = new ArrayList<>();
		fs.listFuncionarios();
		
		for(Funcionario f : listaDoBD){
			System.out.println(">>>" + f.getId());
			System.out.println(">>>" + f.getNome());
			System.out.println(">>>" + f.getSalario());
			System.out.println(">>>" + f.getMatricula());
			System.out.println(">>>" + f.getEmail());
			System.out.println(">>>" + f.getDepartamento());
			System.out.println(">>>" + f.getCargo());
			System.out.println(">>>" + f.getTelefones());
		}
		
		Departamento departamento1 = new Departamento();
		DepartamentoService dp = new DepartamentoService();
		departamento1.setNome("TI");
		departamento1.setNumero("02");
		dp.salvar(departamento1);
		
		System.out.println("Departamento salvo");
		List<Departamento> listaDoBD1 = new ArrayList<>();
		dp.listDepartamento();
		
		for(Departamento dd : listaDoBD1) {
			System.out.println(">>>" + dd.getId());
			System.out.println(">>>" + dd.getNome());
			System.out.println(">>>" + dd.getNumero());
		}
		
		Dependente dependente1 = new Dependente();
		DependenteService dd = new DependenteService();
		dependente1.setNome("Mãe");
		dependente1.setMatricula("123123123");
		dependente1.setFuncionario("ygo");
		dd.salvar(dependente1);
		
		System.out.println("Dependente Salvo");
		List<Dependente> listaDoBD2 = new ArrayList<>();
		dd.listDependente();
		
		for(Dependente dpd : listaDoBD2) {
			System.out.println(">>>" + dpd.getId());
			System.out.println(">>>" + dpd.getNome());
			System.out.println(">>>" + dpd.getMatricula());
			System.out.println(">>>" + dpd.getFuncionario());
		}
		}
	}
