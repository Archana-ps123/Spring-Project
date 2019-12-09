package Inheritance_Hierarchial;

public class LeanSeoson extends Booking {
	
	public double roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,int discount) 
	{
		
		double total = super.roomBooking(persons, total_Days, tariff, roomType);
	    return total - (total * (discount / 100.0));
		

}
}
