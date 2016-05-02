package controller;

import dao.AcademicDataDao;
import dao.ComplementaryDataDao;
import model.ComplementaryDataModel;

public class ComplementaryDataController {
	
	private ComplementaryDataDao complementaryDataDao;
	
	public ComplementaryDataController(){
		complementaryDataDao = new ComplementaryDataDao();
	}
	
	public void setComplementaryDataDao(ComplementaryDataDao complementaryDataDao){
		this.complementaryDataDao = complementaryDataDao;
	}
	
	public ComplementaryDataModel newComplementaryData(String nacionalidade, String naturalidade, String UF ,String raca, String pisPasep, String emissaoPis, String tituloEleitoral, String zonaEleitoral, String estadoCivil, String nomeConjuge, String nomePai, String nomeMae){
		
		ComplementaryDataModel complementaryData;
		
		complementaryData = new ComplementaryDataModel(nacionalidade, naturalidade, UF ,raca, pisPasep, emissaoPis, tituloEleitoral, zonaEleitoral, estadoCivil, nomeConjuge, nomePai, nomeMae){)
		
		return complementaryData;
	}
}
