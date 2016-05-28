package controller;

import dao.EmployeeDao;
import dao.EventDao;
import model.EventModel;

public class EventController {
	
	public EventModel newEvent(int id, String dataInicial, String dataFinal, String observacao, String tipoEvento, String matriculaProfissional){
		EventModel event;
		
		event = new EventModel(id, dataInicial,  dataFinal,  observacao,  tipoEvento, matriculaProfissional);
		
		return event;
	}
	
	public void addEvent(EventModel event){
		EventDao dao = new EventDao();
		dao.addEvent(event);
	}
}
