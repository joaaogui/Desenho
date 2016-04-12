package controller;

import dao.Dao; 
import model.EmployeeModel; 
import java.sql.*;


public class EmployeeController {

	private Connection connection;     
	Long id;     
	String nome;     
	String cpf;     
	String email;     
	String telefone;     
	
	public EmployeeController(){       
		this.connection = new Dao().getConnection();     
	}     
	public void adiciona(EmployeeModel employee){      
		String sql = "INSERT INTO usuario(nome, matricula, tipo, admissao, dataNascimento, sexo, rg, orgaoRG, cpf) VALUES(?,?,?,?,?,?,?,?,?)"; 
		
		try {            
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, employee.getNome()); 
			stmt.setString(2, employee.getMatricula());            
			stmt.setString(3, employee.getTipo());            
			stmt.setString(4, employee.getAdmissao());
			stmt.setString(5, employee.getDataNascimento()); 
			stmt.setString(6, employee.getSexo());            
			stmt.setString(7, employee.getRG());            
			stmt.setString(8, employee.getOrgaoRG());
			stmt.setString(9, employee.getCPF());
			stmt.execute();            
			stmt.close(); } 
		catch (SQLException u) { 
			throw new RuntimeException(u);         
		}     
	} 
}
