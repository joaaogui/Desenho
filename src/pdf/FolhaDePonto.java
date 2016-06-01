package pdf;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class FolhaDePonto {
    public static void main(String[] args) throws Exception {
    	Document doc = null;
    	OutputStream os = null;
    	
    	try{
    		
    		doc = new Document(PageSize.A4, 72, 72, 72, 72);
    		
    		os = new FileOutputStream("Folha De Ponto.pdf");
    		
            PdfWriter.getInstance(doc, os);
            
            doc.open();
            
            Paragraph p = new Paragraph("Folsdha De Ponto");
            doc.add(p);
            
            
    	
    	}
    	finally{
    		if (doc != null) {
                doc.close();
            }
            if (os != null) {
            	os.close();
            }
    	}
    	
    }
}