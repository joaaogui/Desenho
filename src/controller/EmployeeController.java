package controller;

import dao.EmployeeDao;
import model.EmployeeModel;




public class EmployeeController {

	private EmployeeDao employeeDao;
	
	public EmployeeController(){
		employeeDao = new EmployeeDao();
		
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	 
	public EmployeeModel newEmployee(String nome, String matricula, String tipo, String admissao, String dataNascimento,
									 String sexo, String RG, String orgaoRG, String CPF){

		EmployeeModel employee;
			employee = new EmployeeModel(nome, matricula, tipo, admissao, dataNascimento, sexo, RG, orgaoRG, CPF);
	
		return employee;
	}
	
	public void addEmployee(EmployeeModel employee){      
		employeeDao.save(employee);
	} 
}
