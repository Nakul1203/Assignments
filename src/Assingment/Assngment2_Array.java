package Assingment;

public class Assngment2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String[][][] Data = {
				{ // semester 1
					{"Mathematics","Physics","chemistry","computor programming","Engineering drawing","Basics of Elt."},
					{"78","85","21","74","88","79"}
				},
				{ //semester 2
					{"Mathematics 2","Mechanic","Environmental sci.","Basics of electronics","Engineering physics","Engineering Graphics"},
					{"82","77","93","19","24","90"}
				},
				{ //semester 3
					{"Data Structure","Discrete Mathematics","Digital Electonis","Operating System","Signals and System","Object oriented prog"},
					{"88","81","76","32","85","78"}
				},
				{ // semester 4
					{"Algorithms","Computer Networks","Databse system","Microprocessor"," Communication engg","Software Engineering"},
					{"91","73","19","80","76","87"}
				},
				{ // semester 5
					{"Probability & stat","Machine Learning","Compilers Design"," Theory of computation","Embedded system","Computor Graphics"},
					{"86","88","84","95","73","90"}
				}
		};
		
		// Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Sem2, Subject 4:"+" " + Data[1][0][3]);
		System.out.println("Sem2, Subject 5:"+" " + Data[1][0][4]);
		
		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Sem4, Mark of subject 3:"+" "+Data[3][1][2]);
		System.out.println("Sem4, Mark of subject 6:"+" "+Data[3][1][5]);
	}

}
