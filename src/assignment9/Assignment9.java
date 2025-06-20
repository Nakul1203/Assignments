
package assignment9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
/*		 // Employee names
		String[] employees = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		 // Employee Data: {Base Salary, Experience, Rating}
		 Double[] emp1= {75000.0,5.1,4.2};
		 Double[] emp2= {68000.0,3.3,3.8};
		 Double[] emp3= {82000.0,7.1,4.5};
		 Double[] emp4= {90000.0,10.2,2.5};
		 Double[] emp5= {60000.0,2.4,3.5};
	       // Store employee data in a map
		 Map<String,Double[]> empData=new HashMap<>();
		 empData.put(employees[0], emp1);
		 empData.put(employees[1], emp2);
		 empData.put(employees[2], emp3);
		 empData.put(employees[3], emp4);
		 empData.put(employees[4], emp5);
		 // Map to store hike percentage
		 Map<String,Double> hikeMap=new HashMap<>();
		 // Calculate hike for each employee
		 
		 for(String emp : employees) {
			 
			//getting value from map
			 
			 Double[] data=empData.get(emp);
			 
			 double baseSalary = data[0];
			 double experience = data[1];
			 double rating = data[2];
			 
			 double variablePayPercentage;
	         double bonus;
	         double reward = 0;
			 
	         
	      // Determine variable pay and bonus based on rating
	            if (rating >= 4) {
	                variablePayPercentage = 15;
	                bonus = 1500;
	            } else if (rating >= 3) {
	                variablePayPercentage = 10;
	                bonus = 1200;
	            } else {
	                variablePayPercentage = 3;
	                bonus = 300;
	            }

	            // Additional reward for employees with 5+ years of experience
	            if (experience >= 5) {
	                reward = 5000;
	            }

	            // Calculate total hike amount
	            double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
	            double hikePercentage = (hike / baseSalary) * 100;

	            // Store the calculated hike percentage
	            hikeMap.put(emp, hikePercentage);
	        }

	        // Print hike details
	        System.out.println("Employee Hike Details:");
	        System.out.println(hikeMap);	 
		 
	} */
		// Employee names
		 String[] employees = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		// Employee details = {Base salary, Experience,Rating}
		 Double[] emp1Data = {75000.0, 5.0, 4.2};
	     Double[] emp2Data = {68000.0, 3.0, 3.8};
	     Double[] emp3Data = {82000.0, 7.0, 4.5};
	     Double[] emp4Data = {90000.0, 10.0, 2.0};
	     Double[] emp5Data = {60000.0, 2.0, 3.5};
	    // Store the employee details in map
	     
	     Map<String,Double[]> empData=new HashMap<>();
	     empData.put(employees[0], emp1Data);
	     empData.put(employees[1], emp2Data);
	     empData.put(employees[2], emp3Data);
	     empData.put(employees[3], emp4Data);
	     empData.put(employees[4], emp5Data);
	    
	     // Map to store hike percentage
	     
	     Map<String,Double> hikeMap=new HashMap<>();
	     
		// get employee details from array 
		
		for(String emp : employees) {
			
			Double[] data=empData.get(emp);
		//	System.out.println(java.util.Arrays.toString(data));
			
			double baseSalary = data[0];
			double experience = data[1];
			double rating = data[2];
			
			 double variablePayPercentage;
	            double bonus;
	            double reward = 0;
		
		
		if(rating>=4) {
			 variablePayPercentage = 15;
             bonus = 1500;
		}else if(rating >=3) {
			 variablePayPercentage = 10;
             bonus = 1200;
		}else {
			 variablePayPercentage = 3;
             bonus = 300;
		}
		
		if(experience>=5) {
			reward =5000;
		}
		
		
		  // Calculate total hike amount
        double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
        double hikePercentage = (hike / baseSalary) * 100;

        // Store the calculated hike percentage
        hikeMap.put(emp, hikePercentage);
    }

    // Print hike details
    System.out.println("Employee Hike Details:");
    System.out.println(hikeMap);
}
			
	}

