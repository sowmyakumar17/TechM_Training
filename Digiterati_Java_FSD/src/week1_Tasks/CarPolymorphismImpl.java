package week1_Tasks;

public class CarPolymorphismImpl {
	 public static void main(String[] args) {
		 Car[] mycar = new Car[3];
		 mycar[0] = new Car("Hyundai", "Venue", 2019);
	     mycar[1] = new Car("Mahindra", "Thar", 2024);
	     mycar[2] = new ElectricCar("Tata", "Punch EV", 2024, 600);
	     for (Car car : mycar) {
	    	 car.startEngine();
	     }
	 }
}
