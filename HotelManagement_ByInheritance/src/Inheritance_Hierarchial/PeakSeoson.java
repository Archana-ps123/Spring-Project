package Inheritance_Hierarchial;

public class PeakSeoson extends Booking {

	//int total = 0;

	public double roomBooking(int persons, int total_Days, double tariff, String roomType, int month ,int peakCharges) {
		double total = super.roomBooking(persons, total_Days, tariff, roomType) ;
	    return total * peakCharges;
		
	}

}
