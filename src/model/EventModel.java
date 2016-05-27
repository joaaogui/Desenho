package model;

public class EventModel {
	
	private String dataInicial;
	private String dataFinal;
	private String observação;
	private String tipoEvento;
	private int matriculaProfissional;
	
	public EventModel(String dataInicial, String dataFinal, String observação, String tipoEvento, int matriculaProfissional){
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.observação = observação;
		this.tipoEvento = tipoEvento;
		this.matriculaProfissional = matriculaProfissional;
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

	public int getMatriculaProfissional() {
		return matriculaProfissional;
	}

	public void setMatriculaProfissional(int matriculaProfissional) {
		this.matriculaProfissional = matriculaProfissional;
	}
	
	

}
