package Inheritance_Hierarchial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int persons = 0;
		int total_Days = 0;
		double tariff;
		String roomType = null;
		double total = 0;
		int month;
		String i;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Booking bo = new Booking();
		PeakSeoson ps = new PeakSeoson();
		LeanSeoson ls = new LeanSeoson();
		System.out.println("\t\t~~~~BOOKING~~~~\n");
		do {
		System.out.println("Enter the number of persons");
		bo.setPersons(Integer.parseInt(br.readLine()));
		//persons = bo.getPersons();
		System.out.println("Enter the number of days");
		bo.setTotal_Days(Integer.parseInt(br.readLine()));
     	System.out.println("Enter the tariff for single person");
		tariff = Integer.parseInt(br.readLine());
	    System.out.println("Enter the room type");
		bo.setRoomType(br.readLine());
		System.out.println("Enter the month");
		month = Integer.parseInt(br.readLine());
		if( (month == 4) ||(month == 5) || (month == 6) || (month == 9) || (month == 11) || (month == 12))
		{
			System.out.println("Enter the peakCharge");
			int peakCharges = Integer.parseInt(br.readLine());
			//System.out.print("person in main="+persons);
			System.out.print(ps.roomBooking(bo.getPersons(),bo.getTotal_Days() , tariff, bo.getRoomType() , month ,peakCharges));
		}
		else if((month == 1) || (month == 2) || (month == 3) || (month == 7) || (month == 8) || (month == 9)|| (month == 10))
		{

			System.out.println("Enter the discount");
			int discount = Integer.parseInt(br.readLine());
			System.out.print(ls.roomBooking(bo.getPersons(), bo.getTotal_Days(), tariff, bo.getRoomType(), month, discount));
			
		}
		System.out.println("\nDo you want to continue Booking(yes/no)\n");
		 i =br.readLine();
		if(i.equalsIgnoreCase("no"))
		{
			System.out.println("ThankYou for Booking");
		}
		
		}while(i.equalsIgnoreCase("yes"));
		

	}

}
