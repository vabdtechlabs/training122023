/*
Abstraction : Data abstraction is the process of hiding certain details and showing only 
essential information to the user.Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class:Abstract class is a restricted class that cannot be used to create objects.To 
access it, it must be inherited from another class.

Abstract method: Method that can only be used in an abstract class, and it does not have a body. 
				The body is provided by the subclass (inherited from).
*/
				
// Example for abstraction 
abstract class Shape { 
	String color; 

	// these are abstract methods 
	abstract double area();
	 
	public abstract String toString(); 

	// abstract class can have the constructor 
	public Shape(String color) { 
		
		System.out.println("Shape constructor called"); 
		this.color = color; 
	} 

	// this is a concrete method 
	public String getColor() { 
		return color; 
	} 
} 
class Circle extends Shape { 
	double radius; 

	public Circle(String color, double radius) { 

		// calling Shape constructor 
		super(color); 
		System.out.println("Circle constructor called"); 
		this.radius = radius; 
	} 

	@Override double area() { 
		return Math.PI * Math.pow(radius, 2); 
	} 

	@Override public String toString() { 
		return "Circle color is " + super.getColor() + "and area is : " + area(); 
	} 
} 
class Rectangle extends Shape { 

	double length; 
	double width; 

	public Rectangle(String color, double length, double width) { 
		// calling Shape constructor 
		super(color); 
		System.out.println("Rectangle constructor called"); 
		this.length = length; 
		this.width = width; 
	} 

	@Override double area() { 
		return length * width; 
	} 

	@Override public String toString() { 
		return "Rectangle color is " + super.getColor() + "and area is : " + area(); 
	} 
} 
public class AbstractionOne { 
	
	// Testing Abstraction in main method
	public static void main(String[] args) 
	{ 
		Shape shapeOne = new Circle("Red", 2.2); 
		Shape shapeTwo = new Rectangle("Yellow", 2, 4); 

		System.out.println(shapeOne.toString()); 
		System.out.println(shapeTwo.toString()); 
	} 
	/*
	OUTPUT :
	
	Shape constructor called
	Circle constructor called
	Shape constructor called
	Rectangle constructor called
	Circle color is Redand area is : 15.205308443374602
	Rectangle color is Yellowand area is : 8.0
	*/
}
