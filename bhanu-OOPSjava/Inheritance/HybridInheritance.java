/*
Hybrid Inheritance: The meaning of hybrid (mixture) is made of more than one thing. In Java, 
the hybrid inheritance is the composition of two or more types of inheritance. The main
purpose of using hybrid inheritance is to modularize the code into well-defined classes. 
It also provides the code reusability. 

The hybrid inheritance can be achieved by using the following combinations:

1)Single and Multiple Inheritance (not supported but can be achieved through interface)
2)Multilevel and Hierarchical Inheritance
3)Hierarchical and Single Inheritance
4)Multiple and Multilevel Inheritance

*/

// Creating interfaces
interface CompetitiveCoder {
   void competitive();
}
interface NormalCoder {
   void normal();
}

// Creating a Parent Class with a method greeting()
class Ninjas {
   void greeting() {
       System.out.println("Hello Ninja!!");
   }
}

// First child class 
class NinjaOne extends Ninjas implements NormalCoder {
   public void normal() {
       System.out.println("Hey, Ninja1 you can start with the normal coding.");
   }
}

// Second child class
class NinjaTwo extends Ninjas implements NormalCoder, CompetitiveCoder {
   public void normal() {
       System.out.println("Hey, Ninja2 first you should start with normal coding.");
   }
   public void competitive() {
       System.out.println("Hey, Ninja2 now you can start with competitive programming.");
   }
}
public class HybridInheritance {
    
    public static void main(String[] args) {
        // Calling methods for Ninja1
        NinjaOne ninjaOneObject=new NinjaOne();
        ninjaOneObject.greeting();
        ninjaOneObject.normal();
        
        System.out.println();
        
        // Calling methods for Ninja2
        NinjaTwo ninjaTwoObject=new NinjaTwo();
        ninjaTwoObject.greeting();
        ninjaTwoObject.normal();
        ninjaTwoObject.competitive();
   }
   /*
   OUTPUT : 
   Hello Ninja!!
   Hey, Ninja1 you can start with the normal coding.
   
   Hello Ninja!!
   Hey, Ninja2 first you should start with normal coding.
   Hey, Ninja2 now you can start with competitive programming.
    */
}