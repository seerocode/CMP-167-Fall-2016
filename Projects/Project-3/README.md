#Project 3 - Fill In the Blanks

The task was to fill in the blanks and write the class name HanSolo to complete the following program:

```
public class TheForceAwakens {
  public static void main(String[] args) {
     // Harrison Ford portrays Han Solo
     HanSolo hs = new HanSolo(“Harrison Ford”);
     hs.setSpouse(“Leia Organa”);
     String[] children = {“Ben”, “Jaina Solo”, “Jacen Solo”, “Anakin Solo”};
     hs.setChildren(children);
     
     System.out.println( hs.listAffiliation() );
     // OUTPUT
     // [ Rebel Alliance, New Republic, Resistance ]
  }
}
```

###Used:
* Array utility

####Note:
In the future, you can right-click the code in TheForceAwakens having not created the HanSolo class and it will create the methods and constructor for you. Then, you can create the specific private instance variables you need, highlight them, and g to Source > Generate Setters & Getters. 

This assignment was to teach us that we do not need to use everything in a class and how to create setters and getters.

Setters = modifier methods that usually start with "setXxxxx" and have an parameter and are void. You would set a private variable to the parameter variable.

Getters = return methods with no parameters that return a private instance variable. 

Example:

```
	private String spouse;
	private String[] children;
	private static String[] affiliation = { "Rebel Alliance", "New Republic", "Resistance" };
	
	//setter
	public void setSpouse(String spouse) { 
		this.spouse = spouse;
	}
	
	//setter
	public void setChildren(String[] children) {
		this.children = children;
	}

	//getter
	public static String listAffiliation() {
		return Arrays.toString(affiliation);
	}
	
```


