// Read-only class using encapsulation
// Example of encapsulation that has only getter methods.
public class Student {

        // private data members
        private String name = "bhanu";

        private int rollNumber = 21;

        private String college = "lovely professional university";

        //getter method for private data members
        public String getName() {
                return name;
        }

        public int getRollNumber() {
                return rollNumber;
        }

        public String getCollege() {
                return college;
        }

        //Testing the encapsulated Student class in main method
        public static void main(String[] args) {

                //Creating instance of Student class
                Student studentObject = new Student();

                //getting values through getter methods
                System.out.println("Name : "+studentObject.getName());
                System.out.println("Roll Number : "+studentObject.getRollNumber());
                System.out.println("College : "+studentObject.getCollege());


                //studentObject.setCollege("KITE"); --> will render compile time error
                /*
                OUTPUT :

                Name : bhanu
                Roll Number : 21
                College : lovely professional university
                */
        }
}