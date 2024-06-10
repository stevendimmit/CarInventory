import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Scanner scanner = new Scanner(System.in);
		// loops thru 4 questions to allow user to interact with Car class
		while (true) {
			//Asks user if they want to add a new car
			
			System.out.println("Do you want to add a new car? (Y/N)");
			
			if (scanner.next().equals("Y")) {
		         try {  
					System.out.println("Enter make:");
		            String make = scanner.next();
		            System.out.println("Enter model:");
		            String model = scanner.next();
		            System.out.println("Enter color:");
		            String color = scanner.next();
		            System.out.println("Enter year:");
		            int year = scanner.nextInt();
		            System.out.println("Enter mileage:");
		            int miles = scanner.nextInt();
		            System.out.println("Enter VIN:");
		            int vin = scanner.nextInt();
		            
		            Car newCar = new Car(make, model, color, year, miles, vin);
		            String message4 = inventory.addInventory(newCar);
		            newCar.getCarInfo();
		            System.out.println(message4);
		            
		           
		         } catch (Exception e) {
		             System.out.println("Invalid input. Car not added. Restarting");
		             scanner.nextLine(); // Clear scanner buffer
		             continue;
		         }
			}
		         // Prompts user to remove car from inventory based on VIN
			System.out.println("Do you want to remove a car from inventory? (Y/N)");
			if (scanner.next().equals("Y")) {
				System.out.println("Enter VIN:");
				String message = inventory.removeByVin(scanner.nextInt());
				System.out.println(message);		        	 	
			}
			// Prompts user to update a car based on VIN
			System.out.println("Do you want to update vehicle? (Y/N)");
			if (scanner.next().equals("Y")) {
				System.out.println("Enter VIN");
				String message = inventory.searchByVin(scanner.nextInt());
				System.out.println(message);
				System.out.println("Enter new data:");
				try {  
					System.out.println("Enter make:");
					String make = scanner.next();
					System.out.println("Enter model:");
					String model = scanner.next();
					System.out.println("Enter color:");
					String color = scanner.next();
					System.out.println("Enter year:");
					int year = scanner.nextInt();
					System.out.println("Enter mileage:");
					int miles = scanner.nextInt();
					System.out.println("Enter VIN:");
					int vin = scanner.nextInt();

					String message1 = inventory.updateByVin(vin, make, model, color, year, miles);
					
					
					System.out.println(message1);
					

				} catch (Exception e) {
					System.out.println("Invalid input. Please enter valid data. Restarting, Car not updated");
					scanner.nextLine(); // Clear scanner buffer
					continue;
				}
			}
			// Prompt user to write car info to file based on VIN

			System.out.println("Do you want to write a vehicle to file? (Y/N)");
			if (scanner.next().equals("Y")) {
				System.out.println("Enter VIN");
				int vin1 = scanner.nextInt();
				String message2 = inventory.searchByVin(vin1);
				if (message2.equals("Car Found")) {
					carToFile(inventory.carByVin(vin1));

				}
			}

		}

	}
	// writes car info to filePath 
	
	public static void carToFile(Car car) {
	    String filePath = "/Users/daviddimmit/Desktop/car2.txt"; // CHANGE IF NEEDED

	    try (FileOutputStream fos = new FileOutputStream(filePath);
	         PrintWriter pw = new PrintWriter(fos)) {

	        // Write car information to the file
	        pw.println("Make: " + car.getMake());
	        pw.println("Model: " + car.getModel());
	        pw.println("Color: " + car.getColor());
	        pw.println("Year: " + car.getYear());
	        pw.println("Mileage: " + car.getMileage());
	        pw.println("VIN: " + car.getVIN());

	        System.out.println("Car information has been written to the file successfully.");
	    } catch (IOException e) {
	        System.out.println("Error writing to file: " + e.getMessage());
	    }
	}
}
		        	 		
		        	 	        
		        	 	 
		        	 
		         
		       
		         
	         
	            
            
               
        
	

	
