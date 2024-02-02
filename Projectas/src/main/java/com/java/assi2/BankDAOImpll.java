package com.java.assi2;

public class BankDAOImpll implements BankDAOImpl  {
	private Bank bank;

    public BankDAOImpll(Bank bank) {
        this.bank = bank;
    }

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		 if (amount > 0) {
			    bank.setBalance(bank.getBalance() + amount);
			    System.out.println("Deposit of" + amount + " successful. New balance:" + bank.getBalance());
			    } else {
	            System.out.println("Invalid deposit amount.");
	        }
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0 && amount <= bank.getBalance()) {
            bank.setBalance(bank.getBalance() - amount);
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + bank.getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
		
	}


