package dao;
// faz as importa��es de classes necess�rias para o funcionamento do programa 
import java.sql.Connection; // conex�o SQL para Java 
import java.sql.DriverManager; // driver de conex�o SQL para Java 
import java.sql.SQLException; // classe para tratamento de exce��es 

public class Dao {     
	public Connection getConnection() {
		
		try {             
			return DriverManager.getConnection("jdbc:mysql://localhost/sgp","root","root");         
			}         
		catch(SQLException excecao) {             
			throw new RuntimeException(excecao);         
			}     
		} 
	}

