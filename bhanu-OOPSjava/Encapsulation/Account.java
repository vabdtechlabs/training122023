/*
Encapsulation : Encapsulation in java refers to bundling of data and methods
                                that operates on that data within a single unit ,which is
                                called a class in java.

Advantages :
1)By providing only a setter or getter method, you can make the class read-only
  or write-only.In other words, you can skip the getter or setter methods.

2)Control over the data.Suppose you want to set the  value of data member which
  is positive number only, you can write the logic not to store negative values
  using setters.

3)key benifit of encapsulation is data hiding.Attributes and logical implementation
  of methods we can hide using acces modifiers ( private and protected).

*/
// Example of encapsulation that has only four fields with its setter and getter methods.

class Account{
        // private data members
        private long accountNumber;

        private String name;

        private String email;

        private float amount;

        //public getters and setter methods
        public long getAccountNumber() {
                return accountNumber;
        }

        public void setAccountNumber(long accountNumber) {
                this.accountNumber = accountNumber;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public float getAmount() {
                return amount;
        }

        public void setAmount(float amount) {
                this.amount = amount;
        }

        //  Testing the encapsulated Accont class in main method
        public static void main(String[] args) {

                // Creating instance of Account class

                Account accountObject = new Account();

                // setting values through setter methods
                accountObject.setAccountNumber(7560504000L);

                accountObject.setName("Bhanu Prakash");

                accountObject.setEmail("bhanuprakash@gmail.com");

                accountObject.setAmount(500000f);

        //getting values through getter methods
        System.out.println("Account Number : "+accountObject.getAccountNumber());
        System.out.println("Name : "+accountObject.getName());
        System.out.println("Email : "+accountObject.getEmail());
        System.out.println("Ammount : "+accountObject.getAmount());

        /*
        OUTPUT :

        Account Number : 7560504000
        Name : Bhanu Prakash
        Email : bhanuprakash@gmail.com
        Ammount : 500000.0
        */
        }

};
