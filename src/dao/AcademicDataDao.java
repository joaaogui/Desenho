package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.AcademicDataModel;

public class AcademicDataDao {

	private Connection connection;

	public void AcademicDataController(){
		this.connection = new Dao().getConnection();
	}
		
		String sql = "INSERT INTO employee(escolaridade, curso, licenciatura, instituicao, posGraduacao) VALUES(?,?,?,?,?)"; 
	
		public void save(AcademicDataModel employeeAcademic){
			try {            
				PreparedStatement stmt = connection.prepareStatement(sql); 
				stmt.setString(1, employeeAcademic.getEscolaridade()); 
				stmt.setString(2, employeeAcademic.getCurso());            
				stmt.setString(3, employeeAcademic.getLicenciatura());            
				stmt.setString(4, employeeAcademic.getInstituicao());
				stmt.setString(5, employeeAcademic.getPosGraduacao());
				stmt.execute();            
				stmt.close(); 
				} 
			catch (SQLException u) { 
				throw new RuntimeException(u);         
			}
		}
}
