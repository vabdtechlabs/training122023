/* In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. 
At the time of calling constructor, memory for the object is allocated in the memory.It is a special type of method which is
 used to initialize the object.Every time an object is created using the new() keyword, at least one constructor is called.
 Types of Constructor:
  1.Default Constructor
  2. parameterized Constructor
  
   1.Default Constructor:
   A constructor is called "Default Constructor" when it doesn't have any parameter.*/

public class Defaultconstructor {
    Defaultconstructor()
    {
        System.out.println("Siri is good");
    }
    public static void main(String[] args) {
        Defaultconstructor c=new Defaultconstructor();
        
    }

    
}
