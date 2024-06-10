import java.util.ArrayList;

public class Inventory {
    private ArrayList<Car> inventory;
    
    //default constructor
    public Inventory() {
        inventory = new ArrayList<Car>();
    }
    //parameterized  constructor
    public Inventory(Car car) {
        inventory = new ArrayList<Car>();
        inventory.add(car);
    }
    // adds car to inventor
    public String addInventory(Car car) {
        try {
            inventory.add(car);
            return "Car Added";
        } catch (Exception e) {
            return "Car Not Added";
        }
    }
    // removes car from inventory
    public String removeInventory(Car car) {
        try {
        	inventory.remove(car);
            return "Car Removed";
        } catch (Exception e) {
            return "Car Not Found";
        }
    }
    
    //searches inventory by VIN 
    public String searchByVin(int vin) {
    	for (Car car : inventory) {
            try {
                if (car.getVIN() == vin) { 
                    return "Car Found"; 
                }
            } catch (Exception e) {
                return "Error"; 
            }
        }
        return "Car with VIN " + vin + " not found"; 
    }
    // updates a specific car by VIN
    public String updateByVin(int vin, String make, String model, String color, int year, int mileage) {
    	for (Car car : inventory) {
            try {
                if (car.getVIN() == vin) { 
                	car.updateCar(make, model, color, year, mileage, vin);
                    return "Car Updated"; 
                }
            } catch (Exception e) {
                return "Error"; 
            }
        }
        return "Car with VIN " + vin + " not found"; 
    	
    	
    }
    	
    // removes specific car based on VIN 
    public String removeByVin(int vin) {
        for (Car car : inventory) {
            try {
                if (car.getVIN() == vin) { 
                    inventory.remove(car); 
                    return "Car Removed"; 
                }
            } catch (Exception e) {
                return "Error: " + e.getMessage(); // Handle any exceptions
            }
        }
        return "Car with VIN " + vin + " not found"; // Car with specified VIN not found in inventory
    }
    //returns Car object given the VIN could possibly return a default car if car.getVIN() != vin
	public Car carByVin(int vin) {
		for (Car car : inventory) {
                if (car.getVIN() == vin) { 
                	return car;
                } 
                
        }
		return new Car();
    }
}
	
