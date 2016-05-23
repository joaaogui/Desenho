package controller;

import model.EventModel;

public class EventController {
	
	public EventModel newEvent(String dataInicial, String dataFinal, String observação, String tipoEvento){
		EventModel event;
		
		event = new EventModel(dataInicial,  dataFinal,  observação,  tipoEvento);
		
		return event;
	}
}
