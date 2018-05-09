package stqa.sandbox;

public class Point {
  double x;
  double y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public double distance() {
    double difference = this.x + this.y;
    return difference;
  }

}