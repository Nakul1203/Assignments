package assignment6;

public class Assignment6 {


			public static void main(String[] args) {

				String[] studentName = {"Suresh","Mahesh","Naresh"};

				int[] marks = {75,80,82};

				int a =marks[0]+=10;
				int b =marks[1]+=10;
				int c =marks[2]+=10;

				int[] updatedMarks = {a,b,c};
				System.out.println("Updated Marks:");
				
				System.out.println(studentName[0]+":"+updatedMarks[0]);
				System.out.println(studentName[1]+":"+updatedMarks[1]);
				System.out.println(studentName[2]+":"+updatedMarks[2]);

				 int averageMarks = (a+b+c)/3;
				 System.out.println("Average mark : "+averageMarks);
			}

		

	}


