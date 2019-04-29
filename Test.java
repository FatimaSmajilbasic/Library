package books;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {	
		
   	Scanner input = new Scanner(System.in);
        String bookName, name, date;
		int choice, accountNumber,bookNumber, borrowedBooks ;
		int amountOfBorrowedBooks = 0;
		
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<BorrowBooks> borrowedBook = new ArrayList<>();
         choice = -1;
	     while (choice != 0) {
         System.out.println("Select : \n1 - to create new account \n2 - to register book \n3 - to borrow book \n4 - to list all accounts");
		 System.out.println("5 - to list all book titles \n6 - to list borrowed books \n0 - to exit");
			System.out.print("\nChoose your option : ");	
         choice = input.nextInt();
         
          if (choice == 1) {
        	System.out.print("Account number :  "); 
        	accountNumber = input.nextInt();
		    input.nextLine();
          while (accountNumber < 0 || Account.accountAlreadyExists(accountNumber, accounts) ) {
        	 System.out.println("Account number is not valid. Try again!");
        	  accountNumber = input.nextInt();
		      input.nextLine();
		     
          }
		  
		 System.out.print("Account name:  ");
		 name = input.nextLine();
		 System.out.print("Number of borrowed books:  ");
		 borrowedBooks = input.nextInt();

		Account profile = new Account(name,accountNumber,borrowedBooks);
            accounts.add(profile);
            profile.toString();
						

			} else if (choice == 2) {
			
		 System.out.print("Book number:  ");
		    bookNumber = input.nextInt();
		    while (Book.alreadyExists(bookNumber, books)) {
		    	System.out.print("This book already exists in our library. Try again : ");
		    bookNumber = input.nextInt();
		    }
		 System.out.print("Book title:  ");
			input.nextLine();
			bookName = input.nextLine();
		 

		  Book features = new Book(bookNumber, bookName);
			books.add(features);
          System.out.println("Book " + bookNumber + " is now added to our library.");
		  System.out.println("");

		} else if (choice == 3) {
			
		 System.out.print("Book number: ");
			bookNumber = input.nextInt();
	 	System.out.print("Account number: ");
		    accountNumber = input.nextInt();
		System.out.print("Date:");
			date = input.nextLine();
						
         BorrowBooks borrowed = new BorrowBooks(bookNumber,
			accountNumber);

						borrowedBook.add(borrowed);

						borrowed.borrowBooks(accounts, books, accountNumber,
								bookNumber, amountOfBorrowedBooks, date);
						System.out.println("");

					} else if (choice == 4) {
						System.out.println("List of registered accounts:");
						Account.accountsList(accounts);
						System.out.println("");

					} else if (choice == 5) {
						System.out.println("List of registered book titles:");
						Book.booksList(books);
						System.out.println("");

						System.out.println("");
					}

				} 

				System.out.println("We hope you've enjoyed our library.");
				input.close();

			}
		
	

	}


