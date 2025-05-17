package com.javaproduct.method;

public class Bank {
	
	static int currentBalance = 1000;
	
	
	public static void greet() 
	{
		System.out.println("Welcome to Banking application......");
	}
	
	public void deposit(int amount) 
	{
		currentBalance += amount;
		System.out.println("Deposit succeeded and your current balance amount is " + currentBalance);
	}
	public static void withdrawal(int amount) 
	{
		currentBalance -= amount;
		System.out.println("withdrawal succeeded and your current balance amount is " + currentBalance);
	}
	public int getCurrentBalance() 
	{
		return currentBalance;
	}
	
	
	public static void main(String[] args) 
	{
		Bank bank = new Bank();

		greet();
		System.out.println("Current Balance amount is "+currentBalance);
		bank.deposit(500);
		withdrawal(300);
		System.out.println("Current Balance amount is "+currentBalance);
		
		
	}
}
