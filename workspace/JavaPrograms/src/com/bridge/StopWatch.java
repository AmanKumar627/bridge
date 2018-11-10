/*
 * 
 * 
 */
 
  package com.bridge;
 

public class StopWatch {
	double startTime = 0;
	double stopTime = 0;
	double eclipsedTime;
   /*
    * 
    *method to start the stopwatch 
    * 
    */
	public void start() {
		startTime = System.currentTimeMillis();

	}
	/*
	 * method to stop the watch
	 * 
	 */

	public void stop() {
		stopTime = System.currentTimeMillis();
	}
	
   /*
    * mehod to find the eclipsed time
    */
	public double eclipsed() {
		eclipsedTime = stopTime - startTime;
		return eclipsedTime;
	}

	// TODO Auto-generated method stu
}
