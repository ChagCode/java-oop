public class Rectangle {
  double length;
  double width;

  void setDimends(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double square() {
    return length * width;
  }
}
