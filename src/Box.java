public class Box {
  // class - шаблон, на который ссылается объет
  double length;
  double width;
  double height;

  Box(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  Box() {
    this(10);
  }

  Box(double size) {
    this(size, size, size);
  }

  double getVolume() {
    return length * width * height;
  }

  void showVolume() {
    System.out.println("length " + length + " width " + width + " height " + height);
  }

  void setDimens(double length, double width, double height) {
    // обращаемся к переменной экземпляра через this
    this.length = length;
    this.width = width;
    this.height = height;
  }

  int compare(Box another) {
    double currentVolume = getVolume();
    double anotherVolume = another.getVolume();
    if (currentVolume > anotherVolume) {
      return 1;
    } else if (currentVolume < anotherVolume) {
      return -1;
    } else {
      return 0;
    }
  }
}
