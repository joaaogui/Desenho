package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.EventModel;

public class EventDao {
	public void addEvent(EventModel event){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();    
		manager.persist(event);
		manager.getTransaction().commit();
	}

}
