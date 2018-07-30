
public class Circle {
	double radius = 0;
	double circumference = 0;
	double area = 0;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	private String formatNumber(double x) {
		String format = String.format("%.2f", x);
		
		
		return format;
	}
	
	public double getCircumference() {
		circumference = 2*Math.PI*radius;
		
		return circumference;
	}
	public String getFormattedCircumference() {
		String fCircum = formatNumber(getCircumference());
		
		return fCircum;
	}
	
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	public String getFormattedArea() {
		String area = formatNumber(getArea());
		
		return area;
	}
}
