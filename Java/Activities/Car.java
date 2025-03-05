package activities;

public class Car {
    //Class Member Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
	
    //Constructor
    Car() {
	tyres = 4;
	doors = 4;
    }

    //Class Methods
    public void displayCharacterstics(){
	System.out.println("Color of the Car: " + color);
	System.out.println("Car is made in the year: " + make);
	System.out.println("Transmission type: " + transmission);
	System.out.println("Number of doors: " + doors);
    	System.out.println("Number of tyres: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car moves forward");
    }
	
    public void brake() {
	System.out.println("Car stops");
    }
}