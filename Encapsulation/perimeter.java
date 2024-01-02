class Perimeter 
{
 int length;
  int breadth;
  Perimeter(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public void getPerimeter() {
    int perimeter= 2*(length +breadth);
    System.out.println("perimeter: " + perimeter);
  }
}

class Main {
  public static void main(String[] args) {

   
    Perimeter rectangle = new Perimeter(5, 6);
    rectangle.getPerimeter();
  }
}