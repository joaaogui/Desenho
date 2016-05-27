package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import dao.EmployeeDao;
import model.AcademicDataModel;
import model.ComplementaryDataModel;
import model.EmployeeContactModel;
import model.EmployeeModel;
import model.FunctionalDataModel;

public class EmployeeController {

	 	
	public EmployeeModel newEmployee(String nome, String matricula, String tipo, String admissao, 
									 String dataNascimento, String sexo, String rg, String orgaoRG, 
									 String cpf, EmployeeContactModel contato, ComplementaryDataModel dadosComplementares,
									 FunctionalDataModel dadosFuncionais, AcademicDataModel dadosAcademicos){
		EmployeeModel employee;
			employee = new EmployeeModel(nome, matricula, tipo, admissao, dataNascimento, sexo, rg, orgaoRG, cpf, contato, dadosComplementares, dadosAcademicos, dadosFuncionais);
	
		return employee;
	}

	public void addEmployee(EmployeeModel employee) {
		EmployeeDao dao = new EmployeeDao();
		dao.addEmployee(employee);
	}
	
	public EmployeeModel searchEmployee(String matricula){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
	
		String SQL = "Select * from Employee where";	
		Query query = (Query) manager.createNativeQuery(SQL);
		query.setParameter("matricula", matricula);
		EmployeeModel employee = (EmployeeModel) ((javax.persistence.Query) query).getSingleResult();
		
		return employee;
	}
	
}
