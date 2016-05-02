package model;

public class ComplementaryDataModel {
	public String nacionalidade;
	public String naturalidade;
	public String UF;
	public String raca;
	public String pisPasep;
	public String emissaoPis;
	public String tituloEleitoral;
	public String zonaEleitoral;
	public String estadoCivil;
	public String nomeConjuge;
	public String nomePai;
	public String nomeMae;
	
	public ComplementaryDataModel(String nacionalidade, String naturalidade, String UF, String raca,
			String pisPasep, String emissaoPis, String tituloEleitoral, String zonaEleitoral, String estadoCivil,
			String nomeConjuge, String nomePai, String nomeMae) {
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.UF = UF;
		this.raca = raca;
		this.pisPasep = pisPasep;
		this.emissaoPis = emissaoPis;
		this.tituloEleitoral = tituloEleitoral;
		this.zonaEleitoral = zonaEleitoral;
		this.estadoCivil = estadoCivil;
		this.nomeConjuge = nomeConjuge;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPisPasep() {
		return pisPasep;
	}
	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}
	public String getEmissaoPis() {
		return emissaoPis;
	}
	public void setEmissaoPis(String emissaoPis) {
		this.emissaoPis = emissaoPis;
	}
	public String getTituloEleitoral() {
		return tituloEleitoral;
	}
	public void setTituloEleitoral(String tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}
	public String getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(String znoaEleitoral) {
		this.zonaEleitoral = znoaEleitoral;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNomeConjuge() {
		return nomeConjuge;
	}
	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	
}

