 class Students {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public int getAge() {
       return age;
    }
    public String getfirstName() {
       return firstName;
    }
    public String getlastName() {
       return lastName;
    }

    public String getId() {
       return id;
    }
    public void setAge( int newAge) {
       age = newAge;
    }
    public void setfirstName(String newfirstName) {
       firstName = newfirstName;
    }
    public void setlastName(String newlastName) {
       lastName = newlastName;
    }
    public void setIdNum( String newId) {
       id = newId;
    }
 }
 class Student
 {
public static void main(String []args)
{
    Students s=new Students();
    s.setfirstName("pydi");
    s.setlastName("siri");
    s.setIdNum("508");
    s.setAge(23);
    System.out.println(s.getfirstName());
    System.out.println(s.getlastName());
    System.out.println(s.getId());
    System.out.println(s.getAge());
}
 }
