/* Overriding:
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java. */

class Overriding{  
    public int sum(int a, int b) {  
        return a + b;  
    }  
    public double sum(double a, double b) {  
        return a + b;  
    }  
    public static void main(String[] args) {  
        Overriding calc = new Overriding();  
        int sum1 = calc.sum(5, 10);  
        System.out.println("Sum of 5 and 10 (integers): " + sum1);  
        double sum2 = calc.sum(2.5, 3.7);  
        System.out.println("Sum of 2.5 and 3.7 (doubles): " + sum2);  
    }  
}  
