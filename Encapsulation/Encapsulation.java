/*Encapsulation is a mechanism that allows us to bind data and functions of a class into an entity. It protects data and functions from outside interference .
 Therefore, it also provides security. A class is the best example of encapsulation */




class anu
{
   
        private String Name;

        public void setName(String name) {
            this.Name =name;
        }

        public String getName() {
            return Name;
        }
   
}
class Encapsulation{
    public static void main(String[] args) {
        anu a=new anu();
        a.setName("siri");
        System.out.println(a.getName());
    }
}