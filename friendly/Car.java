package friendly;

import Examples.Ford;
import Examples.Toyota;

public class Car {

	
	public static void main (String args[]){
		
		Car wheels = new Car();
		int w = wheels.getNoofWheels();
		
		Car toyota = new Toyota();
		double d = toyota.getMileage();
		String s = toyota.getVehicleType();
		
		System.out.println("Toyota gives mileage of " + d + " and it is a " + s + " with " + w + " wheels.");
		
		Car ford = new Ford();
		double p = ford.getMileage();
		String q = ford.getVehicleType();
		
		System.out.println("Ford gives mileage of " + p + " and it is a " + q + " with " + w + " wheels.");
		
	
	}
	/**
	 * @param args
	 */
		
		public double getMileage()
		{
			return 27;
		}
		
		public int getNoofWheels()
		{
			return 4;
		}
		
		public String getVehicleType()
		{
			return "sedan and hatchback";
		}

	

}
