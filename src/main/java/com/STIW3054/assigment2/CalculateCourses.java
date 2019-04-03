package com.STIW3054.assigment2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateCourses implements Runnable {
	
	String textExtracted;

	public CalculateCourses(String textExtracted) {
		this.textExtracted = textExtracted;
	}
	
	public void run() {
         int counter = 0;		 
	     String regexDate =  "(\\w{1,3}\\d{4})";
	     Matcher m = Pattern.compile(regexDate).matcher(textExtracted);
	     while (m.find()) {
         	counter++;
	     }
	     System.out.println(Thread.currentThread().getName() +" \n\n "+counter+" \n\n ");
	     
	}
}
