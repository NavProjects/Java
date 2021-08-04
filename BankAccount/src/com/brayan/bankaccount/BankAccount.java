package com.brayan.bankaccount;
import java.util.Random;
public class BankAccount {
	//member variables
	private double checkingBalance;
	private double savingsBalance;
	private String accountNumber;
	private static int numberOfAccounts = 0;
	private static double total = 0.00;
	//constructor
	public BankAccount() {
		numberOfAccounts ++;
		this.setCheckingBalance(0.00);
		this.setSavingsBalance(0.00);
		this.setAccountNumber(account());
	}
	public BankAccount(double checking, double saving) {
		numberOfAccounts ++;
		this.setCheckingBalance(checking);
		this.setSavingsBalance(saving);
		total = total + checking + saving;
		this.setAccountNumber(account());
	}
	Random rand = new Random();
	//methods
	private String account() {
		String acc = "";
		for(int i = 0; i < 10; i++) {
			acc += (rand.nextInt(10));
		}
		return acc;
	}
	public String displayAccount() {
		return this.getCheckingBalance() + "\n" + this.getSavingsBalance();
	}
	public double displayChecking() {
		return this.checkingBalance;
	}
	public double displaySaving() {
		return this.checkingBalance;
	}
	public void depositCheck(double added) {
		this.setCheckingBalance(this.checkingBalance + added);
		total = total + added;
	}
	public void depositSave(double added) {
		this.setSavingsBalance(this.savingsBalance + added);
		total = total + added;
	}
	public void withdraw(double taken, String acc) {
		if (acc == "Checking") {
			if(taken < this.getCheckingBalance()) {				
				this.setCheckingBalance(this.getCheckingBalance() - taken);
			}else {
				System.out.println("Unable to overdraft");
			}
		}else if (acc == "Savings") {
			if (taken < this.getSavingsBalance()) {				
				this.setSavingsBalance(this.getSavingsBalance() - taken);
			}else {
				System.out.println("Unable to overdraft");
			}
		}
	}
	// getters and setters
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}
	public static double getTotal() {
		return total;
	}
	public static void setTotal(double total) {
		BankAccount.total = total;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
