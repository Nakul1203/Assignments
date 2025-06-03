package assignment7;

public class Assignment7 {

	public static void main(String[] args) {
		// Customer details
		String customerName = "John Doe";           
		int creditScore = 720;                     
		double income = 45000.0;                    
		boolean isEmployed = true;                 
		double debtToIncomeRatio = 45.0;            
		
		
	if (creditScore>750) {
		System.out.println( customerName + "is eligible for loan");
	}
	else if(creditScore>=650 && creditScore<=750){
		if(income>=50000) {
			if(isEmployed) {
				if(debtToIncomeRatio<40) {
					System.out.println(customerName + " " + "is eligible for loan");
				}
				else {
					System.out.println(customerName + " is not eligible for the loan(Debt to income ratio id high)");
				}
			}else {
				System.out.println(customerName + "is not eligible for loan(Not Employed");
			}
		}else {
			System.out.println(customerName + "is not eligible for loan(Income is less than 50000$)");
		}
		
	}else
	{
		System.out.println(customerName + "is not eiligible for loan(Credit score is less than 650");
	}

	}

}
