/*
Inheritance : Inheritance in java is a mechanism in which one object can acquire 
			  all the properties (data members) and behaviour (methods) of a parent
			  class.The idea behind inheritance in java is that we can create new 
			  classes that are built upon existing classes.When you inherit frome an
			  existing class, you can reuse the methods and fields in parent class.
Advantages:
1) Method overriding (so runtime polymorphism can be achieved).
2) Code Reusability.

Terms used in inheritance:
Sub Class : A sub-class is a class which inherit the other class.Also know as derived
			class or child class.
			
Super Class : A super-class is a class from where subclasses inherit the features.Also
			  Known as base class or parent class.
			  
Extend Keyword : Extend keyword indicates that you are making new class that derives 
				 from existing class.The meaning of Extend is to increase functionality.
Types of Inheritance:
1) Single Inheritance
2) Multilevel Inheritance
3) Hierarchical Inheritance
4) Multiple Inheritance
5) Hybrid Inheritance

*/
// Example of Inheritance

class Animal {

	private boolean vegetarian;

	private String eats;

	private int noOfLegs;

	public Animal(){}

	public Animal(boolean veg, String food, int legs){
		this.vegetarian = veg;
		this.eats = food;
		this.noOfLegs = legs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}

class Cat extends Animal{

	private String color;

	public Cat(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.color="White";
	}

	public Cat(boolean veg, String food, int legs, String color){
		super(veg, food, legs);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

class Inheritance {
	
	// Testing Inheritance in main method
	public static void main(String[] args) {
		
		Cat catObject = new Cat(false, "milk", 4, "black");

		System.out.println("Cat is Vegetarian?" + catObject.isVegetarian());
		System.out.println("Cat drink " + catObject.getEats());
		System.out.println("Cat has " + catObject.getNoOfLegs() + " legs.");
		System.out.println("Cat color is " + catObject.getColor());
		
		/*
		OUTPUT : 
		Cat is Vegetarian?false
		Cat drink milk
		Cat has 4 legs.
		Cat color is black
		*/
	}
}  