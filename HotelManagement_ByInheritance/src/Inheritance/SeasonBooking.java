package Inheritance;

public class SeasonBooking extends Booking{
 
	public double roomBooking(int persons, int total_Days, double tariff, String RoomType) {
		return super.roomBooking(total_Days, total_Days, tariff, RoomType);
		
	}
	

}
