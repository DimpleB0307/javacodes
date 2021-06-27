class Museums
{
String name;
String location;
String purpose;
int year;

public Museums(String name,String location, String purpose, int year)
{
this.name=name;
this.location=location;
this.purpose=purpose;
this.year=year;
}

public static void getMemories()
{
System.out.println("Museums are the place where all the old equipments are placed");
}

public void printMuseumsDetails()
{
System.out.println(name+" is the museum situated at "+location+" and "+purpose+" are kept and was established in "+year);
}
} 