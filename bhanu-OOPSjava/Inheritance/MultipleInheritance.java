/*
Multi-level Inheritance: When a class extends a class, which extends anther class then this is called multilevel inheritance. 
For example class C extends class B and class B extends class A then this type of inheritance is 
known as multilevel inheritance.
*/

class Car{
   public Car() {
      System.out.println("Class Car");
   }
   public void vehicleType() {
      System.out.println("Vehicle Type: Car");
   }
}
class Benz extends Car{
   public Benz() {
      System.out.println("Class Benz");
   }
   public void brand() {
      System.out.println("Brand: Benz");
   }
   public void speed() {
      System.out.println("Max: 190Kmph");
   }
}
class BenzMSeries extends Benz{

   public BenzMSeries() {
      System.out.println("Benz Model: M5");
   }
   public void speed() {
      System.out.println("Max: 280Kmph");
   }
}

class MultilevelInheritance {
   
   // Testing Multi-level inheritance in main method
   public static void main(String[] args) {
      BenzMSeries carObject=new BenzMSeries();
      
      // BenzMSeries class invoked the Car class method
      carObject.vehicleType(); 
      // BenzMSeries class invoked the Benz class method
      carObject.brand(); 
      // BenzMSeries class invoked it's own method
      carObject.speed();
      
      /*
      OUTPUT :
      
      Class Car
      Class Benz
      Benz Model: M5
      Vehicle Type: Car
      Brand: Benz
      Max: 280Kmph
      */
      
   }
}