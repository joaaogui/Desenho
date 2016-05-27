package model;

public class EventModel {
	
	private String dataInicial;
	private String dataFinal;
	private String observa��o;
	private String tipoEvento;
	private int matriculaProfissional;
	
	public EventModel(String dataInicial, String dataFinal, String observa��o, String tipoEvento, int matriculaProfissional){
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

	public int getMatriculaProfissional() {
		return matriculaProfissional;
	}

	public void setMatriculaProfissional(int matriculaProfissional) {
		this.matriculaProfissional = matriculaProfissional;
	}
	
	

}
