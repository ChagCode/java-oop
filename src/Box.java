public class Box {
  // class - шаблон, на который ссылается объет
  double length;
  double width;
  double height;

  void setDimens(double length, double width, double height) {
    // обращаемся к переменной экземпляра через this
    this.length = length;
    this.width = width;
    this.height = height;
  }

  double getVolume() {
    return length * width * height;
  }
  void showVolume() {
    System.out.println("length " + length + " width " + width + " height " + height);
  }
}
