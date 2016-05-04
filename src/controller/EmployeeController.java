package controller;

import dao.EmployeeDao;
import model.AcademicDataModel;
import model.ComplementaryDataModel;
import model.EmployeeContactModel;
import model.EmployeeModel;
import model.FunctionalDataModel;

public class EmployeeController {

	private EmployeeDao employeeDao;
	
	public EmployeeController(){
		employeeDao = new EmployeeDao();
		
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	 	
	public EmployeeModel newEmployee(String nome, String matricula, String tipo, String admissao, String dataNascimento,
			 String sexo, String rg, String orgaoRG, String cpf, EmployeeContactModel contato, ComplementaryDataModel dadosComplementares,
	 		 FunctionalDataModel dadosFuncionais, AcademicDataModel dadosAcademicos){
		EmployeeModel employee;
			employee = new EmployeeModel(nome, matricula, tipo, admissao, dataNascimento, sexo, rg, orgaoRG, cpf, contato, dadosComplementares, dadosAcademicos, dadosFuncionais);
	
		return employee;
	}
	
	public void addEmployee(EmployeeModel employee){      
		employeeDao.save(employee);
	} 
}
