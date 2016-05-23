package model;

public class EventModel {
	
	private String dataInicial;
	private String dataFinal;
	private String observação;
	private String tipoEvento;
	
	public EventModel(String dataInicial, String dataFinal, String observação, String tipoEvento){
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.observação = observação;
		this.tipoEvento = tipoEvento;
	}
	
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getObservação() {
		return observação;
	}
	public void setObservação(String observação) {
		this.observação = observação;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	

}
