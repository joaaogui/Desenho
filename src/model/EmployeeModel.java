package model;


public class EmployeeModel {
	
	public String nome;
	public String matricula;
	public String tipo;
	public String admissao;
	public String dataNascimento;
	public String sexo;
	public String RG;
	public String orgaoRG;
	public String CPF;
	
	
	public EmployeeContactModel contato;
	public complementaryDataModel dadosComplementares;
	public academicDataModel dadosAcademicos;
	public functionalDataModel dadosFuncionais;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAdmissao() {
		return admissao;
	}
	public void setAdmissao(String string) {
		this.admissao = string;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String string) {
		this.dataNascimento = string;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getOrgaoRG() {
		return orgaoRG;
	}
	public void setOrgaoRG(String orgaoRG) {
		this.orgaoRG = orgaoRG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public EmployeeContactModel getContato() {
		return contato;
	}
	public void setContato(EmployeeContactModel contato) {
		this.contato = contato;
	}
	public complementaryDataModel getDadosComplementares() {
		return dadosComplementares;
	}
	public void setDadosComplementares(complementaryDataModel dadosComplementares) {
		this.dadosComplementares = dadosComplementares;
	}
	public academicDataModel getDadosAcademicos() {
		return dadosAcademicos;
	}
	public void setDadosAcademicos(academicDataModel dadosAcademicos) {
		this.dadosAcademicos = dadosAcademicos;
	}
	public functionalDataModel getDadosFuncionais() {
		return dadosFuncionais;
	}
	public void setDadosFuncionais(functionalDataModel dadosFuncionais) {
		this.dadosFuncionais = dadosFuncionais;
	}
	
	
	
	
}