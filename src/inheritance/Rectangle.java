package inheritance;

public class Rectangle extends Shape {
  public Rectangle(int a, int b) {
    super(a, b);
  }

  @Override
  public int getPerimeter() {
    return (getA() + getB()) * 2;
  }
}
