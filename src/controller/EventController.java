package controller;

import model.EventModel;

public class EventController {
	
	public EventModel newEvent(String dataInicial, String dataFinal, String observação, String tipoEvento, int matriculaProfissional){
		EventModel event;
		
		event = new EventModel(dataInicial,  dataFinal,  observação,  tipoEvento, matriculaProfissional);
		
		return event;
	}
}
