package com.seerocode;

public class TheForceAwakens {
	
	public static void main(String[] args) {
		
		HanSolo hs = new HanSolo("Harrison Ford"); 
		
		hs.setSpouse("Leia Organa"); 
		
		String[] children= {"Ben", "Jaina Solo", "Jacen Solo", "Anakin Solo"};
		hs.setChildren(children);
		
		System.out.println(hs.listAffiliation());	
		
	}
	
}