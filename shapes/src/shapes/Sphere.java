package shapes;

public class Sphere extends Shape{
	private double radius;
	private double surfaceArea;
	private double volume;
	
	public Sphere(double radius) {
		this.radius = radius;
		this.surfaceArea = calculateSurfaceArea();
		this.volume = calculateVolume();	
	}
	
	private double calculateSurfaceArea() {
		return 4 * Math.PI * radius * radius;
	}
	
	private double calculateVolume() {
		return (4.0/3.0) * Math.PI * radius * radius * radius;
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
		return "The sphere's surface area is: " + surfaceArea + ". " + "The volume is: " + volume;
	}
}
