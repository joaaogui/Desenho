package decorator;

import java.util.Calendar;

import model.EventModel;

public abstract class EventDecorator extends EventModel{

	EventModel event;
	
	public EventDecorator(EventModel typeEvent){
		event = typeEvent;
	}
	
	@Override
	public int getId() {
		return event.getId();
	}
	
	@Override
	public String getNomeEvento() {
		return event.getNomeEvento();
	}
	
	@Override
	public Calendar getDataInicial() {
		return event.getDataInicial();
	}
	
	@Override
	public String getObservacao() {
		return event.getObservacao();
	}
	
	@Override
	public Calendar getDataFinal() {
		return event.getDataFinal();
	}
}
