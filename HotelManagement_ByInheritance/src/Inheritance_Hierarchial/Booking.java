package Inheritance_Hierarchial;

public class Booking {
	private int persons;
	private int total_Days;
	private double tariff;
	private String roomType;
	double total;

	public int getPersons() {
		return persons;
		
	}
	public int setPersons(int persons) {
		return this.persons = persons;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public int setTotal_Days(int total_Days) {
		return this.total_Days = total_Days;
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
	public String setRoomType(String roomType) {
		return this.roomType = roomType;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	


	public double roomBooking(int persons, int total_Days, double tariff, String RoomType ) {
		double total = persons * total_Days * tariff;
		return total;
		}
	}
