package com.brayan.bankaccount;

public class BankTest {

	public static void main(String[] args) {
		BankAccount mike = new BankAccount(20.00, 20.00);
		BankAccount justin = new BankAccount();
		BankAccount anthony = new BankAccount(30, 27.15);
		System.out.println(mike.displayAccount());
		System.out.println(mike.displayChecking());
		System.out.println(mike.displaySaving());
		System.out.println(justin.displayAccount());
		System.out.println(BankAccount.getNumberOfAccounts());
		System.out.println(BankAccount.getTotal());
		System.out.println(anthony.displayAccount());
		anthony.depositCheck(6969);
		System.out.println(anthony.displayAccount());
		anthony.withdraw(8000, "Checking");
		System.out.println(anthony.displayAccount());
		anthony.withdraw(10, "Savings");
		System.out.println(anthony.displayAccount());
		System.out.println(anthony.getAccountNumber());
	}
}
