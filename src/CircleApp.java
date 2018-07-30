import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inputRadius = 0;
		String inputCont = "y";

		while (inputCont.equalsIgnoreCase("y")) {
			// Validator.getDouble(scan, "Please enter the radius...")
			inputRadius = Validator.getDouble(scan, "Please enter a radius, greater than 0...\n", 0, 9999999);

			Circle circle = new Circle(inputRadius);
			circle.getFormattedCircumference();
			System.out.println("Circumference: " + circle.getFormattedCircumference());
			System.out.println("Area: " + circle.getFormattedArea());
			
			inputCont = Validator.getString(scan, "Would you like to continue? y/n\n");
		}
		
		System.out.println("Peace Out!");
	}
}
