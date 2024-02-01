package shapes;

public class Cone extends Shape{
	private double radius;
	private double surfaceArea;
	private double volume;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
		this.surfaceArea = calculateSurfaceArea();
		this.volume = calculateVolume();	
	}
	
	private double calculateSurfaceArea() {
		return(Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius)));
	}
	
	private double calculateVolume() {
		return (Math.PI * radius * radius * height) / 3.0; 
	}
	
	 @Override
	    double surface_area(double radius) {
	        return surfaceArea;
	    }

	    @Override
	    double volume() {
	        return volume;
	    }
	@Override
	public String toString() {
		return "The cone's surface area is: " + surfaceArea + ". " + "The volume is: " + volume;
	}
}