package week1_Tasks;

//Subclass of Car
public class ElectricCar extends Car {
	private int batteryRange;
    private static final String CHARGING_MESSAGE = "Battery is being charged for ";
    public ElectricCar(String brandName, String modelName, int yearOfManufacture, int batteryRange) {
        super(brandName, modelName, yearOfManufacture);
        this.batteryRange = batteryRange;
    }
    // Getter and setter for Battery range
    public int getBatteryRange() {
        return batteryRange;
    }
    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }
    //Method for charging the battery  
    public void chargeBattery() {
        System.out.println(CHARGING_MESSAGE + getBrandName() + " " + getModelName() + " (" + getYearOfManufacture() + ") " + "with battery range of " + batteryRange + ".");
    }
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Hyundai", "Venue", 2019, 500);
        myElectricCar.startEngine();
        myElectricCar.chargeBattery();
    }
}
