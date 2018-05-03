package stqa.sandbox;

public class MainTest {

  public static void main(String[] args) {
    hello("Some text");

    Square square = new Square(5);
    System.out.println("Square root of square " + square.length + " is equal to " + square.area());

    Rectangle rectangle = new Rectangle(5, 6);
    System.out.println("Square root of rectangle " + rectangle.a + " " + rectangle.b + " is equal to " + rectangle.area());

    Point p1 = new Point(10, 15);
    Point p2 = new Point(15, 30);

    System.out.println("Distance between " + p1.x + " " + p1.y + " and " + p2.x + " " + p2.y + " is " + p1.distance() + " and " + p2.distance());
  }

  public static void hello(String somebody) {
    System.out.println("System is configured " + "to " + somebody);
  }


}