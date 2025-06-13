package assignment10;

public class Assignment10 {

	public static void main(String[] args) {
		
		
		
		int[] number = {12 ,34,11,36,87,98,93};
		
		// variable used for swapping the value during sorting
		int temp=0;
		// outer loop to iterate through the array element
		for(int i=0;i<number.length;i++) {
			// inner loop to compare the current element with remaining element
			for(int j=i+1;j<number.length;j++) {
				if(number[i]<number[j]){
					temp = number[i]; // store number[i] in temp
					number[i]=number[j]; // replace number[i] with number[j]
					number[j]=temp;  // put the stored value in number[j]
				}
			}
		}
		System.out.println("Second largest number is : "+number[1]);
		System.out.println("Third largest number is : "+number[2]);
	}

}
