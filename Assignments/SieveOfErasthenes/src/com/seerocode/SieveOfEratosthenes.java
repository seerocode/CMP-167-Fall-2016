package com.seerocode;

import java.util.Arrays;

public class SieveOfEratosthenes {
	
	public static boolean[] sieve(int n) {
		
	    boolean[] isPrimeNum = new boolean[n + 1]; // + 1 to be inclusive of n, otherwise will not include n
	    isPrimeNum[0] = false;
	    isPrimeNum[1] = false;
	    for (int i = 2; i < n; i++) { //loops through boolean array starting at two because 0 and 1 are not prime
	        isPrimeNum[i] = true; // the number at index i will be true if its prime
	    }

	    //loops through array and checks if the counter
	    // is less than the square root of n
	    for (int num = 2; num < Math.sqrt(n); num++) { 
	        if (isPrimeNum[num]) { //when num is in the isPrimeNum boolean array
	        	
	            for (int multipleOfNum = 2 * num; multipleOfNum < n; multipleOfNum = multipleOfNum + num) { 
	                isPrimeNum[multipleOfNum] = false;
	            }
	        }

	    }
	    return isPrimeNum;
	}

	public static void main(String[] args) {
		System.out.print(Arrays.toString(sieve(6)));

	}

}
