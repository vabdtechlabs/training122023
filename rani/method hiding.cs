class Person
{
    public virtual void Greet()
    {
        Console.WriteLine("Hi! I am a bhavani.");
    }
}

class Employee : Person
{
    public override void Greet()
    {
        Console.WriteLine("Hello! I am an employee.");
    }
}
class Program
{
    public static void Main()
    {
        Person p1 = new Person();
        p1.Greet();


        Employee emp = new Employee();
        emp.Greet();
    }
}