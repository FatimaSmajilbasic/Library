package books;
import java.util.ArrayList;

public class Book {
	
    private String bookName;
	private int bookNumber;	
	private boolean bookAvailable;

	Book() {

	}

	Book(int bookNumber, String bookName) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		

	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
			this.bookNumber = bookNumber;
		
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
    
	public void setBookAvailable(boolean bookAvailable) {
		this.bookAvailable = bookAvailable;
	}
	public boolean isBookAvailable() {
		
		return bookAvailable;
	}

	public static boolean alreadyExists(int bookNumber, ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			while (books.get(i).getBookNumber() == bookNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean isBookNumber(int bookNumber, ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			while (books.get(i).getBookNumber() == bookNumber) {
				return false;
			}
		}
		return true;
	}

	public static int getBookNumberIndex(int bookNumber, ArrayList<Book> books) {
		int i;
		for (i = 0; i < books.size(); i++) {
			if (books.get(i).getBookNumber() == bookNumber) {
				return i;
			}
		}
		return i;
	}

	public static void booksList(ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(i +". " + books.get(i).getBookName());
		}

	}

	public static boolean isBookAvailable(int bookNumber, ArrayList<Book> books) {
		while (books.get(getBookNumberIndex(bookNumber, books)).isBookAvailable()) {
			return false;
		}
		return true;

	}


	public boolean isBookNoNegative(int bookNumber) {
		if (getBookNumber() < 0) {
			return true;
		} else
			return false;
	}

}



