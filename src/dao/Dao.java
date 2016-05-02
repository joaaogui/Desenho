package dao;
// faz as importações de classes necessárias para o funcionamento do programa 
import java.sql.Connection; // conexão SQL para Java 
import java.sql.DriverManager; // driver de conexão SQL para Java 
import java.sql.SQLException; // classe para tratamento de exceções 

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

