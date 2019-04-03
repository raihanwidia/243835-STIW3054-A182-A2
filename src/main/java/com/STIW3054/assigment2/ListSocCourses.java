package com.STIW3054.assigment2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListSocCourses implements Runnable {
	
	String textExtracted;

	public ListSocCourses(String textExtracted) {
		this.textExtracted = textExtracted;
		
	}
	public void run() {
        String Datesubs = "";
		String regexDate =  "(\\d{1,3}.  ST[IQ][MSANDJKW]\\d{4} .* \\d{1,2}/\\d{1,2}/\\d{4} \\d{2}:\\d{2} )";
        Matcher m = Pattern.compile(regexDate).matcher(textExtracted);
        while (m.find()) {
        	Datesubs +="\n" + m.group().trim();
        }
        System.out.println(Thread.currentThread().getName() +" \n\n "+Datesubs+" \n\n ");	
	}

	
	
}
