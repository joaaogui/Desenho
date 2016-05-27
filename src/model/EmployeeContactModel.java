package model;
import javax.persistence.*;

@Entity
public class EmployeeContactModel {
	
	
	@Id
	@GeneratedValue
	@Column
	public int id;
	@Column
	public String endereco;
	@Column
	public String bairro;
	@Column
	public String cidade;
	@Column
	public String uf;
	@Column
	public String cep;
	@Column
	public String telFixo;
	@Column
	public String telCelular;
	@Column
	public String email;
	
	public EmployeeContactModel(){
		
	}
	
	public EmployeeContactModel(String endereco, String bairro, String cidade, String uf, String cep, String telFixo,
			String telCelular, String email) {
		super();
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.telFixo = telFixo;
		this.telCelular = telCelular;
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
