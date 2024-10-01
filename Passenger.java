package Ilagan_L7Activity1;

import java.util.Arrays;

public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateofBirth;
	public String [] passport;
	

	//public Passenger() {
		
	//}

	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		
		passenger.name = "Elaiza";
		passenger.gender = 'F';
		passenger.nationality = "Filipino";
		passenger.dateofBirth = "October 27, 2000";
		passenger.passport = new String [] {
				passenger.name, passenger.nationality, passenger.dateofBirth
		};
		
		System.out.println(passenger.name);
        System.out.println(passenger.gender);
        System.out.println(passenger.nationality);
        System.out.println(passenger.dateofBirth);
        System.out.println(Arrays.toString(passenger.passport));
	}
	
}

