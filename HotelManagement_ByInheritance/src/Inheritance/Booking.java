package Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	private int persons;
	private int total_Days;
	private double tariff;
	private String roomType;
	double total;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void getDetails() throws NumberFormatException, IOException {
	  System.out.println("Enter the Number of persons");
	  setPersons(Integer.parseInt(br.readLine()));
	  System.out.println("Enter the Total number of days");
	  setTotal_Days(Integer.parseInt(br.readLine()));
	  System.out.println("Enter the Tariff per day");
	  setTariff(Double.parseDouble(br.readLine()));
	  System.out.println("Enter the Room Type");
	  setRoomType(br.readLine());
	  
		
	}
	
	
	
	
	
	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public int getTotal_Days() {
		return total_Days;
	}

	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}

	public double getTariff() {
		return tariff;
	}

	public void setTariff(double tariff) {
		this.tariff = tariff;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}





	public double roomBooking(int persons, int total_Days, double tariff, String RoomType ) {
		double total = persons * total_Days * tariff;
		
		return total;
		// TODO Auto-generated method stub
		
	}

}
