package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*********StudentDetails**************/
		// Student 1
		Map<String,String> student1=new HashMap<String,String>();
		student1.put("name", "John Doe");
		student1.put("Age", "Twnety");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SAB12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computor");
		student1.put("GPA", "A3.8");
		student1.put("Email", "John@exa");
		student1.put("PAN", "SDF6543210");
		student1.put("Address", "123 Elm St");
		// Student 2
		Map<String,String> student2=new HashMap<String,String>();
		student2.put("name", "Jane Smith");
		student2.put("Age", "Twnety One");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "SAB12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.5");
		student2.put("Email", "Jane@exa");
		student2.put("PAN", "REW6543210");
		student2.put("Address", "456 Oak St");
		// Student 3			
		Map<String,String> student3=new HashMap<String,String>();
		student3.put("name", "Mike Brown");
		student3.put("Age", "Twnety two");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "SAB12347");
		student3.put("Grade", "A+");
		student3.put("Major", "Physics");
		student3.put("GPA", "A3.9");
		student3.put("Email", "Mike@exa");
		student3.put("PAN", "TYR6543210");
		student3.put("Address", "789 Pine St");
				
		
		List<Map<String,String>> studentDetails=new ArrayList<>();
		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);
	//	System.out.println(studentDetails);
		
/*********EmployeeDetails**************/		
		Map<String,String> employee1=new HashMap<String,String>();
	// Employee 1	
	employee1.put("Employee ID", "E001");
	employee1.put("Name", "Alice Grenn");
	employee1.put("Age", "Thirty");
	employee1.put("Gender", "Female");
	employee1.put("Department", "Engineering");
	employee1.put("Position", "Software Engineer");
	employee1.put("Salary", "75K Pound");
	employee1.put("Email", "Alice@example.com");
	employee1.put("Pan Number", "SDF6543210");
		
	// Employee 2
	Map<String,String> employee2=new HashMap<String,String>();
	employee2.put("Employee ID", "E002");
	employee2.put("Name", "Bob johson");
	employee2.put("Age", "Thirty Five");
	employee2.put("Gender", "Male");
	employee2.put("Department", "Marketing");
	employee2.put("Position", "Marketing Manager");
	employee2.put("Salary", "85K Pound");
	employee2.put("Email", "bob@example.com");
	employee2.put("Pan Number", "SDF6543211");
	
	// Employee 3
	Map<String,String> employee3=new HashMap<String,String>();
	employee3.put("Employee ID", "E003");
	employee3.put("Name", "Carol white");
	employee3.put("Age", "Twenty eight");
	employee3.put("Gender", "Female");
	employee3.put("Department", "Sales");
	employee3.put("Position", "Sales Executive");
	employee3.put("Salary", "65K Pound");
	employee3.put("Email", "Carol@example.com");
	employee3.put("Pan Number", "SDF6543212");
		
	
	List<Map<String,String>> employeeDetails=new ArrayList<>();
	employeeDetails.add(employee1);
	employeeDetails.add(employee2);
	employeeDetails.add(employee3);
//	System.out.println(employeeDetails);
	
	/*********ProductDetails**************/	
	
	//product1
Map<String,String> product1=new HashMap<String,String>();
	product1.put("Prodcut ID", "P001");
	product1.put("Name", "Laptop");
	product1.put("Category", "Electronis");
	product1.put("Price", "12K Pound");
	product1.put("Stock Quantity", "Not Available");
	product1.put("Supplier", "Tech Supplies");
	product1.put("warranty", " 2 Year");
	product1.put("Rating", "4.5 Stars");
	product1.put("Manufacturing Date", "Aug 2023");
	product1.put("Expiry Date", "Aug 2028");

//product2
Map<String,String> product2=new HashMap<String,String>();
product2.put("Prodcut ID", "P002");
product2.put("Name", "Desk Chair");
product2.put("Category", "Furniture");
product2.put("Price", "150K Pound");
product2.put("Stock Quantity", "Two");
product2.put("Supplier", "Office Depot");
product2.put("warranty", "1 Year");
product2.put("Rating", "4 Stars");
product2.put("Manufacturing Date", "Sept 2024");
product2.put("Expiry Date", "NA");

// product3
Map<String,String> product3=new HashMap<String,String>();
product3.put("Prodcut ID", "P003");
product3.put("Name", "COffee Maker");
product3.put("Category", "Kitchen");
product3.put("Price", "75 Pound");
product3.put("Stock Quantity", "Two Hundred");
product3.put("Supplier", "KitchenWorld");
product3.put("warranty", " 6 Month");
product3.put("Rating", "4.2 Stars");
product3.put("Manufacturing Date", "Jan 2025");
product3.put("Expiry Date", "JAN 2027");	
	
List<Map<String,String>> productDetails=new ArrayList<>();
productDetails.add(product1);
productDetails.add(product2);
productDetails.add(product3);

// System.out.println(productDetails);
	
	
	Map<String, List<Map<String,String>>> data=new HashMap<>();
	
	data.put("Students", studentDetails);
	data.put("Employees", employeeDetails);
	data.put("Product", productDetails);
	
//	System.out.println(data);
	
	System.out.println(data.get("Product").get(1).get("Supplier"));
	}

}
