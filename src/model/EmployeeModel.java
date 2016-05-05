package model;
import javax.persistence.*;

@Entity
public class EmployeeModel {
	
	@Id
	@GeneratedValue
	@Column  
	public int id;
	@Column
	public String nome;
	@Column
	public String matricula;
	@Column
	public String tipo;
	@Column
	public String admissao;
	@Column
	public String dataNascimento;
	@Column
	public String sexo;
	@Column
	public String rg;
	@Column
	public String orgaoRG;
	@Column
	public String cpf;
	
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	public EmployeeContactModel contato;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	public ComplementaryDataModel dadosComplementares;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	public AcademicDataModel dadosAcademicos;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	public FunctionalDataModel dadosFuncionais;
	
	/**
	public EmployeeModel(String nome, String matricula, String tipo, String admissao, String dataNascimento,
						 String sexo, String RG, String orgaoRG, String CPF, EmployeeContactModel contato, 
						 ComplementaryDataModel dadosComplementares, AcademicDataModel dadosAcademicos, FunctionalDataModel dadosFuncionais) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		this.admissao = admissao;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.RG = RG;
		this.orgaoRG = orgaoRG;
		this.CPF = CPF;
		
	}
	*/	
	
	public EmployeeModel(String nome, String matricula, String tipo, String admissao, String dataNascimento,
			String sexo, String rg, String orgaoRG, String cpf, EmployeeContactModel contato,
			ComplementaryDataModel dadosComplementares, AcademicDataModel dadosAcademicos,
			FunctionalDataModel dadosFuncionais) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		this.admissao = admissao;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rg = rg;
		this.orgaoRG = orgaoRG;
		this.cpf = cpf;
		this.contato = contato;
		this.dadosComplementares = dadosComplementares;
		this.dadosAcademicos = dadosAcademicos;
		this.dadosFuncionais = dadosFuncionais;
	}

		
	public EmployeeModel(String nome, String matricula, String tipo, String admissao, String dataNascimento,
			String sexo, String rg, String orgaoRG, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.tipo = tipo;
		this.admissao = admissao;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rg = rg;
		this.orgaoRG = orgaoRG;
		this.cpf = cpf;
	}



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
		return rg;
	}
	public void setRG(String rg) {
		this.rg = rg;
	}
	public String getOrgaoRG() {
		return orgaoRG;
	}
	public void setOrgaoRG(String orgaoRG) {
		this.orgaoRG = orgaoRG;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public EmployeeContactModel getContato() {
		return contato;
	}
	public void setContato(EmployeeContactModel contato) {
		this.contato = contato;
	}
	public ComplementaryDataModel getDadosComplementares() {
		return dadosComplementares;
	}
	public void setDadosComplementares(ComplementaryDataModel dadosComplementares) {
		this.dadosComplementares = dadosComplementares;
	}
	public AcademicDataModel getDadosAcademicos() {
		return dadosAcademicos;
	}
	public void setDadosAcademicos(AcademicDataModel dadosAcademicos) {
		this.dadosAcademicos = dadosAcademicos;
	}
	public FunctionalDataModel getDadosFuncionais() {
		return dadosFuncionais;
	}
	public void setDadosFuncionais(FunctionalDataModel dadosFuncionais) {
		this.dadosFuncionais = dadosFuncionais;
	}
	
	
	
	
}