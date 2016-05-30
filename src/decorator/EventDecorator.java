package decorator;

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
	public String getDataInicial() {
		return event.getDataInicial();
	}
	
	@Override
	public String getObservacao() {
		return event.getObservacao();
	}
	
	@Override
	public String getDataFinal() {
		return event.getDataFinal();
	}
}
