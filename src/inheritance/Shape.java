package inheritance;

public class Shape {
  private int a;
  private int b;

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public Shape(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getPerimeter() {
    return 0;
  }
}
