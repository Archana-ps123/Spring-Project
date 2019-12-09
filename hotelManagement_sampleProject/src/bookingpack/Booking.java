package bookingpack;
import java.io.InputStreamReader;

import bookingpack.Room;
public class Booking {
	//Room rm = new Room();
	String ac;
    String co;
    String cable;
    String wifi;
    String laundry;
    
    
	    int acFee;
	    int coFee;
	    int cableFee;
	    int wifiFee;
	    int laundryFee;
	    int totalcharge = 0;


	    static int roomno=0;
	    Room rm = new Room();
	    static int[] dateArr = new int[50];
	    int d = 0;
	   static int[] bookedRoom = new int[50];

	   static int[] bookedDate = new int[50];

	   static int[] bookedId = new int[50];
	   // Room[] arrRoom = new Room[50];

		//static int i = 0;

static int[] booked = new int[25];
	public void booking(String ac, String co, String cable, String wifi, String laundry,  int date)
	{ 
		
	
		rm.setAc(ac);
	    rm.setCo(co);
	    rm.setCable(cable);
	    rm.setWifi(wifi);
	    rm.setLaundry(laundry);
	    rm.setDate(date);
	   // arrRoom[++i] = rm;
	    
	}
	
	
	    public void book(String ac,String co,String cable,String wifi,String laundry) {
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
	    

public void displaybook(){
	System.out.println("The total charge is Rs. "+ totalcharge);
	System.out.println("The services chosen are \n" + co + " cot " + ac + " room\n" + cable+"\n" + wifi+"\n" + laundry);
	
	}
static int i=0;
public int roomnum(int date,int regId) {
	roomno++;
	bookedId[i]= regId;
	bookedDate[i]=date;
	bookedRoom[i]=roomno;
	booked[roomno] = 1;
	i++;
	return roomno;
}


public boolean checkStatus(int roomId) {
		{
	    	 if(booked[roomId]==1) {
	    	 
	    	 return true;
	     }
	    	 else {

	    			return false;
	    	 }
	}
	
		
}



public void ViewBookings(int startDate, int endDate) {
	for(int j = 0; j <= roomno;j++)
    {

		if((startDate <= bookedDate[j]) && ( bookedDate[j] <= endDate)) 
               {

			
			System.out.println(bookedRoom[j]+"\t\t"+bookedId[j]);
               }
    }

//dateArr[d] = rm.getDate();

	//for(int i = 0;i <= endDate;i++)
	//{
		//if((startDate <= dateArr[roomno]) && (dateArr[roomno] <= endDate))
		//{
		//	System.out.println();
		//}
		
	//}
	
}
	
}