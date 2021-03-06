package com.seerocode;

import java.time.LocalTime;

public class CurrentTime{

	public static void main(String[] args) {
		
		LocalTime lt = LocalTime.now();
		
		int hour = lt.getHour(); //Gets current system hour
		int minute = lt.getMinute(); //Gets current minute
		int second = lt.getSecond(); //Gets current second
		
		final int SEC_IN_MIN = 60; //Made final because the amount of seconds in a minute does not change
		final int SEC_IN_HOUR = 3600; //Made final for the same reason above
		
		final int SEC_SINCE_MN = (SEC_IN_HOUR * hour) + (SEC_IN_MIN * minute) + second; //Calculates the seconds since midnight, or 00:00
		final int SEC_IN_DAY = 24 * SEC_IN_HOUR; //Calculates the amount of seconds in a day; 24 stands for the hours in a day
		
		// The comma in %d, adds a comma to output
		System.out.printf("The number of seconds since midnight is: %,d\n", SEC_SINCE_MN);
		System.out.printf("The number of seconds remaining in the day is: %,d\n", SEC_IN_DAY - SEC_SINCE_MN);
		// Escape percent sign is %%. Added format specifier %.0f since 100.0 is now read as a double number and not an integer as well as to round to the nearest whole number
		System.out.printf("The percentage of the day that has passed is: %.0f%%", (SEC_SINCE_MN * 100.0) / SEC_IN_DAY); 

	}

}
