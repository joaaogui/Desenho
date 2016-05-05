package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.AcademicDataModel;
import model.ComplementaryDataModel;
import model.EmployeeContactModel;
import model.EmployeeModel;
import model.FunctionalDataModel;

public class EmployeeController {

	 	
	public EmployeeModel newEmployee(String nome, String matricula, String tipo, String admissao, String dataNascimento,
			 String sexo, String rg, String orgaoRG, String cpf, EmployeeContactModel contato, ComplementaryDataModel dadosComplementares,
	 		 FunctionalDataModel dadosFuncionais, AcademicDataModel dadosAcademicos){
		EmployeeModel employee;
			employee = new EmployeeModel(nome, matricula, tipo, admissao, dataNascimento, sexo, rg, orgaoRG, cpf, contato, dadosComplementares, dadosAcademicos, dadosFuncionais);
	
		return employee;
	}

	public void addEmployee(EmployeeModel employee) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();    
		manager.persist(employee);
		manager.getTransaction().commit();
		
	}
	
}
