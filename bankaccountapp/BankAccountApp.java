package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();
		String file = "C:\\Users\\Milind_N13\\Downloads\\NewBankAccounts.csv";

		/*
		 * Checking chkacc1=new Checking("Tim Wilson","324156879",1500); Savings
		 * saveacc1=new Savings("Rich Lowe","456657897",2500); //Read a CSV File
		 * then create new accounts based on that data saveacc1.showInfo();
		 * System.out.println("******************"); chkacc1.showInfo();
		 * saveacc1.compound();
		 */

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {

			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name+" "+sSN+" "+accountType+" "+intiDeposit);
			if (accountType.equals("Savings")) {
				// System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));

			} else if (accountType.equals("Checking")) {
				// System.out.println("OPEN A CHECING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("ERROR reading account type");
			}
		}
		for (Account acc : accounts) {
			acc.showInfo();
			System.out.println("*******************************");
		}

	}

}
