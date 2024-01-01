/*
Single Inheritance : The inheritance in which a single derived class is inherited from a 
						single base class is known as the Single Inheritance
*/
//Example for the Single Inheritance in java
						
class Employee {
	
    float salary;

    Employee(){
        this.salary = 50000;
    }

}

class Programmer extends Employee{

    float bonus;

    Programmer(){
        this.bonus = 2000;
    }

    float getTotalSalary(float basicSalary, float bonus) {
        return basicSalary + bonus;
    }

}

class SingleInheritance {
	
	// Testing Single Inheritance in main method
	public static void main(String[] args) {
		
        Programmer programmerObject = new Programmer();
        float totalSalary = programmerObject.getTotalSalary(programmerObject.salary, programmerObject.bonus);
        System.out.println("Total salary for you programmer :: "+totalSalary);
        
    }
    
    // OUTPUT : Total salary for you programmer :: 52000.0
	
}