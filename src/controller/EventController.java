package controller;

import dao.EmployeeDao;
import dao.EventDao;
import model.EventModel;

public class EventController {
	
	public EventModel newEvent(String dataInicial, String dataFinal, String observação, String tipoEvento, String matriculaProfissional){
		EventModel event;
		
		event = new EventModel(dataInicial,  dataFinal,  observação,  tipoEvento, matriculaProfissional);
		
		return event;
	}
	
	public void addEvent(EventModel event){
		EventDao dao = new EventDao();
		dao.addEvent(event);
	}
}
