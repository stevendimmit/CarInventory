
public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    private int vin;
	
    // default constructor 
	
	public Car() {
        this.make = "NONE";
        this.model = "NONE";
        this.color = "NONE";
        this.year = -1;
        this.mileage = -1;
        this.vin = -1;
	}
	
	// parameterized constructor
	
	public Car(String make, String model, String color, int year, int mileage, int vin) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.vin = vin;
    
	}
	
	
	// resets car data so will hopefully be garbage collected
	public String resetCar() {
	    try {
			this.make = "NONE";
	        this.model = "NONE";
	        this.color = "NONE";
	        this.year = -1;
	        this.mileage = -1;
	        this.vin = -1;
	        return "Car Removed";
	    }
	    catch (Exception e) {
	    	return "Car Not Removed";
	    }
	}
	
	// updates car info 
    public String updateCar(String make, String model, String color, int year, int mileage, int vin) { 
    	try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            this.vin  = vin;
            
            return "Car Updated";
    	}
        
    	catch (Exception e) {
    		return "Car Not Updated";
    	}
    }
    
	// getter for all info about car
	
	public String[] getCarInfo() {
		
		String[] info = new String[]{this.make, this.model, this.color, Integer.toString(this.year), Integer.toString(this.mileage), Integer.toString(this.vin)};
		for (int i = 0; i < 6; i++) {
			System.out.print(info[i] + " ");	
		}
		System.out.println();
		return info;
	}

    //Getter Methods
    
    public String getMake() {
    	return this.make;
    }
    public String getModel() {
    	return this.model;
    }
    public String getColor() {
    	return this.color;
    }
    public int getYear() {
    	return this.year;
    }
    public int getMileage() {
    	return this.mileage;
    }
    public int getVIN() {
    	return this.vin;
    }
	
    // Setter Methods
    
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void setVIN(int vin) {
    	this.vin = vin;
    }
    
}


