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