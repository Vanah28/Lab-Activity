import java.util.*;
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;
 
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }
 
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    public String getFuelType() {
        return fuelType;
    }
     
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + "Km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
 
class Car extends Vehicle {
    private int numDoors;
 
    public Car(String brand, int speed, String fuelType, int carDoors) {
        super(brand, speed, fuelType);
        this.numDoors = carDoors;
    }
 
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}
 
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
 
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }
 
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
 
public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Get car details
        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
 
        System.out.print("Speed(KM): ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        System.out.print("Fuel Type: ");
        String carFueltype = scanner.nextLine();
 
        System.out.print("Number of doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        // Get motorcycle details
        System.out.println("\nEnter Motorcycle detail:");
        System.out.print("Brand: ");
        String motorBrand = scanner.nextLine();
 
        System.out.print("Speed(KM): ");
        int motorSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
 
        System.out.print("Fuel Type: ");
        String motorFueltype = scanner.nextLine();
 
        System.out.print("Has Sidecar (true/false): ");
        boolean motorSidecar = scanner.nextBoolean();
 
        // Create objects
        Car myCar = new Car(carBrand, carSpeed, carFueltype, carDoors);
        Motorcycle myBike = new Motorcycle(motorBrand, motorSpeed, motorFueltype, motorSidecar);
 
        // Display information
        System.out.println("\nCar Information:");
        myCar.displayInfo();
       
        System.out.println("\nMotorcycle Information:");
        myBike.displayInfo();
 
        scanner.close();
    }
}