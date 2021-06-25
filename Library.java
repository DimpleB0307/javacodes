class Library
{
	String name;
	String ownerName;
	int noOfBooks;
	String location;
	
	public static void main(String a[])
	{
		System.out.println("In main method");
		
		Library library= new Library();
		library.name="Bodleian Library";
		library.ownerName="UK";
		library.noOfBooks=4000;
		library.location="London";
		System.out.println(library.name+" is owned by "+library.ownerName+" contains  "+library.noOfBooks+" books and are located in  "+library.location);
		
		Library lib= new Library();
		
		lib.name="College Library";
		lib.ownerName="Vatican";
		lib.noOfBooks=5000;
		lib.location="Rome";
		System.out.println(lib.name+" is owned by "+lib.ownerName+"  contains  "+lib.noOfBooks+" books and are located in  "+lib.location);
		
		Library books= new Library();
		
		books.name="District Libraries";
		books.ownerName="NATIONAL LIBRARY OF ST. MARK'S";
		books.noOfBooks=6500;
		books.location="Italy";
		System.out.println(books.name+" is owned by  "+books.ownerName+" contains   "+books.noOfBooks+"  books and are located in "+books.location);
		
		System.out.println("Outside main method");
	}
}