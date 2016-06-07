package controller;

import dao.EventDao;

import java.util.Calendar;
import model.EventModel;

public class EventController {
	
	public EventModel newEvent(int id, String nomeEvento, Calendar dataInicial, Calendar dataFinal, String observacao){
		EventModel event;
		
		event = new EventModel(id, nomeEvento, dataInicial,  dataFinal,  observacao);
		
		return event;
	}
	
	public void addEvent(EventModel event){
		EventDao dao = new EventDao();
		dao.addEvent(event);
	}
}
