/**
 * 
 * 
 * 
 * 
 *

 * author :aman kumar
 * 
 * 
 * purpose:take command line argument and find windchill
 * 
 * 
 * date:
 */
 package com.bridge;


public class WindChill {


    public static void main(String[] args) {
        double temerature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);
        double windchill = 35.74 + 0.6215*temerature + (0.4275*temerature - 35.75) * Math.pow(velocity, 0.16);
        System.out.println("Temperature = " + temerature);
        System.out.println("Wind speed  = " + velocity);
        System.out.println("Wind chill  = " + windchill);
    }

}



