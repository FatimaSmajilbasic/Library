package books;

import java.util.ArrayList;

public class Account {
	
    private String name;
	private int accountNumber;
	private int borrowedBooks;

	Account() {

	}

	Account(String name,int accountNumber, int borrowedBooks) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.borrowedBooks = borrowedBooks;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		}
	

	public String getName() {
		return name;
	}

	public void setAccountName(String name) {
		this.name = name;
	}

	public int getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(int borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	public static void printInformation(ArrayList<Account> accounts, int accountNumber) {
		boolean account = false;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				System.out.println("Name : " + accounts.get(i).getName());
				System.out.println("Account number : " + accounts.get(i).getAccountNumber());
				System.out.println("Books borrowed : " + accounts.get(i).getBorrowedBooks());
				account = true;
				break;
			}
		}
		if (!account) {
			System.out.println("This account does not exist.");
		}
	}
	
	public static boolean accountAlreadyExists(int accountNumber,	ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			while (accounts.get(i).getAccountNumber() == accountNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean isAccountNumber(int accountNumber, ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return false;
			}
		}
		return true;
	}

	public static int getAccountNumberIndex(int accountNumber, ArrayList<Account> accounts) {
		int i; 
		for ( i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return i;
	}

	public static void accountsList(ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println( i + ". Account number - " + accounts.get(i).getAccountNumber() + ", Name - "
					+ accounts.get(i).getName() +  ", books borrowed - " + accounts.get(i).getBorrowedBooks());
		}

	}

}