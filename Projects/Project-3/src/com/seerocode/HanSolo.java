package com.seerocode;

import java.util.Arrays;

public class HanSolo {
	
	private String name;
	private String spouse;
	private String[] children;
	private static String[] affiliation = { "Rebel Alliance", "New Republic", "Resistance" };

	public HanSolo(String name) {
		this.name = name;
	}
	
	//Overrides .toString which would otherwise return classname + "@" + a hashcode
	public String toString() {
        return this.name;
    }
	
	//setter
	public void setSpouse(String spouse) { 
		this.spouse = spouse;
	}
	
	//setter
	public void setChildren(String[] children) {
		this.children = children;
	}

	public static String listAffiliation() {
		return Arrays.toString(affiliation);

		//Alternate method for printing array provide method is changed to void
//		System.out.println(Arrays.toString(affiliations));
		
		//Alternate method to print array provided method is changed to void
//		for(int i = 0; i < affiliations.length; i++) {
//			System.out.println(affiliations[i]);
//		}
		
		//REMINDER: The following does not work because Java does not work this way.
//		for(String affiliation: affiliations) {
//			System.out.println(affiliation);
//		}
	}

}
