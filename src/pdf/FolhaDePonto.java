package pdf;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import model.EmployeeModel;

public class FolhaDePonto {
	
	public static void generatePDF(String mesFolha, String anoFolha, String observacaoFolha, EmployeeModel employee) throws DocumentException, MalformedURLException, IOException{
		Document doc = null;
    	OutputStream os = null;
    	
    	try{
    		
    		doc = new Document(PageSize.A4, 1, 1, 50, 20);    		
    		os = new FileOutputStream("Folha De Ponto.pdf");
            PdfWriter.getInstance(doc, os);     
            doc.open();
            
            Image img = Image.getInstance("src/resources/logoFolhaDePonto.PNG");
            img.setAlignment(Element.ALIGN_CENTER); 
            img.scaleToFit(400f, 400f);
            doc.add(img); 
            
            Font f = new Font(FontFamily.HELVETICA , 14);
            Font fbold = new Font(FontFamily.HELVETICA , 14, Font.BOLD);

            PdfPTable table = new PdfPTable(new float[] { 0.2f, 0.4f, 0.2f, 0.2f });
            
            PdfPCell header = new PdfPCell(new Paragraph("Folha De Ponto", fbold));
            header.setColspan(2);
            header.setBackgroundColor(BaseColor.LIGHT_GRAY);
            
            PdfPCell mesCell = new PdfPCell(new Paragraph("Mês De Referência", fbold));   
            mesCell.setBackgroundColor(BaseColor.LIGHT_GRAY);              
            
            PdfPCell background = new PdfPCell(new Paragraph(mesFolha));
            background.setBackgroundColor(BaseColor.LIGHT_GRAY); 
            
            table.addCell(header);
            table.addCell(mesCell);
            table.addCell(background);
            
            PdfPCell nome = new PdfPCell(new Paragraph("Nome", fbold));
            nome.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(nome);
            PdfPCell nomeEntrada = new PdfPCell(new Paragraph(employee.getNome(), f));
            nomeEntrada.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(nomeEntrada);
            
            PdfPCell matriculaCell = new PdfPCell(new Paragraph("Matrícula", fbold));
            matriculaCell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(matriculaCell);
            PdfPCell matriculaEntrada = new PdfPCell(new Paragraph(employee.getMatricula(), f));
            matriculaEntrada.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(matriculaEntrada);
            
            PdfPCell cargo = new PdfPCell(new Paragraph("Cargo", fbold));
            cargo.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cargo);
            PdfPCell cargoEntrada = new PdfPCell(new Paragraph("", f));
            cargoEntrada.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cargoEntrada);
            
            PdfPCell funcao = new PdfPCell(new Paragraph("Função", fbold));
            funcao.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(funcao);
            PdfPCell funcaoEntrada = new PdfPCell(new Paragraph("", f));
            funcaoEntrada.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(funcaoEntrada);
            
            PdfPCell dia = new PdfPCell(new Paragraph("Dia", fbold));
            dia.setBackgroundColor(BaseColor.GRAY);
            table.addCell(dia);
            
            PdfPCell assinatura = new PdfPCell(new Paragraph("Assinatura", fbold));
            assinatura.setBackgroundColor(BaseColor.GRAY);
            table.addCell(assinatura);
            
            PdfPCell horaDeEntrada = new PdfPCell(new Paragraph("Hora De Entrada", fbold));
            horaDeEntrada.setBackgroundColor(BaseColor.GRAY);
            table.addCell(horaDeEntrada);
            
            PdfPCell horaDeSaida = new PdfPCell(new Paragraph("Hora De Saída", fbold));
            horaDeSaida.setBackgroundColor(BaseColor.GRAY);
            table.addCell(horaDeSaida);
            
            for(int i= 1 ; i<32; i++){
            	PdfPCell dias = new PdfPCell(new Paragraph(String.valueOf(i) , fbold));
            	dias.setVerticalAlignment(Element.ALIGN_MIDDLE);
                table.addCell(dias);
                table.addCell("");
                table.addCell("");
                table.addCell("");
            }
            
            PdfPCell observacoes = new PdfPCell(new Paragraph("Observações", fbold));
            observacoes.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(observacoes);
            
            PdfPCell observacoesEntrada = new PdfPCell(new Paragraph(observacaoFolha));
            observacoesEntrada.setBackgroundColor(BaseColor.LIGHT_GRAY);
            observacoesEntrada.setColspan(3);
            table.addCell(observacoesEntrada);
            
            doc.add(table);
            doc.close();
            
            File file = new File("Folha De Ponto.pdf");
            Desktop.getDesktop().open(file);
           
            
        
    	}
    	finally{
    		/*if (doc != null) {
    
                
            }
            if (os != null) {
 
               os.close();
            }
            */
    	}
	}
    public static void main(String[] args) throws Exception {
    		
    }
}