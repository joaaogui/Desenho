package model;

public class EventModel {
	
	private String dataInicial;
	private String dataFinal;
	private String observa��o;
	private String tipoEvento;
	private String matriculaProfissional;
	
	public EventModel(){
		
	}
	
	public EventModel(String dataInicial, String dataFinal, String observa��o, String tipoEvento, String matriculaProfissional){
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.observa��o = observa��o;
		this.tipoEvento = tipoEvento;
		this.matriculaProfissional = matriculaProfissional;
	}
	
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getObserva��o() {
		return observa��o;
	}
	public void setObserva��o(String observa��o) {
		this.observa��o = observa��o;
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

	public String getMatriculaProfissional() {
		return matriculaProfissional;
	}

	public void setMatriculaProfissional(String matriculaProfissional) {
		this.matriculaProfissional = matriculaProfissional;
	}
	
	

}
