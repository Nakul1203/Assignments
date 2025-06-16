package assignment12;

public class Assignment12 {

	public static void main(String[] args) {
		int[] prices = { 7, 5, 4, 9, 2, 1 };
		
		int maxProfit =0;
		int buyDay=0;
		int sellDay=0;
		
		for(int i=0;i<prices.length-1;i++) {
			for(int j=i+1;j<prices.length;j++) {
				int profit = prices[j]-prices[i];
				
				if(profit>maxProfit) {
					maxProfit=profit;
					buyDay = i+1;
					sellDay = j+1;
					}
			}
		}
		if(maxProfit>0) {
			System.out.println("Maximum profit : " + maxProfit);
			System.out.println("Buying Day Is : " + buyDay);
			System.out.println("Selling Day Is : " + sellDay);
			
			}else {
				System.out.println("NO PROFIT");
			}
		

	}

}
