
    class Animal{  
        void eat()
        { 
        System.out.println("I can eat");
    }  
        }  
        class Cat extends Animal
        {  
        void sleep()
        {
            System.out.println("I can sleep");
        }  
        }  
        class Kitten extends Cat
        {  
        void sound()
        {
            System.out.println("meow");
        }  
        }  
        class Multlilevelinher {  
        public static void main(String args[])
        {  
        Kitten k=new Kitten();  
        k.sound();  
        k.sleep();
        k.eat();  
        }
    }  
        

