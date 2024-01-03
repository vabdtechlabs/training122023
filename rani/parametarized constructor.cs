class con
{

    String name;
    int id;

    
    con(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
   
    public static void Main()
    {

       
        con con1 = new con("me", 1);
        Console.WriteLine("conName = " + con1.name +
                         " and conId = " + con1.id);
    }
}