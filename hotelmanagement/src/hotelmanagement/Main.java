package hotelmanagement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
	
	 String name;
			String address; 
			String contact;
			String email;
			String proofType;
			String proofId;
	        String i;
	        /////////BOOKING//////////
	        String ac;
	        String co;
	        String cable;
	        String wifi;
	        String laundry;
	        String date;
	        int totalcharge = 0;
	        
	        Booking cus = new Booking();

	        Customer obj = new Customer();
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
			 System.out.println("Name");
	         name = br.readLine();
	         System.out.println("Address");
	         address = br.readLine();
	         System.out.println("Contact");
	         contact = br.readLine();
	         System.out.println("Email");
	         email = br.readLine();
	         System.out.println("ProofType");
	         proofType = br.readLine();
	         System.out.println("Proof Id");
	         proofId = br.readLine();
	         
	         obj.register(name,address,contact,email,proofType,proofId);
	         System.out.println("Do you want to continue.");
	        i = br.readLine();
			}while(i.equalsIgnoreCase("yes"));
			////////// booking////////////////
			if(i.equalsIgnoreCase("no"))
			{
				
				while(true)
				{System.out.println("Menu");
				System.out.println("1. Book\n2. Check Status\n3. Exit\n");
				System.out.println("Enter your choice");
				int ch = Integer.parseInt(br.readLine());
				switch(ch) {
				case 1:
				{
				do {
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
					
					cus.Book(ac, co, cable, wifi, laundry);
					cus.displaybook();
					System.out.println("Do you want to proceed(yes/no)");
					i=br.readLine();
				}while(i.equalsIgnoreCase("no"));
					if(i.equalsIgnoreCase("yes"))
					{
						System.out.println("Thank you for booking. Your room number is "+ cus.roomnum());
					}
				break;	
				
			}
				case 2:
				{
					System.out.println("Check Status:");
					System.out.println("Enter room number");
					 int roomId = Integer.parseInt(br.readLine());
					boolean check = cus.checkStatus(roomId);
					if(check) 
					{
						System.out.println("Room number is booked.");
					}
					else  
					{
						System.out.println("Room number is not booked.");
					}
					
					break;
				}
				
				case 3:
				{
					System.exit(0);
				
				}

				}
		}
		
		

	}}

	}