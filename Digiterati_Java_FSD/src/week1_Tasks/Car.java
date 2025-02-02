package week1_Tasks;

public class Car {
    private static final String ENGINE_START_MESSAGE = "Engine has started for ";
    private String brandName;
    private String modelName;
    private int yearOfManufacture;
    // Constructor to initialize attributes
    public Car(String brandName, String modelName, int yearOfManufacture) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.yearOfManufacture = yearOfManufacture;
    }
    // Getter and setter for brand name
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    // Getter and setter for model name
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    // Getter and setter for manufacture year
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public void setYearOfManufacture(int yearOfManufacture) {
            this.yearOfManufacture = yearOfManufacture;
    }
    // Method for starting the car engine
    public void startEngine() {
        System.out.println(ENGINE_START_MESSAGE + brandName + " " + modelName + " [" + yearOfManufacture + "].");
    }
    public static void main(String[] args) {
        Car car = new Car("Hyundai", "Venue", 2019);
        car.startEngine();
    }
}
