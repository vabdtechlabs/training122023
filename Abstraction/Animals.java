abstract class Animals { 
    private String name; 
  
    public Animals(String name)
     {
         this.name = name; 
    } 
  
    public abstract void makeSound(); 
  
    public String getName() 
    {
         return name; 
} 
} 
  

class Dog extends Animals { 
    public Dog(String name) 
    { 
        super(name);
     } 
  
    public void makeSound() 
    { 
        System.out.println(getName() + " barks"); 
    } 
} 