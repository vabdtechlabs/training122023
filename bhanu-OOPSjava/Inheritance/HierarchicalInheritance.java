/*
Hierarchical Inheritance:One superclass and a number of subclasses are included in Java’s 
hierarchy of inheritance. There must be at least two subclasses for inheritance to take 
place. When a superclass and numerous subclasses that will inherit from it exist, inheritance can function.
*/
// Example for Hierarchical Inheritance in java 

//parent class
class Employee {
	double salary = 30000;
	
	double displaySalary() {
		return salary;
	}
}

// first child class
class FullTimeEmployee extends Employee{
	double hike = 0.50;
	void incrementSalary() {
		salary = salary + (salary * hike);
	}
}

// second child class
class InternEmployee extends Employee{
	double hike = 0.25;
	void incrementSalary() {
		salary = salary + (salary * hike);
	}
}


class HierarchicalInheritance {
	
	public static void main(String[] args) {
		// creating instance of FullTimeEmployee
		FullTimeEmployee employeeOne = new FullTimeEmployee();
		InternEmployee employeeTwo = new InternEmployee();
		
		System.out.println("Salary of a full-time employee before incrementing : "+employeeOne.displaySalary());
		
		System.out.println("Salary of an intern before incrementing : "+employeeTwo.displaySalary());
		
		// salary incremented by invoking own methods
		employeeOne.incrementSalary();
		employeeTwo.incrementSalary();
		
		System.out.println("Salary of a full-time employee after incrementing : "+employeeOne.displaySalary());
		System.out.println("Salary of an intern after incrementing : "+employeeTwo.displaySalary());
	}
	/* 
	OUTPUT:
	
	Salary of a full-time employee before incrementing : 30000.0
	Salary of an intern before incrementing : 30000.0
	Salary of a full-time employee after incrementing : 45000.0
	Salary of an intern after incrementing : 37500.0
	*/
}