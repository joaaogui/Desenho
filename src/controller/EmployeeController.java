package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import dao.EmployeeDao;
import model.AcademicDataModel;
import model.ComplementaryDataModel;
import model.EmployeeContactModel;
import model.EmployeeModel;
import model.FunctionalDataModel;

public class EmployeeController {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
	EntityManager entityManager = factory.createEntityManager();
	
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
	
	public EmployeeModel searchEmployeeById(int id){
		
		
		EmployeeModel employee = new EmployeeModel();
		
		employee = entityManager.find(EmployeeModel.class, id);
		
		return employee;
	}
	
	public EmployeeModel searchEmployee(String matricula){
		EmployeeModel employee = new EmployeeModel();
		
		SessionFactory sessionFactory = null;
		
		Session session = sessionFactory.openSession();
		
		employee = (EmployeeModel) session.createCriteria(EmployeeModel.class)
                .add(Restrictions.eq("matricula", matricula)).uniqueResult();
		return employee;
	}
}
