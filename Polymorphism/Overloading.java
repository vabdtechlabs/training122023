/*Overloading:
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 */



class Vechicle{
    void run()
    {
        System.out.println("Vechicle is runing");
    }

    }

 class Bike extends Vechicle{
    void run()
    {
        System.out.println("bick is runing");
    }
 }
class Overloading {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
    }
    
    
}