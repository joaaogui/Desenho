package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ComplementaryDataModel;

public class ComplementaryDataDao {
	
	private Connection connection;

	public void ComplementaryDataController(){
		this.connection = new Dao().getConnection();
	}
	
	String sql = "INSERT INTO employee(nacionalidade, naturalidade, UF, raca, pisPasep, emissaoPis, tituloEleitoral, zonaEleitoral, estadoCivil, nomeConjuge, nomePai, nomeMae) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public void save(ComplementaryDataModel complementaryData){
		try{
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, complementaryData.getNacionalidade()); 
			stmt.setString(2, complementaryData.getNaturalidade());            
			stmt.setString(3, complementaryData.getUF());            
			stmt.setString(4, complementaryData.getRaca());
			stmt.setString(5, complementaryData.getPisPasep());
			stmt.setString(6, complementaryData.getEmissaoPis());
			stmt.setString(7, complementaryData.getTituloEleitoral());
			stmt.setString(8, complementaryData.getZonaEleitoral());
			stmt.setString(9, complementaryData.getEstadoCivil());
			stmt.setString(10, complementaryData.getNomeConjuge());
			stmt.setString(11, complementaryData.getNomePai());
			stmt.setString(12, complementaryData.getNomeMae());
			stmt.execute();            
			stmt.close(); 
		}
		catch (SQLException u) { 
			throw new RuntimeException(u);         
		}
	}
	
}
