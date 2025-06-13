package assignment11;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
// upper pyramid

// to use numbers 1 to 5 in pyramid
for(int i=1; i<=n; i++) {
	
// print space
	for(int j=n;j>i;j--) {
		System.out.print(" ");
	}
// print number
	for(int k=1;k <= i;k++) {
		System.out.print(k+" ");
	}
	System.out.println();
	
}

// lower pyramid

// to use number from 1 to 5
for(int i=n-1;i>=1;i--) {
	for(int j=n;j>i;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(k + " ");
	}
	System.out.println();
}











	}

}
