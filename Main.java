package eddiejaden;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
	
	int secondsPassed = 0;
	
	Timer myTimer = new Timer();
	TimerTask task = new TimerTask(){
		public void run(){
			secondsPassed++;
			System.out.println("Seconds passed:" + secondsPassed);
		}	
	
	public void start(){
		myTimer.scheduleAtFixedRate(task, 1000, 1000);
	
	
	public static void main (String[] args) { ;
		Main mainProject = new Main();
			mainProject.start();
		}
	
	;} ;
	
}

	
		
	
			

	
	
	
			


