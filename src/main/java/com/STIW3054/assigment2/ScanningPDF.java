package com.STIW3054.assigment2;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;


public class ScanningPDF {
	
	String File;
	PdfReader Reader; 
	int numberOfPages;
	
    ScanningPDF(String FilePDF){
		this.File = FilePDF;
        try {
			this.Reader = new PdfReader(File);
		} catch (IOException e) {
			e.printStackTrace();
		}
		numberOfPages = Reader.getNumberOfPages();
	} 
	public String getAllContent() {
       String textExtracted = "";
       
       for(int i = 0 ;i < numberOfPages ;i++) {
		try {
			textExtracted += PdfTextExtractor.getTextFromPage(Reader, i+1);
		} catch (IOException e) {
			e.printStackTrace();
		}
       }
       
		return textExtracted;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
