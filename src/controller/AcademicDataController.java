package controller;

import dao.AcademicDataDao;
import model.AcademicDataModel;

public class AcademicDataController {
	
	private AcademicDataDao academicDataDao;
	
	public AcademicDataController(){
		academicDataDao = new AcademicDataDao();
	}
	
	public void setAcademicDataDao(AcademicDataDao academicDataDao){
		this.academicDataDao = academicDataDao;
	}
	
	public AcademicDataModel newAcademicData(String escolaridade, String curso, String licenciatura, String instituicao, String posGraduacao){
		
		AcademicDataModel academicData;
		
		academicData = new AcademicDataModel(escolaridade, curso, licenciatura, instituicao, posGraduacao);
		
		return academicData;
		
	}
	
	public void saveAcademicModel(AcademicDataModel academicData){
		academicDataDao.save(academicData);
	}
}
