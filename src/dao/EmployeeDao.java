package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.EmployeeModel;

public class EmployeeDao {

	private Connection connection;
	
	public void EmployeeController(){       
		this.connection = new Dao().getConnection();     
	} 
	
	String sql = "INSERT INTO employee(nome, matricula, tipo, admissao, dataNascimento, sexo, rg, orgaoRG, cpf) VALUES(?,?,?,?,?,?,?,?,?)"; 
	
	public void save(EmployeeModel employee){
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
