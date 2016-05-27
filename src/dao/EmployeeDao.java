package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import model.EmployeeModel;

public class EmployeeDao {
	
	private static EmployeeDao instance;
	protected EntityManager entityManager;
	
	public static EmployeeDao getInstance(){
		if(instance == null)
			instance = new EmployeeDao();
		
		return instance;
	}
	
	private void EmployeDao(){
		entityManager = getEntityManager();
	}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		if(entityManager == null){
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public void addEmployee(EmployeeModel employee) {


		entityManager.getTransaction().begin();    
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
	}
	/*
	public EmployeeModel searchEmployee(String matricula){
		
		String SQL = "Select * from Employee where";	
		Query query = (Query) entityManager.createNativeQuery(SQL);
		query.setParameter("matricula", matricula);
		EmployeeModel employee = (EmployeeModel) ((javax.persistence.Query) query).getSingleResult();
		
		return employee;
	}
	*/
}
