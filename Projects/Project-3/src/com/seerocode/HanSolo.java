package com.seerocode;

import java.util.Arrays;

public class HanSolo {
	
	private static String name;
	private static String spouse;

	public HanSolo(String name) {
		this.name = name;
	}
	
	//Overrides .toString which would otherwise return classname + "@" + a hashcode
	public String toString() {
        return this.name;
    }
	
	public String setSpouse(String spouse) {
		return this.spouse = spouse;
	}
	
	public static String setChildren(String[] children) {
		return Arrays.toString(children);
	}
	

	public static String listAffiliation() {
		
		String[] affiliations = { "Rebel Alliance", "New Republic", "Resistance" };
		return Arrays.toString(affiliations);

//		System.out.println(Arrays.toString(affiliations));
		
//		for(int i = 0; i < affiliations.length; i++) {
//			System.out.println(affiliations[i]);
//		}
		
//		for(String affiliation: affiliations) {
//			System.out.println(affiliation);
//		}
	}

}
