/*
Data Abstraction (using Interface)

Interface : Interfaces are another method of implementing abstraction in Java. The key difference is that, 
by using interfaces, we can achieve 100% abstraction in Java classes. In Java or any other 
language, interfaces include both methods and variables but lack a method body. Apart from abstraction, 
interfaces can also be used to implement interfaces in Java.

Note : To implement an interface we use the keyword “implements” with class.

*/


// Define an interface named Shape 
interface Shape { 
	// Abstract method for calculating the area 
	double calculateArea();
} 

// Implement the interface in a class named Circle 
class Circle implements Shape { 
	
	private double radius; 

	// Constructor for Circle 
	public Circle(double radius) { 
		this.radius = radius; 
	} 

	// Implementing the abstract method from the Shape interface 
	public double calculateArea() { 
		return Math.PI * radius * radius; 
	} 
} 

// Implement the interface in a class named Rectangle 
class Rectangle implements Shape { 
	
	private double length; 
	private double width; 

	// Constructor for Rectangle 
	public Rectangle(double length, double width) { 
		this.length = length; 
		this.width = width; 
	} 

	// Implementing the abstract method from the Shape interface 
	public double calculateArea() { 
		return length * width; 
	} 
} 


public class AbstractionTwo { 
	
	// Testing Abstraction that is implemented using Abstraction
	public static void main(String[] args) 
	{ 
		// Creating instances of Circle and Rectangle 
		Circle circleObject = new Circle(5.0); 
		Rectangle rectangleObject = new Rectangle(4.0, 6.0); 

		// Calculating and printing the areas 
		System.out.println("Area of Circle : "+ circleObject.calculateArea()); 
		System.out.println("Area of Rectangle : "+ rectangleObject.calculateArea()); 
	} 
	/*
	OUTPUT :
	
	Area of Circle : 78.53981633974483
	Area of Rectangle : 24.0
	*/
}
