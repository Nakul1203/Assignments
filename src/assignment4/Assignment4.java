package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("****************Problem 1******************");
		// ArrayList of 5 cities
		
		List<String> Cities=new ArrayList<String>();
		Cities.add("Mumbai");
		Cities.add("Hydraaad");
		Cities.add("Bangalore");
		Cities.add("Jaipur");
		Cities.add("Pune");

		List<Integer> Area=new ArrayList<Integer>();
		Area.add(1200);
		Area.add(1100);
		Area.add(450);
		Area.add(2000);
		Area.add(800);
		
	int a = Area.get(2)+ Area.get(3);
		
		System.out.println("Combined area of :" +" "+ Cities.get(2)+"s "+"And"+" "+Cities.get(3)+" "+"is:" + a);
		
	
		System.out.println("****************Problem 2******************");
	
	
	Set<String> attractions = new HashSet<String>();
	
	   attractions.add("Eiffel Tower");
       attractions.add("Great Wall of China");
       attractions.add("Times Square");
       attractions.add("Louvre Museum");
       attractions.add("Statue of Liberty");
       attractions.add("Machu Picchu");
       attractions.add("Colosseum");
       attractions.add("Disneyland");
       attractions.add("Burj Khalifa");
       attractions.add("Taj Mahal");
	
       System.out.println(attractions);
       System.out.println(attractions.size());
       
       
       System.out.println("****************Problem 3******************");
       
        int[] number = new int[10];
        number[0]= 1;
        number[1]= 2;
        number[2]= 3;
        number[3]= 4;
        number[4]= 5;
        number[5]= 6;
        number[6]= 7;
        number[7]= 8;
        number[8]= 9;
        number[9]= 10;
        
      int average1 = (number[0]+number[1]+number[2]+number[3]+number[4])/2;
       System.out.println("Average of 5th Value :" +" "+ average1);
       
      int average2 = (number[0]+number[1]+number[2]+number[3]+number[4]+number[5])/2;
       System.out.println("Average of 5th Value :" +" "+ average2);
       
       System.out.println("****************Problem 4******************");
       
       List<String> movies = new ArrayList<String>();
       movies.add("Panchayat");
       movies.add("Mirzapur");
       movies.add("Criminal Justice");
       movies.add("Stranger things");
       movies.add("Pnachyat 2");
       
       System.out.println(movies.get(2));
	}
}
