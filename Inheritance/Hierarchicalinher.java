
class A{  
        void read() 
        {
            System.out.println("I am read");
    }  
        }  
        class B extends A
        { 

        void write()
        {
            System.out.println("I can write");}  
        }  
        class C extends A{  
        void listen()
        {
            System.out.println("I can listen");
        }  
        }  
        class Hierarchicalinher{  
        public static void main(String args[]){  
        C l=new C();  
        l.listen();  
        l.read();  
    
        //l.write(); //C.T.Error  
        }}  

