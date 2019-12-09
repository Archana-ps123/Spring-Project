package Inheritance;

import java.io.IOException;

public class Main {


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		SeasonBooking bo = new SeasonBooking();
		bo.getDetails();
		System.out.println("Total Tariff: "+bo.roomBooking(bo.getPersons(),bo.getTotal_Days(),bo.getTariff(),bo.getRoomType()));
		
	}

}
