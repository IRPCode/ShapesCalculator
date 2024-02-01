package shapes;

import java.util.Scanner;

public class ShapeArray {

	public static void main(String args[]) {
		shapes();
	}
	
	public static void shapes () {
	String userInput;
	String userInput2;	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Input a value for the sphere's radius.");
	userInput = scanner.nextLine();
	Sphere sphere = new Sphere(Double.parseDouble(userInput));
	
	System.out.println("Input a value for the Cylinder's radius.");
	userInput = scanner.nextLine();
	System.out.println("Input a value for the Cyldiner's height.");
	userInput2 = scanner.nextLine();
	Cylinder cylinder = new Cylinder(Double.parseDouble(userInput), Double.parseDouble(userInput2));
	
	System.out.println("Input a value for the Cone's radius.");
	userInput = scanner.nextLine();
	System.out.println("Input a value for the Cone's height.");
	userInput2 = scanner.nextLine();
	Cone cone = new Cone(Double.parseDouble(userInput), Double.parseDouble(userInput2));
	
	scanner.close();
	
	int x  = 0;
	Shape[] shapeArray = {sphere, cylinder, cone};
		while (x < 3) {
			Shape.main1(shapeArray[x], x, userInput, userInput2);
			x++;
		}
	}
	
}
