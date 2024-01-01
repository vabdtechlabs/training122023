// Read-only class using encapsulation
// Example of encapsulation that has only setter methods.
class Person {

    // private data members
    private String name;

    private int age;

    //setter method for private data members

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args)
    {
        // person object created
        Person person = new Person();
        person.setName("Bhanu Prakash");
        person.setAge(21);

        /*
           System.out.println("Name: " + person.getName());
           System.out.println("Age: " + person.getAge());
           the above two lines throw an error since Read-only class
        */
    }
}