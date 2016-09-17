
public class Time {

	public static void main(String[] args) {
		
		double hour = 22.0; //Represents 9 PM
		double minute = 5.0; //Represents 9:05 PM
		double second = 33.0; //Represents 9:05:33 PM
		
		final double SEC_IN_MIN = 60.0; //Made final because the amount of seconds in a minute does not change
		final double SEC_IN_HOUR = 3600.0; //Made final for the same reason above. 
		
		final double SEC_SINCE_MN = (SEC_IN_HOUR * hour) + (SEC_IN_MIN * minute) + second; //Calculates the seconds since midnight, or 00:00
		final double SEC_IN_DAY = 24.0 * SEC_IN_HOUR; //Calculates the amount of seconds in a day; 24 stands for the hours in a day
		
		System.out.printf("The number of seconds since midnight is: %.0f\n", SEC_SINCE_MN);
		System.out.printf("The number of seconds remaining in the day is: %.0f\n", SEC_IN_DAY - SEC_SINCE_MN);
		System.out.printf("The percentage of the day that has passed is: %.0f%%", (100 * SEC_SINCE_MN) / SEC_IN_DAY); // Escape percent sign is %% 100 * to remove decimal value

	}

}
