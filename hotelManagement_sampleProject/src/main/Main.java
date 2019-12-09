package main;
import registrationpack.Registration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bookingpack.Booking;
public class Main {
	static int regId=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String firstName;
	    String middleName;
	    String lastName;
		String email;
		String phone;
		String address;
		String prooftype;
		String proofId;
		
		int choice;
		///////////////
	    String ac;
		String co;
	    String cable;
	    String wifi;
	    String laundry;
	    int date = 0;
	    String i;
	    //////////////////////
	    int startDate;
	    int endDate;
	    int d = 0;
	    int[] dateArray = new int[50];

		Booking book = new Booking();

		Registration reg = new Registration();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t\t~~~~~~~~~~~ WELCOME ~~~~~~~~~~~~~~");
		while(true) {
		System.out.println("Enter your choice\n1. Registration.\n2. Booking.\n3. Check Status\n4. Email.\n5. All Bookings.\n6. All Customers.\n7. Exit");
		choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
	 do {
		System.out.println("Enter your first name:");
	    firstName = br.readLine();
	    System.out.println("Enter your Middle name:");
	    middleName = br.readLine();
	    System.out.println("Enter your Last name:");
	    lastName = br.readLine();
	    System.out.println("Enter Email-id");
	 	email = br.readLine();
		System.out.println("Phone");
		phone = br.readLine();
		System.out.println("Enter your address:");
		address = br.readLine();
		System.out.println("Proof-Type");
		prooftype = br.readLine();
		System.out.println("Proof-Id");
		proofId = br.readLine();
		
		
		//Registration reg = new Registration();

		reg.register(firstName,middleName,lastName,email, phone,address,prooftype,proofId);
		regId=reg.registerId();
		System.out.println(regId);

        System.out.println("Do you want to continue registering?(Yes/No)");
        i = br.readLine();
		}while(i.equalsIgnoreCase("yes"));
			if(i.equalsIgnoreCase("no"))
			{
				System.out.println("Thank you for Registering..."+"\n"+"Book your room\n");
				
			}
		break;
		
		case 2://BOOKING]
			do{
			System.out.println("Please choose the services required.\n" + "AC/non-AC(AC/nAC)");
			ac = br.readLine();
			System.out.println("Cot(Single/Double)");
			co = br.readLine();
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable = br.readLine();
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi = br.readLine();
			System.out.println("Laundry service needed or not(L/nL)");
			laundry = br.readLine();
			System.out.println("Enter the date");
			date = Integer.parseInt(br.readLine());
			dateArray[++d] = date;
			
			//Booking book = new Booking();
			book.booking(ac, co, cable, wifi, laundry, date);
			book.book(ac, co, cable, wifi, laundry);
			book.displaybook();
			System.out.println("Can we proceed with this facilities??(yes/no)\n");
			i=br.readLine();
		}while(i.equalsIgnoreCase("no"));
			if(i.equalsIgnoreCase("yes"))
			{
				System.out.println("Thank you for booking. Your room number is "+ book.roomnum(date,regId));
				System.out.println("\n\n");
			}
			break;
			
		case 3://Check Status
			System.out.println("Check Status:");
			System.out.println("Enter room number");
			 int roomId = Integer.parseInt(br.readLine());
			boolean check = book.checkStatus(roomId);
			if(check) 
			{
				System.out.println("Room number is booked.\n\n");
			}
			else  
			{
				System.out.println("Room is available.\n\n");
			}
			
			break;
			
		case 4://E-mail updation.
			int cusId;
			System.out.println("\nDo you want to update the email id?(yes/no)");
			 i = br.readLine();
			 if(i.equalsIgnoreCase("yes"))
			 {
				// --regId;
				 System.out.println("Enter the custsomer ID");
				 cusId = Integer.parseInt(br.readLine());
				 System.out.println("Enter new Email id");
				 email = br.readLine();
				 reg.UpdateEmail(cusId,email);
				 System.out.println("\n");
			 }
				 break;
			
		case 5://All Booking(Date)

			System.out.println("View all bookings:");
			System.out.println("Enter the start date");
			startDate = Integer.parseInt(br.readLine());
			System.out.println("Enter the end date");
		    endDate = Integer.parseInt(br.readLine());
		    
		    System.out.println("The bookings made from "+ startDate +" to "+endDate +" are " );
		    System.out.println("Room number"+"\t"+"Customer ID");
		    book.ViewBookings(startDate,endDate);
		    
		    
			break;
			
		case 6://All Customers

			System.out.println("Customers list");
			System.out.println("Customer ID 	Customer name");
			reg.viewCustomers();
			System.out.println("\n\n");
			break;
			
		case 7:
			System.out.println("\n");
			System.out.println("\t\t\t!!!!!BYE!!!!!");
			System.exit(0);
	
			
	}
		}

}
}