package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.EmployeeModel;

public class EmployeeDao {
	public void addEmployee(EmployeeModel employee) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();    
		manager.persist(employee);
		manager.getTransaction().commit();
		
	}
}
