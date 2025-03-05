package activities;

public class Activity1 {
	
	public static void main(String[] args) {
        Car bmw = new Car();
        bmw.make = 2023;
        bmw.color = "Black";
        bmw.transmission = "Automatic";
    
        //Using Car class method
        bmw.displayCharacterstics();
        bmw.accelerate();
        bmw.brake();
    }

}
