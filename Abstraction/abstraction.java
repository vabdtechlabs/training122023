/*Abstraction
The concept allows us to hide the implementation from the user but shows only essential information to the user.
 Using the concept developer can easily make changes and added over time.What is Object-Oriented Programming*/

abstract class Animal{
    public abstract void  animalThings();
    public void eat(){
        System.out.println("I can eat");
    }
}
class Cat extends Animal{
    public void animalThings()
    {
        System.out.println("I can sleep");
    }
}
class Abstraction {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.animalThings();
        c.eat();
    }
}