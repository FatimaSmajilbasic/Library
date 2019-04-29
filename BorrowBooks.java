package books;
import java.util.ArrayList;
import java.util.Date;
public class BorrowBooks {
	
	
	private int bookNumber;
	private int accountNumber;
	 Date date;
	
	
	BorrowBooks() {

	}

	BorrowBooks(int bookNumber, int accountNumber) {
		this.bookNumber = bookNumber;
		this.accountNumber = accountNumber;
		date = new Date();

	}
	

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public java.util.Date getDueDate() {
		return date;
	}

	public void borrowBooks(ArrayList<Account> accounts, ArrayList<Book> books,
			int accountNumber, int bookNumber, int amountOfBorrowedBooks,  String date) {
		if (Account.isAccountNumber(accountNumber, accounts)) {
			System.out.println("\nAccount number doesn't exist. Try again.");
		
		} else if (Book.isBookNumber(bookNumber, books)) {
			System.out.println("\nBook number invalid. Try again.");
			
		} else if (Book.isBookAvailable(bookNumber, books)) {
			System.out.println("\nThis book is not available at the moment.");
			
		} else if (accounts.get(Account.getAccountNumberIndex(accountNumber, accounts)).getBorrowedBooks() >= 3) {
			System.out.println("\nThree books have already been borrowed!");
			
		} else {
			books.get(Book.getBookNumberIndex(bookNumber, books)).setBookAvailable(false);
			accounts.get(Account.getAccountNumberIndex(accountNumber,accounts)).setBorrowedBooks(amountOfBorrowedBooks + 1);
			System.out.println("Book is issued to account number "+ accountNumber);
			
		}

	}
}


