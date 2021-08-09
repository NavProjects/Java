package com.brayan.bankaccount;

public class BankTest {

	public static void main(String[] args) {
		BankAccount mike = new BankAccount("Mike", 20.00, 20.00);
		BankAccount justin = new BankAccount("Justin");
		BankAccount anthony = new BankAccount("Anthony", 30, 27.15);
		System.out.println(mike.displayAccount());
		System.out.println(justin.displayAccount());
		anthony.depositCheck(6000);;
		anthony.withdraw(8000, "Checking");
		anthony.withdraw(10, "Savings");
		System.out.println(anthony.displayAccount());
		System.out.println("Anthony's account: " + anthony.getAccountNumber());
		System.out.println("Total number of accounts: "+ BankAccount.getNumberOfAccounts());
		System.out.println("Total in Bank: " + BankAccount.getTotal());
	}
}
