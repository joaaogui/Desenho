package model;
import javax.persistence.*;

@Entity
public class EventModel {
	
	@Id
	@GeneratedValue
	@Column  
	private int id;
	@Column
	private String dataInicial;
	@Column
	private String dataFinal;
	@Column
	private String observacao;
	@Column
	private String tipoEvento;
	@Column
	private String matriculaProfissional;
	
	public EventModel(){
		
	}
	
	public EventModel(int id, String dataInicial, String dataFinal, String observacao, String tipoEvento, String matriculaProfissional){
		this.id = id;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.observacao = observacao;
		this.tipoEvento = tipoEvento;
		this.matriculaProfissional = matriculaProfissional;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
