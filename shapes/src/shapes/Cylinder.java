package shapes;

public class Cylinder extends Shape{
	private double radius;
	private double surfaceArea;
	private double volume;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
		this.surfaceArea = calculateSurfaceArea();
		this.volume = calculateVolume();	
	}
	
	private double calculateSurfaceArea() {
		return ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
	}
	
	private double calculateVolume() {
		return  Math.PI * radius * radius * height;
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
		return "The cylinder's surface area is: " + surfaceArea + ". " + "The volume is: " + volume;
	}
}
