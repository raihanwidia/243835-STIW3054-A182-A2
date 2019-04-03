package com.STIW3054.assigment2;


public class App 
{

    public static void main(String[] args) throws InterruptedException {

    	
    	ScanningPDF namefile  = new ScanningPDF("e:/Project GITHUB/assigment2/A182 Draft Stud.pdf");
        String data1 = namefile.getAllContent();
        Thread mainThread = Thread.currentThread();

    	CalculateCourses e = new CalculateCourses(data1);
    	CalculateExamDays d = new CalculateExamDays(data1);
    	ListSocCourses b = new ListSocCourses(data1);
    	DisplaySTIW3054 a = new DisplaySTIW3054(data1);
    	CalculateSOCCourses c = new CalculateSOCCourses(data1);
    	
    	Thread task1 = new Thread(e);
		task1.setName("Thread-1 : Calculate the total number of course");
		Thread task2 = new Thread(d);
		task2.setName("Thread-2 : Calculate the total number of days");
		Thread task3 = new Thread(b);
		task3.setName("Thread-3 : List of courses from SOC");
		Thread task4 = new Thread(c);
		task4.setName("Thread-4 : Calculate the number of courses from SOC");
    	Thread task5 = new Thread(a);
		task5.setName("Thread-5 : Display the information of STIW3054 (Bil, Code, Course, date and time)");
		
		task1.start();
		mainThread.sleep(2000);
		task2.start();
		mainThread.sleep(2000);
		task4.start();
		mainThread.sleep(2000);
		task3.start();
		mainThread.sleep(2000);
		task5.start();
		

		
		
		
		
		
		
    	
    	
    	
 
    }

}
