package controller;

import model.EventModel;

public class EventController {
	
	public EventModel newEvent(String dataInicial, String dataFinal, String observa��o, String tipoEvento){
		EventModel event;
		
		event = new EventModel(dataInicial,  dataFinal,  observa��o,  tipoEvento);
		
		return event;
	}
}
