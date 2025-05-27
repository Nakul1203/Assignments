package Assingment3;

public class EmpGroups {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] employeeNames = new String[3];
	    int[] employeeIDs = new int[3];
	    
// Object of employees class
		Employees emp=new Employees();
		
// Store data into array
		
		employeeNames[0] = emp.employeeName1;
		employeeNames[1] = emp.employeeName2;
		employeeNames[2] = emp.employeeName3;
		
		employeeIDs[0] = emp.empID1;
		employeeIDs[1] = emp.empID2;
		employeeIDs[2] = emp.empID3;
		
		System.out.println("Employee Name:"+employeeNames[0]+" "+"EmployeeID:"+ employeeIDs[0]);
		
		System.out.println("Employee Name:"+employeeNames[1]+" "+"EmployeeID:"+ employeeIDs[1]);
		
		System.out.println("Employee Name:"+employeeNames[2]+" "+"EmployeeID:"+ employeeIDs[2]);
		

	}

}
