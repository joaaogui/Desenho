package model;

public class AcademicDataModel {
	public String escolaridade;
	public String curso;
	public String licenciatura;
	public String instituicao;
	public String posGraduacao;
	
	
	public AcademicDataModel(String escolaridade, String curso, String licenciatura, String instituicao,
			String posGraduacao) {
		this.escolaridade = escolaridade;
		this.curso = curso;
		this.licenciatura = licenciatura;
		this.instituicao = instituicao;
		this.posGraduacao = posGraduacao;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getLicenciatura() {
		return licenciatura;
	}
	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getPosGraduacao() {
		return posGraduacao;
	}
	public void setPosGraduacao(String posGraduacao) {
		this.posGraduacao = posGraduacao;
	}
	
	
	
}
