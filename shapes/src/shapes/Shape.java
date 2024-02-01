package shapes;

public abstract class Shape {
	
	public static void main1(Shape shape, int x, String userInput, String userInput2)
	{
		if (x == 0) {
			shape.surface_area(Double.parseDouble(userInput)); 
			System.out.println(shape.toString());
		}
		
		if (x == 1) {
			shape.surface_area(Double.parseDouble(userInput)); 
			System.out.println(shape.toString());
		}
		
		if (x == 2) {
			shape.surface_area(Double.parseDouble(userInput)); 
			System.out.println(shape.toString());
		}
	}
	
	abstract double surface_area(double radius);
	
	abstract double volume();
	
	@Override
	public String toString() {
		return "Shape";
	}
	
}

