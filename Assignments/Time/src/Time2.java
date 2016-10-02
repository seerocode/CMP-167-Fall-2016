
public class Time2{

	public static void main(String[] args) {
		
		int hour = 21; //Represents 9 PM
		int minute = 5; //Represents 9:05 PM
		int second = 33; //Represents 9:05:33 PM
		
		final int SEC_IN_MIN = 60; //Made final because the amount of seconds in a minute does not change
		final int SEC_IN_HOUR = 3600; //Made final for the same reason above
		
		final int SEC_SINCE_MN = (SEC_IN_HOUR * hour) + (SEC_IN_MIN * minute) + second; //Calculates the seconds since midnight, or 00:00
		final int SEC_IN_DAY = 24 * SEC_IN_HOUR; //Calculates the amount of seconds in a day; 24 stands for the hours in a day
		
		// The comma in %d, adds a comma to output
		System.out.printf("The number of seconds since midnight is: %,d\n", SEC_SINCE_MN);
		System.out.printf("The number of seconds remaining in the day is: %,d\n", SEC_IN_DAY - SEC_SINCE_MN);
		// Escape percent sign is %%. Math.round rounds output to nearest whole integer, change specifier to %d for integer
		//Otherwise, output will be 87.885417% if Math.round is not used
		System.out.printf("The percentage of the day that has passed is: %d%%", Math.round((SEC_SINCE_MN * 100.0) / SEC_IN_DAY)); 

	}

}