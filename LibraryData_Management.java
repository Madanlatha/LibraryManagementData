package Library;
class libraryItem{
	private int bookId;
	String title;
	int year;
	public int getId()
	{
		return bookId;	
	}
	public void setID(int id) {
		bookId=id;		
	}
}

class book extends libraryItem{
	String  authorr;
	public void author(String author) {
		System.out.println(author);
	}
	
	
}

class Magazine extends libraryItem{
		int issue;
		public void issue(int issue) {
			System.out.println(issue);
		}
				
}



public class LibraryData_Management  {

	public static void main(String[] args) {
		
		Magazine lib=new Magazine();
		
		lib.setID(10);
		
		lib.title="Iron Man-2";
		lib.year=2024;
		
		System.out.println(lib.getId());
		System.out.println(lib.title);
		System.out.println(lib.year);
		lib.issue(27);
			
		
		System.out.println("-------------------------");
		
		
		
		book library=new book();
		library.setID(102);
		
		library.title="Iron Man-2";
		library.year=2024;
		
		System.out.println(library.getId());
		System.out.println(library.title);
		System.out.println(library.year);
		library.author("Roger");
			
		}
		
	

	}

	


