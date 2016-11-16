package com.seerocode;

public class TheForceAwakens {
	
	public static void main(String[] args) {
		//Harrison Ford portrays Han Solo
		HanSolo hs = new HanSolo("Harrison Ford"); //resistance
		
		hs.setSpouse("Leia Organa"); //resistance
		String[] children= {"Ben", "Jaina Solo", "Jacen Solo", "Anakin Solo"};
		hs.setChildren(children);
		
		hs.listAffiliation();
		
}
}