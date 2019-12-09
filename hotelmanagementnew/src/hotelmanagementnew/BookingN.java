package hotelmanagementnew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookingN {
	String ac;
    String co;
    String cable;
    String wifi;
    String laundry;
    int date;
    int startdate;
    int enddate;
    static int roomno=0;
    
    int acFee;
    int coFee;
    int cableFee;
    int wifiFee;
    int laundryFee;
    int totalcharge = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    void Book(String ac,String co,String cable,String wifi,String laundry) {
    if(ac.equals("AC"))
    {
    	 acFee = 1000;
    	 this.ac="AC";
    	}
    else if(ac.equals("nAC"))
    {
    	 acFee = 750;
    	 this.ac="non AC";
 }

    if(co.equals("single"))
    {
    	coFee = 0;
    }
    else if(co.equals("double"))
    {
    	coFee = 350;
    }
    if(cable.equals("c"))
    {
    	cableFee = 50;
    	this.cable = "Cable Connection Enabled";
    }
    else if(cable.equals("nc"))
    {
    	cableFee = 0;
    	this.cable = "Cable connection are Not Enabled";
    }
    if(wifi.equals("w"))
    {
    	wifiFee = 200;
    	this.wifi = "WI-FI enabled";
    }
    else if(wifi.equals("nw"))
    {
    	wifiFee = 0;
    	this.wifi = "WI-FI Not Enabled";
    }
    if(laundry.equals("l"))
    {
    	laundryFee = 100;
    	this.laundry = "With laundry Service";
    }
    else if(laundry.equals("nl"))
    {
    	laundryFee = 0;
    	this.laundry = "Without laundry Service";
    }
    

    totalcharge = acFee + coFee+ cableFee + wifiFee + laundryFee;
     
}
void displaybook(){
	System.out.println("The total charge is Rs. "+ totalcharge);
	System.out.println("The services chosen are \n" + co + " cot " + ac + " room\n" + cable+"\n" + wifi+"\n" + laundry);
	
}
int roomnum() {
	roomno++;
	booked[roomno] = 1;
	return roomno;
}
static int[] booked = new int[25];
     boolean checkStatus(int room)
     {
    	 if(booked[room]==1) {
    	 
    	 return true;
     }
    	 else {
    		 return false;
    	 }
    	
    	
    	 
    	 
}
	public void checkdate()  {
		
		
		
	}
}
