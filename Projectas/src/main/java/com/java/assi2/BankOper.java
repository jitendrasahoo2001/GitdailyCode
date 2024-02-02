package com.java.assi2;

import java.util.*;

public class BankOper {
	public static void main(String[] args) {
		List<BankDAOImpl> accounts = new ArrayList<>();

        Bank account1 = new Bank("123", 1000.0);
        Bank account2 = new Bank("789", 500.0);

        accounts.add(new BankDAOImpll(account1));
        accounts.add(new BankDAOImpll(account2));

        for (BankDAOImpl account : accounts) {
            account.deposit(200.0);
            account.withdraw(50.0);
        }
	}

}
