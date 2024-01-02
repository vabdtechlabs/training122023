/*he concept allows us to inherit or acquire the properties of an existing class (parent class) into a newly created class (child class).
 It is known as inheritance. It provides code reusability. 
 Types of inheritance:
 1.Single Inheritance
 2.Multi-level Inheritance
 3.Hierarchical Inheritance*/

class Animal{
     void eat()
     {
        System.out.println("i can eat");
     }
    }
class Dog extends Animal {
void sleep()
{
System.out.println("i can sleep");
}
}
class Inheritance{
    public static void main(String args[]) {
{
Dog d=new Dog();
d.sleep();
d.eat();
}
    }
}

