/*Parameterized Constructor:
 A constructor which has a specific number of parameters is called a parameterized constructor.
 */

class Parameterized
{
int id;
String name;
Parameterized (int i,String n)
{
   id =i;
   name=n;
}
void disply()
{
    System.out.println(id+" "+ name);
}
public static void main(String[] args) {
    Parameterized c= new Parameterized(101, "Siri");
     Parameterized d= new Parameterized(108, "Anu");
    c.disply();
    d.disply(); 
}




    
}
