package hotelmanagementnew;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainHm {
	static int regId = 0;
	static String[] cusname = new String[25];
    static int[] id = new int[25];
    static int[] datearr = new int[] {0};
    static int d=0;
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
	        int date;
	        int totalcharge = 0;
            int a = 0;
            int b = 0;
           int startdate;
           int enddate;
	        BookingN cus = new BookingN();

	        CustomerN obj = new CustomerN();
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
			 System.out.println("Registration");
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
	         System.out.println("ProofId");
	         proofId = br.readLine();
	         System.out.println("Date");
	         try {
	         date = Integer.parseInt(br.readLine());
	         datearr[d] = date;
	         }
	         catch(Exception e)
	         {
	        	 System.out.println("Enter date");
	        	 
	         }
	         
	         obj.register(name,address,contact,email,proofType,proofId);
	         System.out.println(++regId);
	         
	         id[regId]= regId;
	         a++;
	         cusname[a] = name;
	        
	         System.out.println("Do you want to continue.(Yes/No)");
	        i = br.readLine();
			}while(i.equalsIgnoreCase("yes"));
			if(i.equalsIgnoreCase("no"))
			{
			
				////////////////////////////////
				System.out.println("\nDo you want to update the email id?(yes/no)");
				 i = br.readLine();
				 if(i.equalsIgnoreCase("yes"))
				 {
					 --regId;
					 System.out.println("Update Email:\nEnter new Email id");
					 email = br.readLine();
					 System.out.println("Email updated\nYour details are as follows");
					 obj.register(name,address,contact,email,proofType,proofId);
					 System.out.print(++regId);
				 }
			//}
				
			////////// booking////////////////
			//if(i.equalsIgnoreCase("no"))
			//{
				
				while(true)
				{
				System.out.println("Menu");
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
					
					//cus.viewdate();
					

					for(int k = 1;k <= regId;k++)
					{
						System.out.println(id[k] +"		"+cusname[k]);
					 
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
					System.out.println("Customers list");
					System.out.println("Customer ID 	Customer name");

					
					for(int k = 1;k <= regId;k++)
					{
						System.out.println(id[k] +"		"+cusname[k]);
					 
					}
					System.out.println("Thank You!!!");
					System.exit(0);
					
				
				}
				case 4:
					
					
				case 5:
				{
					System.out.println("View all bookings:");
					System.out.println("Enter the start date");
					startdate = Integer.parseInt(br.readLine());
					System.out.println("Enter the end date");
				    enddate = Integer.parseInt(br.readLine());
				    
				    System.out.println("The bookings made from "+ startdate +" to "+enddate +" are " );
				    
				    for(int p = 0;p <= enddate; p++)
				    {
				    	if((startdate <= datearr[p])&&(datearr[p] <= enddate))
				    	{
				    		System.out.println(datearr[p]);
				    		
				    	}
				    }
				    
				    
				}

				}
		}
		
			

	}}

	}