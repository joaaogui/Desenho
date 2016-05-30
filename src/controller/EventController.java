package controller;

import dao.EmployeeDao;
import dao.EventDao;
import model.EventModel;

public class EventController {
	
	public EventModel newEvent(int id, String nomeEvento, String dataInicial, String dataFinal, String observacao){
		EventModel event;
		
		event = new EventModel(id, nomeEvento, dataInicial,  dataFinal,  observacao);
		
		return event;
	}
	
	public void addEvent(EventModel event){
		EventDao dao = new EventDao();
		dao.addEvent(event);
	}
}
