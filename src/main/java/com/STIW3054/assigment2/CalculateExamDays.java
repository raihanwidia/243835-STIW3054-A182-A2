package com.STIW3054.assigment2;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateExamDays implements Runnable {
	
	String textExtracted;

	public CalculateExamDays(String textExtracted) {
		this.textExtracted = textExtracted;
	}
	
	public void run() {
		
        String Datesubs = "";
        String regexDate =  "(\\d{1,2}/\\d{1,2}/\\d{4})";
        Matcher m = Pattern.compile(regexDate).matcher(textExtracted);
        
        while (m.find()) {
        	Datesubs +="\n" + m.group().trim();
        }
        String [] date = Datesubs.split("\n");
        date = Arrays.stream(date).distinct().toArray(String[]::new);
        int length =  date.length-1;
        System.out.println(Thread.currentThread().getName() + "  \n\n " +length+" \n\n ");
        
	}
	
	
}
