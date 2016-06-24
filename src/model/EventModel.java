package model;
import javax.persistence.*;

import java.util.Calendar;

@Entity
public class EventModel {
	
	@Id
	@GeneratedValue
	@Column  
	protected int id;
	@Column
	protected String nomeEvento;
	@Column
	@Temporal(TemporalType.DATE)
	protected Calendar dataInicial;
	@Column
	@Temporal(TemporalType.DATE)
	protected Calendar dataFinal;
	@Column
	protected String observacao;
	
	@JoinColumn(name = "employee", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
	public EmployeeModel employee;
	
	
	public EventModel(){
		
	}
	
	public EventModel(int id, String nomeEvento, Calendar dataInicial, Calendar dataFinal, String observacao){
		this.id = id;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.observacao = observacao;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}
	
	public void setDataInicial(Calendar dataInicial2) {
		this.dataInicial = dataInicial2;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Calendar getDataFinal() {
		return dataFinal;
	}
	
	public void setDataFinal(Calendar dataFinal2) {
		this.dataFinal = dataFinal2;
	}
	
	public EmployeeModel getEmployee(){
		return employee;
	}
	public void setEmployee(EmployeeModel employee){
		this.employee = employee;
	}

}
