package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FunctionalDataModel {
	
	@Id
	@GeneratedValue
	int id;
	@Column
	public String cargo;
	@Column
	public String disciplinaDeConcurso;
	@Column
	public String funcao;
	@Column
	public String entrada;
	@Column
	public String saida;
	@Column
	public String copiExterna;
	
	
	
	public FunctionalDataModel(String cargo, String disciplinaDeConcurso, String funcao, String entrada, String saida,
			String copiExterna) {
		this.cargo = cargo;
		this.disciplinaDeConcurso = disciplinaDeConcurso;
		this.funcao = funcao;
		this.entrada = entrada;
		this.saida = saida;
		this.copiExterna = copiExterna;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDisciplinaDeConcurso() {
		return disciplinaDeConcurso;
	}
	public void setDisciplinaDeConcurso(String disciplinaDeConcurso) {
		this.disciplinaDeConcurso = disciplinaDeConcurso;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public String getCopiExterna() {
		return copiExterna;
	}
	public void setCOPIExterna(String copiExterna) {
		this.copiExterna = copiExterna;
	}
	
	
	
}
