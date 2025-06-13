package assignment8;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {
		
// Store the data in array
		
/*		List<Integer> amount=new ArrayList<Integer>();
		
		amount.add(50000);
		amount.add(-2000);
		amount.add(3000);
		amount.add(-15000);
		amount.add(-200);
		amount.add(-300);
		amount.add(4000);
		amount.add(-3000);
		
System.out.println("Transaction data stored in array");	
		System.out.println(amount);
		
	//	1. Print total number of credit and debit transactions completed
		
	int	creditTransaction = 0;
	int debitTransaction = 0;
	int totalCreditAmount = 0;
	int totalDebitAmount = 0;
	int suspiciousCreditTransactions = 0;
	int suspiciousDebitTransactions = 0;
	
	for(int num : amount) {
		if(num>0) {
			creditTransaction ++;
			
		}
		else{
			debitTransaction++;
		}
	}
	System.out.println("Total credit transaction : "+ creditTransaction);
	System.out.println("Total debit transaction : "+ debitTransaction);
		
	// 2. Print the total amount credited and debited in account	
		
		for (int num1 : amount ) {
			if(num1>0) {
				totalCreditAmount += num1;	
			}
			else {
				totalDebitAmount += num1;
		}
			
		}
		
		System.out.println("Total credit amount : "+ totalCreditAmount);
		System.out.println("Total debit amount : "+ totalDebitAmount);
		
	// 3. Print total amount remaining at the end in Bank Account
	
		int remainingAmount = totalCreditAmount - (-totalDebitAmount);
		System.out.println("Total amount remaining in bank account : "+remainingAmount);
		
	// If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
	//	Transaction with Amount” and also print total number of suspicious transactions
		
		for (int num2 : amount ) {
			if(num2>10000) {
				suspiciousCreditTransactions ++;
				System.out.println("Suspicious credit transaction");
			}
			else if(num2<-10000) {
				suspiciousDebitTransactions ++;
				System.out.println("Suspicious debit transaction");
		}
		
	}
		int totalSuspiciousTransactions = Math.abs(suspiciousCreditTransactions + suspiciousDebitTransactions); // Math.abs() method to change negative value to positive
		System.out.println("Total suspicious transaction : " + totalSuspiciousTransactions);
*/
		
		
		int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

		
		int totalCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;

		// Iterate through each transaction in the array
		for (int amount : transactions) {
			if (amount > 0) {
				// It's a credit transaction
				totalCredits++; // Increment the credit transaction count
				totalCreditAmount += amount; // Add to total credited amount

				// Check for suspiciously large credit transaction
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			} else {
				// It's a debit transaction
				totalDebits++; // Increment the debit transaction count
				totalDebitAmount -= amount; // Convert to positive and add to total debited amount

				// Check for suspiciously large debit transaction
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			}
		}

		// Final balance is the total credit minus total debit
		int finalBalance = totalCreditAmount - totalDebitAmount;

		// Print a summary of the account activity
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + totalCredits);
		System.out.println("Total number of debit transactions: " + totalDebits);
		System.out.println("Total amount credited: " + totalCreditAmount);
		System.out.println("Total amount debited: " + totalDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
	}		
}
